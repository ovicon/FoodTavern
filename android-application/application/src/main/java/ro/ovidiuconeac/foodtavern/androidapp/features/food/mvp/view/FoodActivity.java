package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ro.ovidiuconeac.foodtavern.androidapp.R;
import ro.ovidiuconeac.foodtavern.androidapp.features.common.Cache;
import ro.ovidiuconeac.foodtavern.androidapp.features.common.Presenter;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.presenter.FoodPresenter;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.presenter.FoodPresenterImpl;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view.dialogs.AddNewDialogFragment;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view.dialogs.CheesesDialogFragment;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view.dialogs.FruitsDialogFragment;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view.dialogs.SweetsDialogFragment;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.rest.RestServiceApi;


public class FoodActivity extends AppCompatActivity implements FoodView {

    // Server
    @BindView(R.id.server_connection)
    EditText serverConnection;

    // Fruit
    @BindView(R.id.progressBarFruit)
    ProgressBar progressBarFruit;
    @BindView(R.id.fruit)
    EditText fruit;
    @BindView(R.id.get_fruit)
    Button getFruit;
    @BindView(R.id.progressBarAllFruits)
    ProgressBar progressBarAllFruits;
    @BindView(R.id.get_all_fruits)
    Button getAllFruits;
    @BindView(R.id.new_fruit)
    Button newFruit;

    // Cheese
    @BindView(R.id.progressBarCheese)
    ProgressBar progressBarCheese;
    @BindView(R.id.cheese)
    EditText cheese;
    @BindView(R.id.get_cheese)
    Button getCheese;
    @BindView(R.id.progressBarAllCheeses)
    ProgressBar progressBarAllCheeses;
    @BindView(R.id.get_all_cheeses)
    Button getAllCheeses;
    @BindView(R.id.new_cheese)
    Button newCheese;

    // Sweet
    @BindView(R.id.progressBarSweet)
    ProgressBar progressBarSweet;
    @BindView(R.id.sweet)
    EditText sweet;
    @BindView(R.id.get_sweet)
    Button getSweet;
    @BindView(R.id.progressBarAllSweets)
    ProgressBar progressBarAllSweets;
    @BindView(R.id.get_all_sweets)
    Button getAllSweets;
    @BindView(R.id.new_sweet)
    Button newSweet;

    private final String EXAMPLE_SERVER_CONNECTION = "http://192.168.0.112:8080";
    private final String SERVER_CONNECTION = "SERVER_CONNECTION";

    private SharedPreferences preferences;
    private FoodPresenter presenter;
    private RestServiceApi restServiceApi;

