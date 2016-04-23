package com.seymour.fragmenttraining;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by seymour on 2016/04/23.
 */
public class FirstFragment extends Fragment{
    private static final String TAG = FirstFragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        View mView = inflater.inflate(R.layout.fragment_first, container, false);

        mView.findViewById(R.id.toSecondFragmentButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Move to SecondFragment");
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.addToBackStack(null);
                transaction.replace(R.id.fragment_container, new SecondFragment());
                transaction.commit();
            }
        });
        return mView;
    }
}
