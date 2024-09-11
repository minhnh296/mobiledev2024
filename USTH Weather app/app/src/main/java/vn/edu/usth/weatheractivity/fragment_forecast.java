package vn.edu.usth.weatheractivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class fragment_forecast extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_forecast, container, false);
    }

    public static fragment_forecast newInstance() {
        fragment_forecast frag_layout2 = new fragment_forecast();
        return frag_layout2;
    }

}

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
//        return view;
