package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view.dialogs;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ro.ovidiuconeac.foodtavern.androidapp.R;

/**
 * Created by www.ovidiuconeac.ro on 3/2/17.
 */

public final class SweetsDialogFragment extends DialogFragment {

    private static String[] sweets;

    public static SweetsDialogFragment newInstance(String[] sweets) {
        SweetsDialogFragment.sweets = sweets;
        return new SweetsDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dialog_display_sweets, container, false);
        ((ListView) v.findViewById(R.id.sweets))
                .setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, SweetsDialogFragment.sweets));
        return v;
    }
}
