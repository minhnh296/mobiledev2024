package vn.edu.usth.weatheractivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class fragment_weather extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.weatherfragment, container, false);
    }

    public static fragment_weather newInstance() {
        fragment_weather frag_layout3 = new fragment_weather();
        return frag_layout3;
    }

}
