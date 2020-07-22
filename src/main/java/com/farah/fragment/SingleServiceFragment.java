package com.farah.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.farah.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SingleServiceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SingleServiceFragment extends Fragment {

     View rootView;
    public SingleServiceFragment() {

    }


    public static SingleServiceFragment newInstance(String param1, String param2) {
        SingleServiceFragment fragment = new SingleServiceFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView= inflater.inflate(R.layout.fragment_home, container, false);
        init();
        return rootView;
    }

    private void init() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}