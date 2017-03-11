package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view.dialogs;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import ro.ovidiuconeac.foodtavern.androidapp.R;
import ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view.FoodView;
import ro.ovidiuconeac.models.features.featurex.Sweet;

/**
 * Created by www.ovidiuconeac.ro on 3/2/17.
 */

public final class AddNewSweetDialogFragment extends DialogFragment {

    private static FoodView view;

    private EditText name;
    private Button save;

    public static AddNewSweetDialogFragment newInstance(FoodView view) {
        AddNewSweetDialogFragment.view = view;
        return new AddNewSweetDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dialog_add_new_sweet, container, false);
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
        v.findViewById(R.id.cancel).setOnClickListener(e -> dismiss());
        save = (Button) v.findViewById(R.id.save);
        save.setOnClickListener(e -> {
            view.requestAddNewSweet(new Sweet(name.getText().toString()));
            dismiss();
        });
        return v;
    }
}
