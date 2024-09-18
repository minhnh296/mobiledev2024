package vn.edu.usth.weatheractivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import vn.edu.usth.weatheractivity.haha.adapter;

public class weather_activity extends AppCompatActivity {
    public static final String TAG = "WeatherActivity";
    MediaPlayer mysound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mysound = MediaPlayer.create(weather_activity.this, R.raw.music1);

        ViewPager viewPager = findViewById(R.id.viewpager);
        PagerAdapter adapter = new adapter(getSupportFragmentManager());
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }

    public void playmusic(View view){
        mysound.start();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "==================( Start )====================");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "=================( Resume )====================");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "=================( Pause )====================");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "=================( Stop )====================");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "=================( Destroy )====================");
    }
}
