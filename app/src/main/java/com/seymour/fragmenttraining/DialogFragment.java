package com.seymour.fragmenttraining;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;

/**
 * Created by seymour on 2016/04/23.
 */
public class DialogFragment extends android.support.v4.app.DialogFragment {
    private static final String TAG = SecondFragment.class.getSimpleName();

    public static  DialogFragment newInstance(){
        Log.d(TAG, "newInstance");
        DialogFragment dialogFragment = new DialogFragment();
        Bundle args = new Bundle();
        dialogFragment.setArguments(args);
        return dialogFragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState) {
        if (getActivity() == null) {
            Log.d(TAG, "onCreateDialog:getActivity() == null");
            return super.onCreateDialog(saveInstanceState);
        }
        Log.d(TAG, "onCreateDialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("DialogFragment");
        builder.setMessage("Hi, How Are You");
        builder.setPositiveButton("OK", null);
        return builder.show();
    }
}
