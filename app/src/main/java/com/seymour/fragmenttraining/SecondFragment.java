package com.seymour.fragmenttraining;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by seymour on 2016/04/23.
 */
public class SecondFragment extends Fragment {
    private static final String TAG = SecondFragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        View mView = inflater.inflate(R.layout.fragment_second, container, false);

        mView.findViewById(R.id.showDialogFragmentButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Show DialogFragment");
                DialogFragment dialogFragment = DialogFragment.newInstance();
                dialogFragment.show(getFragmentManager(),null);
            }
        });
        return mView;
    }
}
