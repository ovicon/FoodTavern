package ro.ovidiuconeac.foodtavern.androidapp.features.food.mvp.view.dialogs;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import ro.ovidiuconeac.foodtavern.androidapp.R;

/**
 * Created by www.ovidiuconeac.ro on 3/2/17.
 */

public final class CheesesDialogFragment extends DialogFragment {

    private static String[] cheeses;

    public static CheesesDialogFragment newInstance(String[] cheeses) {
        CheesesDialogFragment f = new CheesesDialogFragment();
        CheesesDialogFragment.cheeses = cheeses;
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dialog_display_cheeses, container, false);
        TextView dialogTitle = (TextView) v.findViewById(R.id.dialog_title);
        dialogTitle.setText(getString(R.string.dialog_title_display_cheeses));
        ListView cheeses = (ListView) v.findViewById(R.id.cheeses);
        cheeses.setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, CheesesDialogFragment.cheeses));
        return v;
    }
}
