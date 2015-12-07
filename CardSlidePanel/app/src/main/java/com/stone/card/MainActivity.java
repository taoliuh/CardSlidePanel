package com.stone.card;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;

import com.facebook.drawee.backends.pipeline.Fresco;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        getWindow().setBackgroundDrawableResource(R.drawable.purple_gradient);
        Fresco.initialize(getApplicationContext());
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new CardFragment())
                    .commitAllowingStateLoss();
        }
    }
}
