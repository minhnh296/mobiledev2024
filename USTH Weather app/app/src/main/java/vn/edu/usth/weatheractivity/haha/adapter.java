package vn.edu.usth.weatheractivity.haha;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import vn.edu.usth.weatheractivity.fragment_forecast;
import vn.edu.usth.weatheractivity.fragment_weather;
import vn.edu.usth.weatheractivity.weather_and_forecast_fragment;

public class adapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String[] titles = new String[] { "Hanoi", "Paris", "Toulouse" };

    public adapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return fragment_weather.newInstance();
            case 1:
                return fragment_forecast.newInstance();
            case 2:
                return weather_and_forecast_fragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
