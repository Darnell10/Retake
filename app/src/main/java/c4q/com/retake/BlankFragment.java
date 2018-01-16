package c4q.com.retake;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    View rootView;
    TextView textView;
    Bundle bundle;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        bundle = getArguments();
        textView.setText(bundle.getString("stuff"));
        textView =  rootView.findViewById(R.id.frag_tv);
        bundle = getArguments();
        textView.setText(bundle.getString("current"));


        RecyclerView someRecyclerView = rootView.findViewById(R.id.recycler_view);
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number.add(i);
            i++;
        }


        Adapter modelAdapter = new Adapter(model);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());


        someRecyclerView.setLayoutManager(linearLayoutManager);
        someRecyclerView.setAdapter(modelAdapter);


        return rootView;

    }

}
