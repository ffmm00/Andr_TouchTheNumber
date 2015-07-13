package com.fm_example.touchthenumber;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class gameactivity extends ActionBarActivity {

    private ImageButton imageButton;
    private int c = 0;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameactivity);


        ImageButton Imgone = (ImageButton) findViewById(R.id.one);
        ImageButton Imgtwo = (ImageButton) findViewById(R.id.two);
        ImageButton Imgthr = (ImageButton) findViewById(R.id.three);
        ImageButton Imgfor = (ImageButton) findViewById(R.id.four);
        ImageButton Imgfiv = (ImageButton) findViewById(R.id.five);
        ImageButton Imgsix = (ImageButton) findViewById(R.id.six);
        ImageButton Imgsev = (ImageButton) findViewById(R.id.seven);
        ImageButton Imgeig = (ImageButton) findViewById(R.id.eight);
        ImageButton Imgnin = (ImageButton) findViewById(R.id.nine);
        ImageButton Imgten = (ImageButton) findViewById(R.id.ten);
        ImageButton Imgele = (ImageButton) findViewById(R.id.ele);
        ImageButton Imgtwe = (ImageButton) findViewById(R.id.twel);
        ImageButton Imgthy = (ImageButton) findViewById(R.id.therty);
        ImageButton Imgfot = (ImageButton) findViewById(R.id.forty);
        ImageButton Imgfit = (ImageButton) findViewById(R.id.fifth);
        ImageButton Imgsit = (ImageButton) findViewById(R.id.sixty);

        ImageButton images[] = {Imgone, Imgtwo, Imgthr, Imgfor, Imgfiv};

        for (i = 0; i < 5; i++) {
            images[i].setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    if (c < 3) {
                        Toast.makeText(getApplicationContext(), "test",
                                Toast.LENGTH_SHORT).show();
                        c++;
                    } else
                        Toast.makeText(getApplicationContext(), "ゲーム終了",
                                Toast.LENGTH_SHORT).show();
                }
            });
        }
        Button btnNext = (Button) findViewById(R.id.button2);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c >= 3) {
                    Intent intent = new Intent(gameactivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        Imgsix.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 6)
                    c++;
            }
        });

        Imgsev.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 7)
                    c++;
            }
        });

        Imgeig.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 8)
                    c++;
            }
        });

        Imgnin.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 9)
                    c++;
            }
        });

        Imgten.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 10)
                    c++;
            }
        });

        Imgele.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 11)
                    c++;
            }
        });

        Imgtwe.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 12)
                    c++;
            }
        });

        Imgthy.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 13)
                    c++;
            }
        });

        Imgfot.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 14)
                    c++;
            }
        });

        Imgfit.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 15)
                    c++;
            }
        });

        Imgsit.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 16) {
                    Toast.makeText(getApplicationContext(), "testゲーム終了",
                            Toast.LENGTH_SHORT).show();
                    c++;
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
