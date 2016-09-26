package xploreict.com.hitlarbiograpi;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Root on 10/24/2015.
 */
public class BirthAndGoneUp extends Fragment{

    public static BirthAndGoneUp newInstance() {
        BirthAndGoneUp fragment = new BirthAndGoneUp();

        return fragment;
    }

    public BirthAndGoneUp() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.birth_gone_up, container, false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(2);
    }
}
