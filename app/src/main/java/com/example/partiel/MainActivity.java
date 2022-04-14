package com.example.partiel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText nbDice;
    private EditText nbFace;
    private Button submit;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nbDice = findViewById(R.id.nb_dice);
        nbFace = findViewById(R.id.nb_face);
        submit = findViewById(R.id.submit_for_roll);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });

    }
    public static class StringToIntExample1{
        public static void main(String args[]){
            String s=nbDice;
            int i=Integer.parseInt(s);
            System.out.println(i);
        }}

    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;
    }
}