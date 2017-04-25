package ro.ovidiuconeac.foodtavern.androidapp.components.food.mvp.view.dialogs;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import ro.ovidiuconeac.foodtavern.androidapp.R;
import ro.ovidiuconeac.foodtavern.androidapp.components.food.mvp.view.FoodView;
import ro.ovidiuconeac.foodtavern.common.models.Cheese;
import ro.ovidiuconeac.foodtavern.common.models.Fruit;
import ro.ovidiuconeac.foodtavern.common.models.Sweet;

/**
 * Created by www.ovidiuconeac.ro on 3/2/17.
 */

public final class AddNewDialogFragment extends DialogFragment {

    private static FoodView view;
    private static FoodType type;

    private EditText name;
    private Button save;

    public static AddNewDialogFragment newInstance(FoodView view, FoodType type) {
        AddNewDialogFragment.view = view;
        AddNewDialogFragment.type = type;
        return new AddNewDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dialog_add_new_food, container, false);
        switch (type) {
            case CHEESE:
                ((TextView) v.findViewById(R.id.dialog_title)).setText(getString(R.string.dialog_title_add_new_cheese));
                break;
            case FRUIT:
                ((TextView) v.findViewById(R.id.dialog_title)).setText(getString(R.string.dialog_title_add_new_fruit));
                break;
            case SWEET:
                ((TextView) v.findViewById(R.id.dialog_title)).setText(getString(R.string.dialog_title_add_new_sweet));
                break;
            default:

                break;
        }

        name = (EditText) v.findViewById(R.id.name);
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().isEmpty()) {
                    save.setEnabled(false);
                } else {
                    save.setEnabled(true);
                }
            }
        });
        save = (Button) v.findViewById(R.id.save);
        save.setOnClickListener(e -> {
            switch (type) {
                case CHEESE:
                    view.requestAddNewCheese(new Cheese(name.getText().toString()));
                    break;
                case FRUIT:
                    view.requestAddNewFruit(new Fruit(name.getText().toString()));
                    break;
                case SWEET:
                    view.requestAddNewSweet(new Sweet(name.getText().toString()));
                    break;
                default:
                    break;
            }
            dismiss();
        });
        return v;
    }
}
