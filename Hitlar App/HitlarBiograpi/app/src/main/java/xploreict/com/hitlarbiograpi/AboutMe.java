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
public class AboutMe extends Fragment{

    public static AboutMe newInstance() {
        AboutMe fragment = new AboutMe();

        return fragment;
    }

    public AboutMe() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_about_me, container, false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(5);
    }
}
