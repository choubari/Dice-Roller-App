package com.choubapp.diceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class TwoDices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_dices);
        Button RollButton;
        RollButton=(Button)findViewById(R.id.button);
        final ImageView LeftDice= (ImageView)findViewById(R.id.dice_left);
        final ImageView RightDice= (ImageView)findViewById(R.id.dice_right);
        final int [] diceArray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        RollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random RandomGenerator = new Random();
                int nbre = RandomGenerator.nextInt(6);
                LeftDice.setImageResource(diceArray[nbre]);
                nbre = RandomGenerator.nextInt(6);
                RightDice.setImageResource(diceArray[nbre]);
            }
        });
    }
    public void BacktoMenu(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
