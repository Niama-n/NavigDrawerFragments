package com.example.navigationdrawerdemo;

import android.os.Bundle;
import androidx.fragment.app.ListFragment;
import android.widget.ArrayAdapter;

public class FragmentList extends ListFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] items = {
            "LAB1", "LAB2", "LAB3", "LAB4",
            "LAB5", "LAB6", "LAB7", "LAB8",
            "LAB9", "LAB10"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                items
        );
        setListAdapter(adapter);
    }
}