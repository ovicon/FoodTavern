package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view.dialogs;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.OnClick;
import ro.ovidiuconeac.foodtavern.androidapp.R;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.presenter.FoodPresenter;
import ro.ovidiuconeac.models.features.featurex.Fruit;

/**
 * Created by www.ovidiuconeac.ro on 3/2/17.
 */

public final class AddNewDialogFragment<T> extends DialogFragment {


    private Button cancel;
    private Button save;

    private T t;

    private FoodPresenter presenter;

    public static AddNewDialogFragment newInstance(FoodPresenter presenter) {
        return new AddNewDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dialog_add_new, container, false);

/*
        TextView dialogTitle = (TextView) v.findViewById(R.id.dialog_title);
        dialogTitle.setText(getString(R.string.dialog_title_add_new));
*/
        v.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancel();
            }
        });

        v.findViewById(R.id.save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });

        return v;
    }

    @OnClick(R.id.cancel)
    public void cancel() {
        dismiss();
    }

    @OnClick(R.id.save)
    public void save() {
        dismiss();

    }



    public T getFood() {
        return (T) new Fruit("bobi");
    }
}
