package com.example.havatumemchemhavatum;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class game2playerActivity extends AppCompatActivity {
    int move = 1;
    boolean player1cardsvisibility = false;
    boolean player2cardsvisibility = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2player);
        Button show = findViewById(R.id.show);
        Button step_change = findViewById(R.id.step_change);
        Button deal = findViewById(R.id.deal);
        TextView player1card1 = findViewById(R.id.card_top_1);
        TextView player1card2 = findViewById(R.id.card_top_2);
        TextView player1card3 = findViewById(R.id.card_top_3);
        TextView player1card4 = findViewById(R.id.card_top_4);
        TextView player1card5 = findViewById(R.id.card_top_5);
        TextView player1card6 = findViewById(R.id.card_top_6);
        TextView player1card7 = findViewById(R.id.card_top_7);
        TextView player1card8 = findViewById(R.id.card_top_8);
        TextView player1card9 = findViewById(R.id.card_top_9);
        TextView player2card1 = findViewById(R.id.card_bottom_1);
        TextView player2card2 = findViewById(R.id.card_bottom_2);
        TextView player2card3 = findViewById(R.id.card_bottom_3);
        TextView player2card4 = findViewById(R.id.card_bottom_4);
        TextView player2card5 = findViewById(R.id.card_bottom_5);
        TextView player2card6 = findViewById(R.id.card_bottom_6);
        TextView player2card7 = findViewById(R.id.card_bottom_7);
        TextView player2card8 = findViewById(R.id.card_bottom_8);
        TextView player2card9 = findViewById(R.id.card_bottom_9);
        RelativeLayout player1cards = findViewById(R.id.top_cards);
        RelativeLayout player2cards = findViewById(R.id.bottom_cards);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (move == 1 && player1cardsvisibility == false) {
                    player1cards.setVisibility(View.VISIBLE);
                    player1cardsvisibility = true;
                    show.setText("Hide");
                } else if (move == 1 && player1cardsvisibility == true) {
                    player1cards.setVisibility(View.INVISIBLE);
                    player1cardsvisibility = false;
                    show.setText("Show");
                } else if (move == 2 && player2cardsvisibility == true) {
                    player2cards.setVisibility(View.INVISIBLE);
                    player2cardsvisibility = false;
                    show.setText("Show");
                } else if (move == 2 && player2cardsvisibility == false) {
                    player2cards.setVisibility(View.VISIBLE);
                    player2cardsvisibility = true;
                    show.setText("Hide");
                }
            }
        });

        step_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1cardsvisibility == false && player2cardsvisibility == false) {
                    if (move == 1) {
                        move = 2;
                    } else if (move == 2) {
                        move = 1;
                    }
                } else {
                    Toast.makeText(game2playerActivity.this, "Hide your cards", Toast.LENGTH_SHORT).show();
                }
            }
        });

        deal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomindexp1_1 = (int)(Math.random() * 18);
                int randomindexp1_2 = (int)(Math.random() * 17);
                int randomindexp1_3 = (int)(Math.random() * 16);
                int randomindexp1_4 = (int)(Math.random() * 15);
                int randomindexp1_5 = (int)(Math.random() * 14);
                int randomindexp1_6 = (int)(Math.random() * 13);
                int randomindexp1_7 = (int)(Math.random() * 12);
                int randomindexp1_8 = (int)(Math.random() * 11);
                int randomindexp1_9 = (int)(Math.random() * 10);
                int randomindexp2_1 = (int)(Math.random() * 9);
                int randomindexp2_2 = (int)(Math.random() * 8);
                int randomindexp2_3 = (int)(Math.random() * 7);
                int randomindexp2_4 = (int)(Math.random() * 6);
                int randomindexp2_5 = (int)(Math.random() * 5);
                int randomindexp2_6 = (int)(Math.random() * 4);
                int randomindexp2_7 = (int)(Math.random() * 3);
                int randomindexp2_8 = (int)(Math.random() * 2);
                int randomindexp2_9 = 0;
                ArrayList<String> cards = new ArrayList<>(Arrays.asList("J", "J", "J", "J", "Q", "Q", "Q", "Q", "K", "K", "K", "K", "A", "A", "A", "A", "*", "*"));


                player1card1.setText(cards.get(randomindexp1_1));
                cards.remove(randomindexp1_1);
                player1card2.setText(cards.get(randomindexp1_2));
                cards.remove(randomindexp1_2);
                player1card3.setText(cards.get(randomindexp1_3));
                cards.remove(randomindexp1_3);
                player1card4.setText(cards.get(randomindexp1_4));
                cards.remove(randomindexp1_4);
                player1card5.setText(cards.get(randomindexp1_5));
                cards.remove(randomindexp1_5);
                player1card6.setText(cards.get(randomindexp1_6));
                cards.remove(randomindexp1_6);
                player1card7.setText(cards.get(randomindexp1_7));
                cards.remove(randomindexp1_7);
                player1card8.setText(cards.get(randomindexp1_8));
                cards.remove(randomindexp1_8);
                player1card9.setText(cards.get(randomindexp1_9));
                cards.remove(randomindexp1_9);
                player2card1.setText(cards.get(randomindexp2_1));
                cards.remove(randomindexp2_1);
                player2card2.setText(cards.get(randomindexp2_2));
                cards.remove(randomindexp2_2);
                player2card3.setText(cards.get(randomindexp2_3));
                cards.remove(randomindexp2_3);
                player2card4.setText(cards.get(randomindexp2_4));
                cards.remove(randomindexp2_4);
                player2card5.setText(cards.get(randomindexp2_5));
                cards.remove(randomindexp2_5);
                player2card6.setText(cards.get(randomindexp2_6));
                cards.remove(randomindexp2_6);
                player2card7.setText(cards.get(randomindexp2_7));
                cards.remove(randomindexp2_7);
                player2card8.setText(cards.get(randomindexp2_8));
                cards.remove(randomindexp2_8);
                player2card9.setText(cards.get(randomindexp2_9));
                cards.remove(randomindexp2_9);

            }
        });
    }
}
