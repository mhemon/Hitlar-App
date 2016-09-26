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
public class JoinWar extends Fragment{

    public static JoinWar newInstance() {
        JoinWar fragment = new JoinWar();

        return fragment;
    }

    public JoinWar() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.join_war, container, false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(3);
    }
}
