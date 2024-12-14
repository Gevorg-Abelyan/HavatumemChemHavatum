package com.example.havatumemchemhavatum;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
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
    boolean chose = false;
    boolean player1card1chosen = false;
    boolean player1card2chosen = false;
    boolean player1card3chosen = false;
    boolean player1card4chosen = false;
    boolean player1card5chosen = false;
    boolean player1card6chosen = false;
    boolean player1card7chosen = false;
    boolean player1card8chosen = false;
    boolean player1card9chosen = false;
    boolean player2card1chosen = false;
    boolean player2card2chosen = false;
    boolean player2card3chosen = false;
    boolean player2card4chosen = false;
    boolean player2card5chosen = false;
    boolean player2card6chosen = false;
    boolean player2card7chosen = false;
    boolean player2card8chosen = false;
    boolean player2card9chosen = false;
    boolean isvalet = false;
    boolean isdama = false;
    boolean iskarol = false;
    boolean istuz = false;
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
        RelativeLayout player1cards1 = findViewById(R.id.cards_top_1);
        RelativeLayout player1cards2 = findViewById(R.id.cards_top_2);
        RelativeLayout player1cards3 = findViewById(R.id.cards_top_3);
        RelativeLayout player1cards4 = findViewById(R.id.cards_top_4);
        RelativeLayout player1cards5 = findViewById(R.id.cards_top_5);
        RelativeLayout player1cards6 = findViewById(R.id.cards_top_6);
        RelativeLayout player1cards7 = findViewById(R.id.cards_top_7);
        RelativeLayout player1cards8 = findViewById(R.id.cards_top_8);
        RelativeLayout player1cards9 = findViewById(R.id.cards_top_9);
        RelativeLayout player2cards1 = findViewById(R.id.cards_bottom_1);
        RelativeLayout player2cards2 = findViewById(R.id.cards_bottom_2);
        RelativeLayout player2cards3 = findViewById(R.id.cards_bottom_3);
        RelativeLayout player2cards4 = findViewById(R.id.cards_bottom_4);
        RelativeLayout player2cards5 = findViewById(R.id.cards_bottom_5);
        RelativeLayout player2cards6 = findViewById(R.id.cards_bottom_6);
        RelativeLayout player2cards7 = findViewById(R.id.cards_bottom_7);
        RelativeLayout player2cards8 = findViewById(R.id.cards_bottom_8);
        RelativeLayout player2cards9 = findViewById(R.id.cards_bottom_9);
        GridLayout dropzonecontainer = findViewById(R.id.drop_zone_container);
        FrameLayout dropzone1 = findViewById(R.id.drop_zone_1);
        FrameLayout dropzone2 = findViewById(R.id.drop_zone_2);
        FrameLayout dropzone3 = findViewById(R.id.drop_zone_3);
        FrameLayout dropzone4 = findViewById(R.id.drop_zone_4);
        FrameLayout dropzone5 = findViewById(R.id.drop_zone_5);
        FrameLayout dropzone6 = findViewById(R.id.drop_zone_6);
        FrameLayout dropzone7 = findViewById(R.id.drop_zone_7);
        FrameLayout dropzone8 = findViewById(R.id.drop_zone_8);
        FrameLayout dropzone9 = findViewById(R.id.drop_zone_9);
        TextView cardplaced1 = findViewById(R.id.card_placed_1);
        TextView cardplaced2 = findViewById(R.id.card_placed_2);
        TextView cardplaced3 = findViewById(R.id.card_placed_3);
        TextView cardplaced4 = findViewById(R.id.card_placed_4);
        TextView cardplaced5 = findViewById(R.id.card_placed_5);
        TextView cardplaced6 = findViewById(R.id.card_placed_6);
        TextView cardplaced7 = findViewById(R.id.card_placed_7);
        TextView cardplaced8 = findViewById(R.id.card_placed_8);
        TextView cardplaced9 = findViewById(R.id.card_placed_9);
        TextView cardsaid1 = findViewById(R.id.card_said_1);
        TextView cardsaid2 = findViewById(R.id.card_said_2);
        TextView cardsaid3 = findViewById(R.id.card_said_3);
        TextView cardsaid4 = findViewById(R.id.card_said_4);
        TextView cardsaid5 = findViewById(R.id.card_said_5);
        TextView cardsaid6 = findViewById(R.id.card_said_6);
        TextView cardsaid7 = findViewById(R.id.card_said_7);
        TextView cardsaid8 = findViewById(R.id.card_said_8);
        TextView cardsaid9 = findViewById(R.id.card_said_9);
        LinearLayout buttoncontainer = findViewById(R.id.button_container);
        Button valet = findViewById(R.id.valet);
        Button dama = findViewById(R.id.dama);
        Button karol = findViewById(R.id.karol);
        Button tuz = findViewById(R.id.tuz);
        Button drop = findViewById(R.id.drop);



        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (move == 1 && !player1cardsvisibility) {
                    player1cards.setVisibility(View.VISIBLE);
                    player1cardsvisibility = true;
                    show.setText("Hide");
                } else if (move == 1 && player1cardsvisibility) {
                    player1cards.setVisibility(View.INVISIBLE);
                    player1cardsvisibility = false;
                    show.setText("Show");
                } else if (move == 2 && player2cardsvisibility) {
                    player2cards.setVisibility(View.INVISIBLE);
                    player2cardsvisibility = false;
                    show.setText("Show");
                } else if (move == 2 && !player2cardsvisibility) {
                    player2cards.setVisibility(View.VISIBLE);
                    player2cardsvisibility = true;
                    show.setText("Hide");
                }
            }
        });


        step_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!player1cardsvisibility && !player2cardsvisibility) {
                    move = (move == 1) ? 2 : 1;
                } else {
                    Toast.makeText(game2playerActivity.this, "Hide your cards", Toast.LENGTH_SHORT).show();
                }
            }
        });

        deal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomindexp1_1 = (int) (Math.random() * 18);
                int randomindexp1_2 = (int) (Math.random() * 17);
                int randomindexp1_3 = (int) (Math.random() * 16);
                int randomindexp1_4 = (int) (Math.random() * 15);
                int randomindexp1_5 = (int) (Math.random() * 14);
                int randomindexp1_6 = (int) (Math.random() * 13);
                int randomindexp1_7 = (int) (Math.random() * 12);
                int randomindexp1_8 = (int) (Math.random() * 11);
                int randomindexp1_9 = (int) (Math.random() * 10);
                int randomindexp2_1 = (int) (Math.random() * 9);
                int randomindexp2_2 = (int) (Math.random() * 8);
                int randomindexp2_3 = (int) (Math.random() * 7);
                int randomindexp2_4 = (int) (Math.random() * 6);
                int randomindexp2_5 = (int) (Math.random() * 5);
                int randomindexp2_6 = (int) (Math.random() * 4);
                int randomindexp2_7 = (int) (Math.random() * 3);
                int randomindexp2_8 = (int) (Math.random() * 2);
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
                deal.setEnabled(false);
                deal.setVisibility(View.INVISIBLE);

                Toast.makeText(game2playerActivity.this, "Cards have been dealt!", Toast.LENGTH_SHORT).show();
            }
        });
        player1cards1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards1.getLayoutParams();
                    params.topMargin = 1000;
                    player1cards1.setLayoutParams(params);
                    chose = true;
                    player1card1chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards1.getLayoutParams();
                    params.topMargin = 1375;
                    player1cards1.setLayoutParams(params);
                    chose = false;
                    player1card1chosen = false;
                }
            }
        });
        player1cards2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards2.getLayoutParams();
                    params.topMargin = 1000;
                    player1cards2.setLayoutParams(params);
                    chose = true;
                    player1card2chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards2.getLayoutParams();
                    params.topMargin = 1375;
                    player1cards2.setLayoutParams(params);
                    chose = false;
                    player1card2chosen = false;
                }
            }
        });
        player1cards3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards3.getLayoutParams();
                    params.topMargin = 1000;
                    player1cards3.setLayoutParams(params);
                    chose = true;
                    player1card3chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards3.getLayoutParams();
                    params.topMargin = 1375;
                    player1cards3.setLayoutParams(params);
                    chose = false;
                    player1card3chosen = false;
                }
            }
        });
        player1cards4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards4.getLayoutParams();
                    params.topMargin = 1000;
                    player1cards4.setLayoutParams(params);
                    chose = true;
                    player1card4chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards4.getLayoutParams();
                    params.topMargin = 1375;
                    player1cards4.setLayoutParams(params);
                    chose = false;
                    player1card4chosen = false;
                }
            }
        });
        player1cards5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards5.getLayoutParams();
                    params.topMargin = 1000;
                    player1cards5.setLayoutParams(params);
                    chose = true;
                    player1card5chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards5.getLayoutParams();
                    params.topMargin = 1375;
                    player1cards5.setLayoutParams(params);
                    chose = false;
                    player1card5chosen = false;
                }
            }
        });
        player1cards6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards6.getLayoutParams();
                    params.topMargin = 1000;
                    player1cards6.setLayoutParams(params);
                    chose = true;
                    player1card6chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards6.getLayoutParams();
                    params.topMargin = 1375;
                    player1cards6.setLayoutParams(params);
                    chose = false;
                    player1card6chosen = false;
                }
            }
        });
        player1cards7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards7.getLayoutParams();
                    params.topMargin = 1000;
                    player1cards7.setLayoutParams(params);
                    chose = true;
                    player1card7chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards7.getLayoutParams();
                    params.topMargin = 1375;
                    player1cards7.setLayoutParams(params);
                    chose = false;
                    player1card7chosen = false;
                }
            }
        });
        player1cards8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards8.getLayoutParams();
                    params.topMargin = 1000;
                    player1cards8.setLayoutParams(params);
                    chose = true;
                    player1card8chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards8.getLayoutParams();
                    params.topMargin = 1375;
                    player1cards8.setLayoutParams(params);
                    chose = false;
                    player1card8chosen = false;
                }
            }
        });
        player1cards9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards9.getLayoutParams();
                    params.topMargin = 1000;
                    player1cards9.setLayoutParams(params);
                    chose = true;
                    player1card9chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player1cards9.getLayoutParams();
                    params.topMargin = 1375;
                    player1cards9.setLayoutParams(params);
                    chose = false;
                    player1card9chosen = false;
                }
            }
        });
        player2cards1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards1.getLayoutParams();
                    params.topMargin = 1000;
                    player2cards1.setLayoutParams(params);
                    chose = true;
                    player2card1chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards1.getLayoutParams();
                    params.topMargin = 1375;
                    player2cards1.setLayoutParams(params);
                    chose = false;
                    player2card1chosen = false;
                }
            }
        });
        player2cards2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards2.getLayoutParams();
                    params.topMargin = 1000;
                    player2cards2.setLayoutParams(params);
                    chose = true;
                    player2card2chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards2.getLayoutParams();
                    params.topMargin = 1375;
                    player2cards2.setLayoutParams(params);
                    chose = false;
                    player2card2chosen = false;
                }
            }
        });
        player2cards3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards3.getLayoutParams();
                    params.topMargin = 1000;
                    player2cards3.setLayoutParams(params);
                    chose = true;
                    player2card3chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards3.getLayoutParams();
                    params.topMargin = 1375;
                    player2cards3.setLayoutParams(params);
                    chose = false;
                    player2card3chosen = false;
                }
            }
        });
        player2cards4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards4.getLayoutParams();
                    params.topMargin = 1000;
                    player2cards4.setLayoutParams(params);
                    chose = true;
                    player2card4chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards4.getLayoutParams();
                    params.topMargin = 1375;
                    player2cards4.setLayoutParams(params);
                    chose = false;
                    player2card4chosen = false;
                }
            }
        });
        player2cards5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards5.getLayoutParams();
                    params.topMargin = 1000;
                    player2cards5.setLayoutParams(params);
                    chose = true;
                    player2card5chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards5.getLayoutParams();
                    params.topMargin = 1375;
                    player2cards5.setLayoutParams(params);
                    chose = false;
                    player2card5chosen = false;
                }
            }
        });
        player2cards6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards6.getLayoutParams();
                    params.topMargin = 1000;
                    player2cards6.setLayoutParams(params);
                    chose = true;
                    player2card6chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards6.getLayoutParams();
                    params.topMargin = 1375;
                    player2cards6.setLayoutParams(params);
                    chose = false;
                    player2card6chosen = false;
                }
            }
        });
        player2cards7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards7.getLayoutParams();
                    params.topMargin = 1000;
                    player2cards7.setLayoutParams(params);
                    chose = true;
                    player2card7chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards7.getLayoutParams();
                    params.topMargin = 1375;
                    player2cards7.setLayoutParams(params);
                    chose = false;
                    player2card7chosen = false;
                }
            }
        });
        player2cards8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards8.getLayoutParams();
                    params.topMargin = 1000;
                    player2cards8.setLayoutParams(params);
                    chose = true;
                    player2card8chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards8.getLayoutParams();
                    params.topMargin = 1375;
                    player2cards8.setLayoutParams(params);
                    chose = false;
                    player2card8chosen = false;
                }
            }
        });
        player2cards9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chose == false) {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards9.getLayoutParams();
                    params.topMargin = 1000;
                    player2cards9.setLayoutParams(params);
                    chose = true;
                    player2card9chosen = true;
                }else {
                    RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) player2cards9.getLayoutParams();
                    params.topMargin = 1375;
                    player2cards9.setLayoutParams(params);
                    chose = false;
                    player2card9chosen = false;
                }
            }
        });
        drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1card1chosen == true) {
                    cardplaced1.setText(player1card1.getText());
                    player1cards1.setVisibility(View.INVISIBLE);
                    if (isvalet == true) {
                        cardsaid1.setText("J");
                    }
                    if (isdama == true) {
                        cardsaid1.setText("Q");
                    }
                    if (iskarol == true) {
                        cardsaid1.setText("K");
                    }
                    if (istuz == true) {
                        cardsaid1.setText("A");
                    }
                    if (isvalet != true && isdama != true && iskarol != true && istuz != true) {
                        Toast.makeText(game2playerActivity.this, "Pick at least one mast", Toast.LENGTH_SHORT).show();
                    }
                }
                if (player1card2chosen == true) {
                    if(cardsaid1.getText() == "" && cardplaced1.getText() == ""){
                        cardplaced1.setText(player1card2.getText());
                        player1cards2.setVisibility(View.INVISIBLE);
                    }
                    else{
                        cardplaced2.setText(player1card2.getText());
                        player1cards2.setVisibility(View.INVISIBLE);
                    }

                    if (isvalet == true) {
                        if(cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("J");
                        }
                        else{
                            cardsaid2.setText("J");
                        }
                    }
                    if (isdama == true) {
                        if(cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("Q");
                        }
                        else{
                            cardsaid2.setText("Q");
                        }
                    }
                    if (iskarol == true) {
                        if(cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("K");
                        }
                        else{
                            cardsaid2.setText("K");
                        }
                    }
                    if (istuz == true) {
                        if(cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("A");
                        }
                        else{
                            cardsaid2.setText("A");
                        }
                    }
                    if (isvalet != true && isdama != true && iskarol != true && istuz != true) {
                        Toast.makeText(game2playerActivity.this, "Pick at least one mast", Toast.LENGTH_SHORT).show();
                    }
                }
                if (player1card3chosen == true) {
                    if(cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                        cardplaced1.setText(player1card3.getText());
                        player1cards3.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                        cardplaced2.setText(player1card3.getText());
                        player1cards3.setVisibility(View.INVISIBLE);
                    }
                    else{
                        cardplaced3.setText(player1card3.getText());
                        player1cards3.setVisibility(View.INVISIBLE);
                    }

                    if (isvalet == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("J");
                        } else {
                            cardsaid3.setText("J");
                        }
                    }
                    if (isdama == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("Q");
                        } else {
                            cardsaid3.setText("Q");
                        }
                    }
                    if (iskarol == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("K");
                        } else {
                            cardsaid3.setText("K");
                        }
                    }
                    if (istuz == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("A");
                        } else {
                            cardsaid3.setText("A");
                        }
                    }
                    if (isvalet != true && isdama != true && iskarol != true && istuz != true) {
                        Toast.makeText(game2playerActivity.this, "Pick at least one mast", Toast.LENGTH_SHORT).show();
                    }
                }
                if (player1card4chosen == true) {
                    if(cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                        cardplaced1.setText(player1card4.getText());
                        player1cards4.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                        cardplaced2.setText(player1card4.getText());
                        player1cards4.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                        cardplaced3.setText(player1card4.getText());
                        player1cards4.setVisibility(View.INVISIBLE);
                    }
                    else{
                        cardplaced4.setText(player1card4.getText());
                        player1cards4.setVisibility(View.INVISIBLE);
                    }
                    if (isvalet == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("J");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("J");
                        }else {
                            cardsaid4.setText("J");
                        }
                    }
                    if (isdama == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("Q");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("Q");
                        }else {
                            cardsaid4.setText("Q");
                        }
                    }
                    if (iskarol == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("K");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("K");
                        }else {
                            cardsaid4.setText("K");
                        }
                    }
                    if (istuz == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("A");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("A");
                        }else {
                            cardsaid4.setText("A");
                        }
                    }
                    if (isvalet != true && isdama != true && iskarol != true && istuz != true) {
                        Toast.makeText(game2playerActivity.this, "Pick at least one mast", Toast.LENGTH_SHORT).show();
                    }
                }
                if (player1card5chosen == true) {
                    if(cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                        cardplaced1.setText(player1card5.getText());
                        player1cards5.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                        cardplaced2.setText(player1card5.getText());
                        player1cards5.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                        cardplaced3.setText(player1card5.getText());
                        player1cards5.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                        cardplaced4.setText(player1card5.getText());
                        player1cards5.setVisibility(View.INVISIBLE);
                    }
                    else{
                        cardplaced5.setText(player1card5.getText());
                        player1cards5.setVisibility(View.INVISIBLE);
                    }
                    if (isvalet == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("J");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("J");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("J");
                        }else {
                            cardsaid5.setText("J");
                        }
                    }
                    if (isdama == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("Q");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("Q");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("Q");
                        }else {
                            cardsaid5.setText("Q");
                        }
                    }
                    if (iskarol == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("K");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("K");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("K");
                        }else {
                            cardsaid5.setText("K");
                        }
                    }
                    if (istuz == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("A");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("A");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("A");
                        }else {
                            cardsaid5.setText("A");
                        }
                    }
                    if (isvalet != true && isdama != true && iskarol != true && istuz != true) {
                        Toast.makeText(game2playerActivity.this, "Pick at least one mast", Toast.LENGTH_SHORT).show();
                    }
                }
                if (player1card6chosen == true) {
                    if(cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                        cardplaced1.setText(player1card6.getText());
                        player1cards6.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                        cardplaced2.setText(player1card6.getText());
                        player1cards6.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                        cardplaced3.setText(player1card6.getText());
                        player1cards6.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                        cardplaced4.setText(player1card6.getText());
                        player1cards6.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                        cardplaced5.setText(player1card6.getText());
                        player1cards6.setVisibility(View.INVISIBLE);
                    }
                    else{
                        cardplaced6.setText(player1card6.getText());
                        player1cards6.setVisibility(View.INVISIBLE);
                    }
                    if (isvalet == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("J");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("J");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("J");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("J");
                        }else {
                            cardsaid6.setText("J");
                        }
                    }
                    if (isdama == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("Q");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("Q");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("Q");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("Q");
                        }else {
                            cardsaid6.setText("Q");
                        }
                    }
                    if (iskarol == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("K");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("K");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("K");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("K");
                        }else {
                            cardsaid6.setText("K");
                        }
                    }
                    if (istuz == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("A");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("A");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("A");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("A");
                        }else {
                            cardsaid6.setText("A");
                        }
                    }
                    if (isvalet != true && isdama != true && iskarol != true && istuz != true) {
                        Toast.makeText(game2playerActivity.this, "Pick at least one mast", Toast.LENGTH_SHORT).show();
                    }
                }
                if (player1card7chosen == true) {
                    if(cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                        cardplaced1.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                        cardplaced2.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                        cardplaced3.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                        cardplaced4.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                        cardplaced5.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == ""  && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                        cardplaced6.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    else{
                        cardplaced7.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    if (isvalet == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("J");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("J");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("J");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("J");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == ""  && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("J");
                        }else {
                            cardsaid7.setText("J");
                        }
                    }
                    if (isdama == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("Q");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("Q");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("Q");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("Q");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == ""  && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("Q");
                        }else {
                            cardsaid7.setText("Q");
                        }
                    }
                    if (iskarol == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("K");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("K");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("K");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("K");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == ""  && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("K");
                        }else {
                            cardsaid7.setText("K");
                        }
                    }
                    if (istuz == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("A");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("A");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("A");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("A");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == ""  && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("A");
                        }else {
                            cardsaid7.setText("A");
                        }
                    }
                    if (isvalet != true && isdama != true && iskarol != true && istuz != true) {
                        Toast.makeText(game2playerActivity.this, "Pick at least one mast", Toast.LENGTH_SHORT).show();
                    }
                }
                if (player1card7chosen == true) {
                    if(cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                        cardplaced1.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                        cardplaced2.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                        cardplaced3.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                        cardplaced4.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                        cardplaced5.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == ""  && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                        cardplaced6.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    else{
                        cardplaced7.setText(player1card7.getText());
                        player1cards7.setVisibility(View.INVISIBLE);
                    }
                    if (isvalet == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("J");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("J");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("J");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("J");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == ""  && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("J");
                        }else {
                            cardsaid7.setText("J");
                        }
                    }
                    if (isdama == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("Q");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("Q");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("Q");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("Q");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == ""  && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("Q");
                        }else {
                            cardsaid7.setText("Q");
                        }
                    }
                    if (iskarol == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("K");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("K");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("K");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("K");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == ""  && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("K");
                        }else {
                            cardsaid7.setText("K");
                        }
                    }
                    if (istuz == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("A");
                        } else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("A");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("A");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("A");
                        }
                        else if(cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == ""  && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("A");
                        }else {
                            cardsaid7.setText("A");
                        }
                    }
                    if (isvalet != true && isdama != true && iskarol != true && istuz != true) {
                        Toast.makeText(game2playerActivity.this, "Pick at least one mast", Toast.LENGTH_SHORT).show();
                    }
                }
                if (player1card8chosen == true) {
                    if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                        cardplaced1.setText(player1card8.getText());
                        player1cards8.setVisibility(View.INVISIBLE);
                    } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                        cardplaced2.setText(player1card8.getText());
                        player1cards8.setVisibility(View.INVISIBLE);
                    } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                        cardplaced3.setText(player1card8.getText());
                        player1cards8.setVisibility(View.INVISIBLE);
                    } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                        cardplaced4.setText(player1card8.getText());
                        player1cards8.setVisibility(View.INVISIBLE);
                    } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                        cardplaced5.setText(player1card8.getText());
                        player1cards8.setVisibility(View.INVISIBLE);
                    } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                        cardplaced6.setText(player1card8.getText());
                        player1cards8.setVisibility(View.INVISIBLE);
                    } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "") {
                        cardplaced7.setText(player1card8.getText());
                        player1cards8.setVisibility(View.INVISIBLE);
                    } else {
                        cardplaced8.setText(player1card8.getText());
                        player1cards8.setVisibility(View.INVISIBLE);
                    }
                    if (isvalet == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "") {
                            cardsaid7.setText("J");
                        } else {
                            cardsaid8.setText("J");
                        }
                    }
                    if (isdama == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "") {
                            cardsaid7.setText("Q");
                        } else {
                            cardsaid8.setText("Q");
                        }
                    }
                    if (iskarol == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "") {
                            cardsaid7.setText("K");
                        } else {
                            cardsaid8.setText("K");
                        }
                    }
                    if (istuz == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "") {
                            cardsaid7.setText("A");
                        } else {
                            cardsaid8.setText("A");
                        }
                    }
                    if (isvalet != true && isdama != true && iskarol != true && istuz != true) {
                        Toast.makeText(game2playerActivity.this, "Pick at least one mast", Toast.LENGTH_SHORT).show();
                    }
                }
                if (player1card9chosen == true) {
                    if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                        cardplaced1.setText(player1card9.getText());
                        player1cards9.setVisibility(View.INVISIBLE);
                    } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                        cardplaced2.setText(player1card9.getText());
                        player1cards9.setVisibility(View.INVISIBLE);
                    } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                        cardplaced3.setText(player1card9.getText());
                        player1cards9.setVisibility(View.INVISIBLE);
                    } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                        cardplaced4.setText(player1card9.getText());
                        player1cards9.setVisibility(View.INVISIBLE);
                    } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                        cardplaced5.setText(player1card9.getText());
                        player1cards9.setVisibility(View.INVISIBLE);
                    } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                        cardplaced6.setText(player1card9.getText());
                        player1cards9.setVisibility(View.INVISIBLE);
                    } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "") {
                        cardplaced7.setText(player1card9.getText());
                        player1cards9.setVisibility(View.INVISIBLE);
                    }
                    else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "" && cardsaid8.getText() == "" && cardplaced8.getText() == "") {
                        cardplaced8.setText(player1card9.getText());
                        player1cards9.setVisibility(View.INVISIBLE);
                    }else {
                        cardplaced9.setText(player1card9.getText());
                        player1cards9.setVisibility(View.INVISIBLE);
                    }
                    if (isvalet == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("J");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "") {
                            cardsaid7.setText("J");
                        }
                        else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "" && cardsaid8.getText() == "" && cardplaced8.getText() == "") {
                            cardsaid8.setText("J");
                        }
                        else {
                            cardsaid9.setText("J");
                        }
                    }
                    if (isdama == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("Q");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "") {
                            cardsaid7.setText("Q");
                        }
                        else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "" && cardsaid8.getText() == "" && cardplaced8.getText() == "") {
                            cardsaid8.setText("Q");
                        }
                        else {
                            cardsaid9.setText("Q");
                        }
                    }
                    if (iskarol == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("K");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "") {
                            cardsaid7.setText("K");
                        }
                        else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "" && cardsaid8.getText() == "" && cardplaced8.getText() == "") {
                            cardsaid8.setText("K");
                        }
                        else {
                            cardsaid9.setText("K");
                        }
                    }
                    if (istuz == true) {
                        if (cardsaid1.getText() == "" && cardplaced1.getText() == "") {
                            cardsaid1.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "") {
                            cardsaid2.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "") {
                            cardsaid3.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "") {
                            cardsaid4.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "") {
                            cardsaid5.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "") {
                            cardsaid6.setText("A");
                        } else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "") {
                            cardsaid7.setText("A");
                        }
                        else if (cardsaid1.getText() == "" && cardplaced1.getText() == "" && cardsaid2.getText() == "" && cardplaced2.getText() == "" && cardsaid3.getText() == "" && cardplaced3.getText() == "" && cardsaid4.getText() == "" && cardplaced4.getText() == "" && cardsaid5.getText() == "" && cardplaced5.getText() == "" && cardsaid6.getText() == "" && cardplaced6.getText() == "" && cardsaid7.getText() == "" && cardplaced7.getText() == "" && cardsaid8.getText() == "" && cardplaced8.getText() == "") {
                            cardsaid8.setText("J");
                        }
                        else {
                            cardsaid9.setText("J");
                        }
                    }
                    if (isvalet != true && isdama != true && iskarol != true && istuz != true) {
                        Toast.makeText(game2playerActivity.this, "Pick at least one mast", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
        valet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isvalet = true;
                v.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                if(isdama == true){
                    isdama = false;
                    v.setBackgroundColor(Color.parseColor("#FFCCCB"));
                }
                if(iskarol == true){
                    iskarol = false;
                    v.setBackgroundColor(Color.parseColor("#FFCCCB"));
                }
                if(istuz == true){
                    istuz = false;
                    v.setBackgroundColor(Color.parseColor("#FFCCCB"));
                }

            }
        });

        dama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isdama = true;
                v.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                if(isvalet == true){
                    isvalet = false;
                    v.setBackgroundColor(Color.parseColor("#FFCCCB"));
                }
                if(iskarol == true){
                    iskarol = false;
                    v.setBackgroundColor(Color.parseColor("#FFCCCB"));
                }
                if(istuz == true){
                    istuz = false;
                    v.setBackgroundColor(Color.parseColor("#FFCCCB"));
                }

            }
        });

        karol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iskarol = true;
                v.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                if (isvalet == true){
                    isvalet = false;
                    v.setBackgroundColor(Color.parseColor("#FFCCCB"));
                }
                if(isdama == true){
                    isdama = false;
                    v.setBackgroundColor(Color.parseColor("#FFCCCB"));
                }
                if(istuz == true){
                    istuz = false;
                    v.setBackgroundColor(Color.parseColor("#FFCCCB"));
                }

            }
        });

        tuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                istuz = true;
                v.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                if(isvalet == true){
                    isvalet = false;
                    v.setBackgroundColor(Color.parseColor("#FFCCCB"));
                }
                if(isdama == true){
                    isdama = false;
                    v.setBackgroundColor(Color.parseColor("#FFCCCB"));
                }
                if(iskarol == true){
                    iskarol = false;
                    v.setBackgroundColor(Color.parseColor("#FFCCCB"));
                }

            }
        });
    }
}