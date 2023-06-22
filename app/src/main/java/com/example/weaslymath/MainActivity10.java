package com.example.weaslymath;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;


import java.util.ArrayList;

public class MainActivity10 extends AppCompatActivity {
    public Button reset;
    public EditText answer;
    public Button checkanswer;
    public Button exit;
    public TextView tryagain;
    public Button save = findViewById(R.id.save);
    int score = 5;
    public ScoreAdapter adapter;
    public ArrayList<Score> ScoreArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        MediaPlayer music2 = MediaPlayer.create(MainActivity10.this, R.raw.mustbeaweasly);
        music2.start();
        MediaPlayer music = MediaPlayer.create(MainActivity10.this, R.raw.harrypotterthemesong);
        music.start();
        MediaPlayer musicr = MediaPlayer.create(MainActivity10.this, R.raw.followthespiders);
        playAudioWithDelay(musicr);
        reset = findViewById(R.id.buttonreset);
        answer = findViewById(R.id.editTextNumber);
        checkanswer = findViewById(R.id.buttoncheck);
        exit = findViewById(R.id.button2);
        tryagain = findViewById(R.id.textView);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity10.this, MainActivity.class));
                music.pause();
                music2.stop();
                musicr.stop();

            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
        checkanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.parseInt(answer.getText().toString()) == 8) {
                    MediaPlayer music3 = MediaPlayer.create(MainActivity10.this, R.raw.brilliant);
                    music3.start();
                    setContentView(R.layout.activity_main9);
                    musicr.stop();
                    TextView t = findViewById(R.id.textView5);
                    ImageView i = findViewById(R.id.imageView15);
                    Button next = findViewById(R.id.buttonnext2);
                    t.setText("Well weasely, wait unit my father hear about this!");
                    i.setImageResource(R.drawable.malfoy);
                    MediaPlayer draco = MediaPlayer.create(MainActivity10.this, R.raw.waittillmyfatherhearaboutthis);
                    playAudioWithDelay(draco);
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            setContentView(R.layout.activity_main10);
                            EditText answer = findViewById(R.id.editTextNumber);
                            Button checkanswer = findViewById(R.id.buttoncheck);
                            TextView tryagain = findViewById(R.id.textView);
                            tryagain.setText("\nHow about now weasely?");
                            answer.setVisibility(View.INVISIBLE);
                            checkanswer.setVisibility(View.INVISIBLE);
                            ImageView i1 = findViewById(R.id.imageView7);
                            ImageView i2 = findViewById(R.id.imageView16);
                            ImageView i3 = findViewById(R.id.imageView4);
                            ImageView i4 = findViewById(R.id.imageView6);
                            ImageView i5 = findViewById(R.id.imageView13);
                            ImageView i6 = findViewById(R.id.imageView9);
                            ImageView i7 = findViewById(R.id.imageView14);
                            ImageView i8 = findViewById(R.id.imageView10);
                            ImageView plus = findViewById(R.id.imageView17);
                            ImageView d = findViewById(R.id.imageView11);
                            ImageView b = findViewById(R.id.imageView3);
                            i1.setVisibility(View.INVISIBLE);
                            i2.setVisibility(View.INVISIBLE);
                            i3.setVisibility(View.INVISIBLE);
                            i4.setVisibility(View.INVISIBLE);
                            i5.setVisibility(View.INVISIBLE);
                            i6.setVisibility(View.INVISIBLE);
                            i7.setVisibility(View.INVISIBLE);
                            i8.setVisibility(View.INVISIBLE);
                            plus.setVisibility(View.INVISIBLE);
                            TextView q = findViewById(R.id.questions);
                            EditText n2 = findViewById(R.id.editTextNumber2);
                            EditText n3 = findViewById(R.id.editTextNumber3);
                            EditText n4 = findViewById(R.id.editTextNumber4);
                            EditText n5 = findViewById(R.id.editTextNumber5);
                            EditText n6 = findViewById(R.id.editTextNumber6);
                            Button check = findViewById(R.id.check);
                            Button showscore = findViewById(R.id.score);
                            TextView textView = findViewById(R.id.textView6);
                            q.setVisibility(View.VISIBLE);
                            n2.setVisibility(View.VISIBLE);
                            n3.setVisibility(View.VISIBLE);
                            n4.setVisibility(View.VISIBLE);
                            n5.setVisibility(View.VISIBLE);
                            n6.setVisibility(View.VISIBLE);
                            check.setVisibility(View.VISIBLE);
                            check.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    d.setVisibility(View.INVISIBLE);
                                    tryagain.setVisibility(View.INVISIBLE);
                                    b.setVisibility(View.INVISIBLE);
                                    check.setVisibility(View.INVISIBLE);
                                    showscore.setVisibility(View.VISIBLE);
                                    if (Integer.parseInt(n2.getText().toString()) == 20) {
                                        n2.setBackgroundColor(getColor(R.color.green));
                                        score++;
                                    }
                                    if (Integer.parseInt(n3.getText().toString()) == 9) {
                                        n3.setBackgroundColor(getColor(R.color.green));
                                        score++;
                                    }
                                    if (Integer.parseInt(n4.getText().toString()) == 5) {
                                        n4.setBackgroundColor(getColor(R.color.green));
                                        score++;
                                    }
                                    if (Integer.parseInt(n5.getText().toString()) == 11) {
                                        n5.setBackgroundColor(getColor(R.color.green));
                                        score++;
                                    }
                                    if (Integer.parseInt(n6.getText().toString()) == 5) {
                                        n6.setBackgroundColor(getColor(R.color.green));
                                        score++;
                                    }
                                    showscore.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            q.setVisibility(View.INVISIBLE);
                                            n2.setVisibility(View.INVISIBLE);
                                            n3.setVisibility(View.INVISIBLE);
                                            n4.setVisibility(View.INVISIBLE);
                                            n5.setVisibility(View.INVISIBLE);
                                            n6.setVisibility(View.INVISIBLE);
                                            textView.setVisibility(View.VISIBLE);
                                            textView.setText("Thank you for helping Ron! \n your score is : " + score + "/10");
                                            ScoreArrayList.add(new Score(System.currentTimeMillis(),score));
                                            adapter.notifyItemInserted(ScoreArrayList.size());
                                            save.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {
                                                  saveData();
                                                    Intent resultIntent = new Intent(MainActivity10.this, MainActivity11.class);
                                                    resultIntent.putParcelableArrayListExtra("scores", (ArrayList<? extends Parcelable>) ScoreArrayList);
                                                    startActivity(resultIntent);

                                                }
                                            });


                                        }
                                    });

                                }
                            });

                        }
                    });

                } else if (answer.getText().equals("") | Integer.parseInt(answer.getText().toString()) != 8) {
                    tryagain.setText("\n not even close weasely!");

                }
            }
        });


    }

    public void playAudioWithDelay(MediaPlayer m) {
        Handler handler = new Handler();
        final int DELAY = 5000;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                m.start();

            }
        }, DELAY);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                m.start();

            }
        }, DELAY * 3);
    }
    private void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("Scores", null);
        Type type = new TypeToken<ArrayList<Score>>() {}.getType();
        ScoreArrayList = gson.fromJson(json, type);
        if (ScoreArrayList == null) {
            ScoreArrayList = new ArrayList<>();
        }
    }

    private void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(ScoreArrayList);
        editor.putString("Scores", json);
        editor.apply();
        Toast.makeText(this, "Saved Array List to Shared preferences. ", Toast.LENGTH_SHORT).show();
    }

}