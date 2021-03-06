package mobileappdevelopment.kevinholmes.partygamehelper;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kevin on 11/19/2017.
 */

public class ErrorAlertFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        android.os.Debug.waitForDebugger();
        View rootView = inflater.inflate(R.layout.dialog_fragment, container, false);

        getDialog().setTitle("Error");
        return rootView;
    }
}
