package xploreict.com.hitlarbiograpi;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphagravel.common.AlphaGravel;

/**
 * Created by Root on 10/24/2015.
 */
public class AboutHitlar extends Fragment{

    public static AboutHitlar newInstance() {
        AboutHitlar fragment = new AboutHitlar();

        return fragment;
    }

    public AboutHitlar() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String sdkKey ="9XbYWc1FfHVHOSHTyyRiIpPkeqZsP9zb2xIuVmzeycCO7auW";
        AlphaGravel.Init(this, sdkKey);

        View rootView = inflater.inflate(R.layout.about_hitlar, container, false);





        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(1);
    }

    @Override
    public void onStart()
    {
        super.onStart();
    }

    public void onClickShowAd(View v)
    {
        if (AlphaGravel.adIsReady())
        {
            AlphaGravel.showAd();
        }
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onStop() {
        super.onStop();
    }
}
