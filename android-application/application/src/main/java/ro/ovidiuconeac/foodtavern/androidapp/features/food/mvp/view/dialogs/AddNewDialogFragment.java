package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view.dialogs;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ro.ovidiuconeac.foodtavern.androidapp.R;
import ro.ovidiuconeac.models.features.featurex.Fruit;

/**
 * Created by www.ovidiuconeac.ro on 3/2/17.
 */

public final class AddNewDialogFragment<T> extends DialogFragment {

    private T t;

    public static <T> AddNewDialogFragment newInstance() {
        return new AddNewDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dialog_display_cheeses, container, false);
        TextView dialogTitle = (TextView) v.findViewById(R.id.dialog_title);
        dialogTitle.setText(getString(R.string.dialog_title_add_new));


        return v;
    }

    public T getFood() {
        return (T) new Fruit("bobi");
    }
}
