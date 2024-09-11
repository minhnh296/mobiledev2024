package vn.edu.usth.weatheractivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class weather_and_forecast_fragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.weather_and_forecast_fragment, container, false);
    }

    public static weather_and_forecast_fragment newInstance() {
        weather_and_forecast_fragment frag_layout1 = new weather_and_forecast_fragment();
        return frag_layout1;
    }
}
