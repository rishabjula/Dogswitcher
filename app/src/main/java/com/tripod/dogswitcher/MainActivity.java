package com.tripod.dogswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button changeButton;
    ImageView img;
    int currentImage=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeButton = findViewById(R.id.button);

        img = findViewById(R.id.imageView);

       // img.setImageResource(R.drawable.dog1);
        changeButton.setOnClickListener(new dogChange());



    }

    private static final int[] images =new int[] {R.drawable.dog1,R.drawable.dog2,R.drawable.dog3};
    private class dogChange implements View.OnClickListener {
        @Override
        public void onClick(View view) {



            if(currentImage<3)
            {
                img.setImageResource(images[currentImage]);


            }
            else{
                currentImage=0;
                img.setImageResource(images[currentImage]);
            }

            currentImage++;
        }
    }
}
