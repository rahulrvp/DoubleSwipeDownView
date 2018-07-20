package com.example.rahulrvp.swipedownsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SlidingUpPanelLayout layoutA = findViewById(R.id.sliding_layout);
        final SlidingUpPanelLayout layoutB = findViewById(R.id.sliding_layout2);

        layoutA.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {

            }

            @Override
            public void onPanelStateChanged(
                    View panel, SlidingUpPanelLayout.PanelState previousState,
                    SlidingUpPanelLayout.PanelState newState) {

                if (SlidingUpPanelLayout.PanelState.EXPANDED == newState) {
                    layoutB.setVisibility(View.VISIBLE);
                } else if (SlidingUpPanelLayout.PanelState.COLLAPSED == newState) {
                    layoutB.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
