package vn.edu.usth.weatheractivity;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
//        view.setBackgroundColor(0x2000FF00);
//        LinearLayout frag = (LinearLayout) view.findViewById(R.id.frag);
//        frag.setOrientation(LinearLayout.HORIZONTAL);
//
//        TextView textView = new TextView(getContext());
//        textView.setText("Thursday");
//
//        ImageView imageView = new ImageView(getContext());
//        imageView.setImageResource(R.drawable.weathernews_648198);
//
//        frag.addView(imageView);
//        frag.addView(textView);
        return view;
    }
}