    private FruitsDialogFragment fruitsDialog;
    private CheesesDialogFragment cheesesDialog;
    private SweetsDialogFragment sweetsDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        ButterKnife.bind(this);
        progressBarFruit.setVisibility(View.INVISIBLE);
        progressBarAllFruits.setVisibility(View.INVISIBLE);
        progressBarCheese.setVisibility(View.INVISIBLE);
        progressBarAllCheeses.setVisibility(View.INVISIBLE);
        progressBarSweet.setVisibility(View.INVISIBLE);
        progressBarAllSweets.setVisibility(View.INVISIBLE);
        preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        presenter = new FoodPresenterImpl(this);
        // Hide keyboard
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );
        createExampleServerConnection();
        initializeRestService();
    }

    private void initializeRestService() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit service = new Retrofit.Builder()
                .baseUrl(serverConnection.getText().toString())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        restServiceApi = service.create(RestServiceApi.class);
        Toast.makeText(getApplicationContext(), getString(R.string.initialize_rest_service), Toast.LENGTH_SHORT).show();
    }

    private void createExampleServerConnection() {
        if (!preferences.contains(SERVER_CONNECTION)) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(SERVER_CONNECTION, EXAMPLE_SERVER_CONNECTION);
            serverConnection.setText(EXAMPLE_SERVER_CONNECTION);
            editor.apply();
        } else {
            serverConnection.setText(preferences.getString(SERVER_CONNECTION, EXAMPLE_SERVER_CONNECTION));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("presenter_uuid", presenter.getUuid().toString());
        cachePresenter(presenter);
        // Server connection
        outState.putString("server_connection", serverConnection.getText().toString());
        // Fruit
        outState.putInt("progressBarFruit", progressBarFruit.getVisibility());
        outState.putBoolean("fruit", fruit.isEnabled());
        outState.putString("fruit_txt", fruit.getText().toString());
        outState.putBoolean("getFruit", getFruit.isEnabled());
        outState.putInt("progressBarAllFruits", progressBarAllFruits.getVisibility());
        outState.putBoolean("getAllFruits", getAllFruits.isEnabled());
        outState.putBoolean("newFruit", newFruit.isEnabled());
        // Cheese
        outState.putInt("progressBarCheese", progressBarCheese.getVisibility());
        outState.putBoolean("cheese", cheese.isEnabled());
        outState.putString("cheese_txt", cheese.getText().toString());
        outState.putBoolean("getCheese", getCheese.isEnabled());
        outState.putInt("progressBarAllCheeses", progressBarAllCheeses.getVisibility());
        outState.putBoolean("getAllCheeses", getAllCheeses.isEnabled());
        outState.putBoolean("newCheese", newCheese.isEnabled());
        // Sweet
        outState.putInt("progressBarSweet", progressBarSweet.getVisibility());
        outState.putBoolean("sweet", sweet.isEnabled());
        outState.putString("sweet_txt", sweet.getText().toString());
        outState.putBoolean("getSweet", getSweet.isEnabled());
        outState.putInt("progressBarAllSweets", progressBarAllSweets.getVisibility());
        outState.putBoolean("getAllSweets", getAllSweets.isEnabled());
        outState.putBoolean("newSweet", newSweet.isEnabled());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        restorePresenter(UUID.fromString(savedInstanceState.getString("presenter_uuid")));
        // Server connection
        serverConnection.setText(savedInstanceState.getString("server_connection"));
        // Fruit
        progressBarFruit.setVisibility(savedInstanceState.getInt("progressBarFruit") == View.VISIBLE ? View.VISIBLE : View.INVISIBLE);
        fruit.setEnabled(savedInstanceState.getBoolean("fruit"));
        fruit.setText(savedInstanceState.getString("fruit_txt"));
        getFruit.setEnabled(savedInstanceState.getBoolean("getFruit"));
        progressBarAllFruits.setVisibility(savedInstanceState.getInt("progressBarAllFruits") == View.VISIBLE ? View.VISIBLE : View.INVISIBLE);
        getAllFruits.setEnabled(savedInstanceState.getBoolean("getAllFruits"));
        newFruit.setEnabled(savedInstanceState.getBoolean("newFruit"));
        // Cheese
        progressBarCheese.setVisibility(savedInstanceState.getInt("progressBarCheese") == View.VISIBLE ? View.VISIBLE : View.INVISIBLE);
        cheese.setEnabled(savedInstanceState.getBoolean("cheese"));
        cheese.setText(savedInstanceState.getString("cheese_txt"));
        getCheese.setEnabled(savedInstanceState.getBoolean("getCheese"));
        progressBarAllCheeses.setVisibility(savedInstanceState.getInt("progressBarAllCheeses") == View.VISIBLE ? View.VISIBLE : View.INVISIBLE);
        getAllCheeses.setEnabled(savedInstanceState.getBoolean("getAllCheeses"));
        newCheese.setEnabled(savedInstanceState.getBoolean("newCheese"));
        // Sweet
        progressBarSweet.setVisibility(savedInstanceState.getInt("progressBarSweet") == View.VISIBLE ? View.VISIBLE : View.INVISIBLE);
        sweet.setEnabled(savedInstanceState.getBoolean("sweet"));
        sweet.setText(savedInstanceState.getString("sweet_txt"));
        getSweet.setEnabled(savedInstanceState.getBoolean("getSweet"));
        progressBarAllSweets.setVisibility(savedInstanceState.getInt("progressBarAllSweets") == View.VISIBLE ? View.VISIBLE : View.INVISIBLE);
        getAllSweets.setEnabled(savedInstanceState.getBoolean("getAllSweets"));
        newSweet.setEnabled(savedInstanceState.getBoolean("newSweet"));
        super.onRestoreInstanceState(savedInstanceState);
    }

    @OnClick(R.id.reload_server_connection)
    @SuppressWarnings("unused")
    public void reloadServerConnection() {
        serverConnection.setText(preferences.getString(SERVER_CONNECTION, EXAMPLE_SERVER_CONNECTION));
    }

    @OnClick(R.id.update_server_connection)
    @SuppressWarnings("unused")
    public void updateServerConnectionAndInitializeRestService() {
        String newServerConnection = serverConnection.getText().toString();
        if (!serverConnection.getText().toString().isEmpty()) {
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(SERVER_CONNECTION, newServerConnection);
            editor.apply();
            initializeRestService();
        } else {
            Toast.makeText(getApplicationContext(), getString(R.string.example_server_connection), Toast.LENGTH_LONG).show();
        }
    }

    @OnClick(R.id.get_fruit)
    @Override
    public void requestFruit() {
        this.enableUiFruit(false);
        presenter.requestFruit(restServiceApi);
    }

    @Override
    public void postFruit(String fruit) {
        this.fruit.setText(fruit);
        this.enableUiFruit(true);
    }

    @Override
    public void enableUiFruit(boolean enable) {
        if (enable) {
            progressBarFruit.setVisibility(View.INVISIBLE);
        } else {
            progressBarFruit.setVisibility(View.VISIBLE);
        }
        fruit.setEnabled(enable);
        getFruit.setEnabled(enable);
    }

    @OnClick(R.id.get_all_fruits)
    @Override
    public void requestAllFruits() {
        this.enableUiAllFruits(false);
        presenter.requestAllFruits(restServiceApi);
    }

    @Override
    public void postAllFruits(String[] fruits) {
        if (fruits.length > 0) {
            if (fruitsDialog == null) {
                fruitsDialog = FruitsDialogFragment.newInstance(fruits);
            }
            fruitsDialog.show(getSupportFragmentManager(), "tag_fruits_dialog");
        }
        this.enableUiAllFruits(true);
    }

    private void enableUiAllFruits(boolean enable) {
        if (enable) {
            progressBarAllFruits.setVisibility(View.INVISIBLE);
        } else {
            progressBarAllFruits.setVisibility(View.VISIBLE);
        }
        getAllFruits.setEnabled(enable);
    }

    @Override
    public void postFruitRequestError(String msg) {
        Toast.makeText(this, getString(R.string.fruit_request_error) +
                "\n" + msg, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.new_fruit)
    @Override
    public void requestAddNewFruit() {
        new AddNewDialogFragment().show(getSupportFragmentManager(), "tag_add_new");
        //presenter
    }

    @OnClick(R.id.get_cheese)
    @Override
    public void requestCheese() {
        this.enableUiCheese(false);
        presenter.requestCheese(restServiceApi);
    }

    @Override
    public void postCheese(String cheese) {
        this.cheese.setText(cheese);
        this.enableUiCheese(true);
    }

    private void enableUiCheese(boolean enable) {
        if (enable) {
            progressBarCheese.setVisibility(View.INVISIBLE);
        } else {
            progressBarCheese.setVisibility(View.VISIBLE);
        }
        cheese.setEnabled(enable);
        getCheese.setEnabled(enable);
    }

    @OnClick(R.id.get_all_cheeses)
    @Override
    public void requestAllCheeses() {
        this.enableUiAllCheeses(false);
        presenter.requestAllCheeses(restServiceApi);
    }

    @Override
    public void postAllCheeses(String[] cheeses) {
        if (cheeses.length > 0) {
            if (cheesesDialog == null) {
                cheesesDialog = CheesesDialogFragment.newInstance(cheeses);
            }
            cheesesDialog.show(getSupportFragmentManager(), "tag_cheeses_dialog");
        }
        this.enableUiAllCheeses(true);
    }

    private void enableUiAllCheeses(boolean enable) {
        if (enable) {
            progressBarAllCheeses.setVisibility(View.INVISIBLE);
        } else {
            progressBarAllCheeses.setVisibility(View.VISIBLE);
        }
        getAllCheeses.setEnabled(enable);
    }

    @Override
    public void postCheeseRequestError(String msg) {
        Toast.makeText(this, getString(R.string.cheese_request_error) +
                "\n" + msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void requestAddNewCheese() {

    }

    @OnClick(R.id.new_cheese)
    public void newCheese() {
        new AddNewDialogFragment().show(getSupportFragmentManager(), "tag_add_new");
    }

    @OnClick(R.id.get_sweet)
    @Override
    public void requestSweet() {
        this.enableUiSweet(false);
        presenter.requestSweet(restServiceApi);
    }

    @Override
    public void postSweet(String sweet) {
        this.sweet.setText(sweet);
        this.enableUiSweet(true);
    }

    private void enableUiSweet(boolean enable) {
        if (enable) {
            progressBarSweet.setVisibility(View.INVISIBLE);
        } else {
            progressBarSweet.setVisibility(View.VISIBLE);
        }
        sweet.setEnabled(enable);
        getSweet.setEnabled(enable);
    }

    @OnClick(R.id.get_all_sweets)
    @Override
    public void requestAllSweets() {
        this.enableUiAllSweets(false);
        presenter.requestAllSweets(restServiceApi);
    }

    @Override
    public void postAllSweets(String[] sweets) {
        if (sweets.length > 0) {
            if (sweetsDialog == null) {
                sweetsDialog = SweetsDialogFragment.newInstance(sweets);
            }
            sweetsDialog.show(getSupportFragmentManager(), "tag_sweets_dialog");
        }
        this.enableUiAllSweets(true);
    }

    private void enableUiAllSweets(boolean enable) {
        if (enable) {
            progressBarAllSweets.setVisibility(View.INVISIBLE);
        } else {
            progressBarAllSweets.setVisibility(View.VISIBLE);
        }
        getAllSweets.setEnabled(enable);
    }

    @Override
    public void postSweetRequestError(String msg) {
        Toast.makeText(this, getString(R.string.sweet_request_error) +
                "\n" + msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void requestAddNewSweet() {

    }

    @OnClick(R.id.new_sweet)
    public void newSweet() {
        new AddNewDialogFragment().show(getSupportFragmentManager(), "tag_add_new");
    }

    @Override
    public void cachePresenter(Presenter presenter) {
        Cache.getInstance().cachePresenterFor(presenter.getUuid(), presenter);
    }

    @Override
    public void restorePresenter(UUID uuid) {
        presenter = (FoodPresenter) Cache.getInstance().restorePresenterFor(uuid);
        presenter.setScreen(this);
    }
}