package com.fm_example.touchthenumber;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import android.widget.Toast;
import android.view.View.OnClickListener;

import java.util.Random;

public class gameactivity extends ActionBarActivity {

    private int c = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameactivity);

        final ImageButton Imgone = (ImageButton) findViewById(R.id.one);
        final ImageButton Imgtwo = (ImageButton) findViewById(R.id.two);
        final ImageButton Imgthr = (ImageButton) findViewById(R.id.three);
        final ImageButton Imgfor = (ImageButton) findViewById(R.id.four);
        final ImageButton Imgfiv = (ImageButton) findViewById(R.id.five);
        final ImageButton Imgsix = (ImageButton) findViewById(R.id.six);
        final ImageButton Imgsev = (ImageButton) findViewById(R.id.seven);
        final ImageButton Imgeig = (ImageButton) findViewById(R.id.eight);
        final ImageButton Imgnin = (ImageButton) findViewById(R.id.nine);
        final ImageButton Imgten = (ImageButton) findViewById(R.id.ten);
        final ImageButton Imgele = (ImageButton) findViewById(R.id.ele);
        final ImageButton Imgtwe = (ImageButton) findViewById(R.id.twel);
        final ImageButton Imgthy = (ImageButton) findViewById(R.id.therty);
        final ImageButton Imgfot = (ImageButton) findViewById(R.id.forty);
        final ImageButton Imgfit = (ImageButton) findViewById(R.id.fifth);
        final ImageButton Imgsit = (ImageButton) findViewById(R.id.sixty);

        ImageButton[] img = {Imgone, Imgtwo, Imgthr, Imgfor, Imgfiv, Imgsix
                , Imgsev, Imgeig, Imgnin, Imgten, Imgele, Imgtwe, Imgthy
                , Imgfot, Imgfit, Imgsit};

        int[] draw = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
                R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
                R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l,
                R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p};

        Random rand = new Random();
        int[] ran = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int i = 0; i < 16; i++) {
            int n = rand.nextInt(16);
            int temp = ran[i];
            ran[i] = ran[n];
            ran[n] = temp;
        }

        for (int i = 0; i < 16; i++) {
            img[ran[i]].setImageResource(draw[i]);
        }

        img[ran[0]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 1) {
                    c++;
                }
            }
        });

        img[ran[1]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 2) {
                    c++;
                }
            }
        });

        img[ran[2]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 3) {
                    c++;
                }
            }
        });

        img[ran[3]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 4) {
                    c++;
                }
            }
        });

        img[ran[4]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 5) {
                    c++;
                }
            }
        });

        img[ran[5]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 6) {
                    c++;
                }
            }
        });

        img[ran[6]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 7) {
                    c++;
                }
            }
        });

        img[ran[7]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 8) {
                    c++;
                }
            }
        });

        img[ran[8]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 9) {
                    c++;
                }
            }
        });

        img[ran[9]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 10) {
                    c++;
                }
            }
        });

        img[ran[10]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 11) {
                    c++;
                }
            }
        });

        img[ran[11]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 12) {
                    c++;
                }
            }
        });

        img[ran[12]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 13) {
                    c++;
                }
            }
        });

        img[ran[13]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 14) {
                    c++;
                }
            }
        });

        img[ran[14]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 15) {
                    c++;
                }
            }
        });


        img[ran[15]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 16) {
                    Toast.makeText(getApplicationContext(), "ゲームクリア",
                            Toast.LENGTH_LONG).show();
                    c++;
                    Button btn1 = (Button) gameactivity.this.findViewById(R.id.egame);
                    btn1.setVisibility(View.VISIBLE);
                }
            }
        });

        Button btnNext = (Button) findViewById(R.id.egame);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c > 16) {
                    Intent intent = new Intent(gameactivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gameactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
