package com.example.nattapat.imagebutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public  class MainActivity extends AppCompatActivity {

    Button yesButton;
    ImageButton oneImageButton, twoImageButton,threeImageButton,fourImageButton,fiveImageButton,sixImageButton,sevenImageButton,
            eightImageButton,nineImageButton,tenImageButton,elevenImageButton,twelveImageButton,thirteenImageButton,fourteenImageButton,
        fifteenImageButton,sixteenImageButton,seventeenImageButton,eightteenImageButton,nineteenImageButton,twentyImageButton,
    twentyoneImageButton,twentytwoImageButton,twentythreeImageButton,twentyfourImageButton,twentyfiveImageButton, twentysixImageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yesButton = (Button) findViewById(R.id.button2);
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                startActivity(intent);
            }
        });
        oneImageButton = (ImageButton) findViewById(R.id.imageButton9);
        twoImageButton = (ImageButton) findViewById(R.id.imageButton8);
        threeImageButton = (ImageButton) findViewById(R.id.imageButton7);
        fourImageButton = (ImageButton) findViewById(R.id.imageButton6);
        fiveImageButton = (ImageButton) findViewById(R.id.imageButton5);
        sixImageButton = (ImageButton) findViewById(R.id.imageButton4);
        sevenImageButton = (ImageButton) findViewById(R.id.imageButton3);
        eightImageButton = (ImageButton) findViewById(R.id.imageButton11);
        nineImageButton = (ImageButton) findViewById(R.id.imageButton13);
        tenImageButton = (ImageButton) findViewById(R.id.imageButton15);
        elevenImageButton = (ImageButton) findViewById(R.id.imageButton17);
        twelveImageButton = (ImageButton) findViewById(R.id.imageButton19);
        thirteenImageButton = (ImageButton) findViewById(R.id.imageButton21);
        fourteenImageButton= (ImageButton) findViewById(R.id.imageButton10);
        fifteenImageButton = (ImageButton) findViewById(R.id.imageButton12);
        sixteenImageButton = (ImageButton) findViewById(R.id.imageButton14);
        seventeenImageButton = (ImageButton) findViewById(R.id.imageButton16);
        eightteenImageButton = (ImageButton) findViewById(R.id.imageButton18);
        nineteenImageButton = (ImageButton) findViewById(R.id.imageButton20);
        twentyImageButton = (ImageButton) findViewById(R.id.imageButton28);
        twentyoneImageButton = (ImageButton) findViewById(R.id.imageButton27);
        twentytwoImageButton = (ImageButton) findViewById(R.id.imageButton26);
        twentythreeImageButton = (ImageButton) findViewById(R.id.imageButton25);
        twentyfourImageButton = (ImageButton) findViewById(R.id.imageButton24);
        twentyfiveImageButton = (ImageButton) findViewById(R.id.imageButton23);
        twentysixImageButton = (ImageButton) findViewById((R.id.imageButton22));


        oneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oneImageButton.setImageResource(R.drawable.jo);

            }
        });
twoImageButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        twoImageButton.setImageResource(R.drawable.jo);
    }
});
        threeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threeImageButton.setImageResource(R.drawable.jo);
            }
        });
        fourImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourImageButton.setImageResource(R.drawable.jo);
            }
        });
        fiveImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiveImageButton.setImageResource(R.drawable.jo);
            }
        });
        sixImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixImageButton.setImageResource(R.drawable.jo);
            }
        });
        sevenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sevenImageButton.setImageResource(R.drawable.jo);
            }
        });
        eightImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eightImageButton.setImageResource(R.drawable.jo);
            }
        });
        nineImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nineImageButton.setImageResource(R.drawable.jo);
            }
        });
        tenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tenImageButton.setImageResource(R.drawable.jo);
            }
        });
        elevenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elevenImageButton.setImageResource(R.drawable.jo);
            }
        });twelveImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twelveImageButton.setImageResource(R.drawable.jo);
            }
        });
        thirteenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirteenImageButton.setImageResource(R.drawable.jo);
            }
        });
        fourteenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourteenImageButton.setImageResource(R.drawable.jo);
            }
        });
        fifteenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fifteenImageButton.setImageResource(R.drawable.jo);
            }
        });
        sixteenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixteenImageButton.setImageResource(R.drawable.jo);
            }
        });
        seventeenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seventeenImageButton.setImageResource(R.drawable.jo);
            }
        });
        eightteenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eightteenImageButton.setImageResource(R.drawable.jo);
            }
        });
        nineteenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nineteenImageButton.setImageResource(R.drawable.jo);
            }
        });
        twentyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentyImageButton.setImageResource(R.drawable.jo);
            }
        });
        twentyoneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentyoneImageButton.setImageResource(R.drawable.jo);
            }
        });
        twentytwoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentytwoImageButton.setImageResource(R.drawable.jo);
            }
        });
        twentythreeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentythreeImageButton.setImageResource(R.drawable.jo);
            }
        });
        twentyfourImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentyfourImageButton.setImageResource(R.drawable.jo);
            }
        });
        twentyfiveImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentyfiveImageButton.setImageResource(R.drawable.jo);
            }
        });
        twentysixImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twentysixImageButton.setImageResource(R.drawable.jo);
            }
        });
    }
    }
