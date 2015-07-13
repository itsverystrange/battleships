package com.android.battleships;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by stephanie on 7/11/15.
 */
public class Game extends AppCompatActivity {
    private ImageButton mMyShips;
    private ImageButton mFire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);

        // Stop annoying default activity transition
        getWindow().setWindowAnimations(0);

        mMyShips = (ImageButton) findViewById(R.id.myShips);
        mFire = (ImageButton) findViewById(R.id.fire);

        mMyShips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewMyShips();
            }
        });

        mFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fire();
            }
        });
    }

    private void viewMyShips() {
        Toast.makeText(this, "Pop-up with # of ships left", Toast.LENGTH_LONG).show();
    }

    private void fire() {
        Toast.makeText(this, "Fire torpedoes", Toast.LENGTH_LONG).show();
    }
}
