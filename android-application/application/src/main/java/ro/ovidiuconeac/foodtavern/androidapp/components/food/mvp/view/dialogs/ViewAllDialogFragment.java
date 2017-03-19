package ro.ovidiuconeac.foodtavern.androidapp.components.food.mvp.view.dialogs;

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

public final class ViewAllDialogFragment extends DialogFragment {

    private static String[] foodItems;
    private static FoodType type;

    public static ViewAllDialogFragment newInstance(String[] foodItems, FoodType type) {
        ViewAllDialogFragment.foodItems = foodItems;
        ViewAllDialogFragment.type = type;
        return new ViewAllDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dialog_display_all, container, false);
        switch (type) {
            case CHEESE:
                ((TextView) v.findViewById(R.id.dialog_title)).setText(getString(R.string.dialog_title_display_cheeses));
                break;
            case FRUIT:
                ((TextView) v.findViewById(R.id.dialog_title)).setText(getString(R.string.dialog_title_display_fruits));
                break;
            case SWEET:
                ((TextView) v.findViewById(R.id.dialog_title)).setText(getString(R.string.dialog_title_display_sweets));
                break;
            default:
                break;
        }
        ((ListView) v.findViewById(R.id.all))
                .setAdapter(new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, ViewAllDialogFragment.foodItems));
        return v;
    }
}
