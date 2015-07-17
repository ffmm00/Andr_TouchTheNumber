package com.fm_example.touchthenumber;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import java.util.Random;

public class gameactivity extends ActionBarActivity {

    TextView timerMin, timerSec, timerMs, timerDot1, timerDot2;
    int min, sec, m_Sec;
    private int c = 1;
    long date;
    private Loop loop = new Loop();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameactivity);

        timerMin = (TextView) findViewById(R.id.textView1);
        timerDot1 = (TextView) findViewById(R.id.textView2);
        timerSec = (TextView) findViewById(R.id.textView3);
        timerDot2 = (TextView) findViewById(R.id.textView4);
        timerMs = (TextView) findViewById(R.id.textView5);
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

        final TextView[] timer = {timerMin, timerDot1, timerSec, timerDot2, timerMs};

        ImageButton[] img = {Imgone, Imgtwo, Imgthr, Imgfor, Imgfiv, Imgsix
                , Imgsev, Imgeig, Imgnin, Imgten, Imgele, Imgtwe, Imgthy
                , Imgfot, Imgfit, Imgsit};

        int[] draw = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
                R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
                R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l,
                R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p};

        date = System.currentTimeMillis();
        loop.start();

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

        final ImageButton[] click = {img[ran[0]], img[ran[1]], img[ran[2]], img[ran[3]],
                img[ran[4]], img[ran[5]], img[ran[6]], img[ran[7]], img[ran[8]],
                img[ran[9]], img[ran[10]], img[ran[11]], img[ran[12]], img[ran[13]],
                img[ran[14]], img[ran[15]]};

        img[ran[0]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 1) {
                    click[0].setEnabled(false);
                    click[0].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[1]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 2) {
                    click[1].setEnabled(false);
                    click[1].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[2]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 3) {
                    click[2].setEnabled(false);
                    click[2].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[3]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 4) {
                    click[3].setEnabled(false);
                    click[3].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[4]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 5) {
                    click[4].setEnabled(false);
                    click[4].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[5]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 6) {
                    click[5].setEnabled(false);
                    click[5].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[6]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 7) {
                    click[6].setEnabled(false);
                    click[6].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[7]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 8) {
                    click[7].setEnabled(false);
                    click[7].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[8]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 9) {
                    click[8].setEnabled(false);
                    click[8].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[9]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 10) {
                    click[9].setEnabled(false);
                    click[9].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[10]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 11) {
                    click[10].setEnabled(false);
                    click[10].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[11]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 12) {
                    click[11].setEnabled(false);
                    click[11].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[12]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 13) {
                    click[12].setEnabled(false);
                    click[12].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[13]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 14) {
                    click[13].setEnabled(false);
                    click[13].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });

        img[ran[14]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 15) {
                    click[14].setEnabled(false);
                    click[14].setColorFilter(0xaa808080);
                    c++;
                }
            }
        });


        img[ran[15]].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 16) {
                    click[15].setEnabled(false);
                    click[15].setColorFilter(0xaa808080);
                    loop.stop();
                    Toast.makeText(getApplicationContext(), "ゲームクリア",
                            Toast.LENGTH_LONG).show();
                    c++;
                    Button btn1 = (Button) gameactivity.this.findViewById(R.id.egame);
                    btn1.setVisibility(View.VISIBLE);

                    for (int i = 0; i <= 4; i++) {
                        timer[i].setVisibility(View.VISIBLE);
                    }
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


    public void times() {
        min = (int) (((System.currentTimeMillis() - date)) / 1000) / 60;
        sec = (int) (((System.currentTimeMillis() - date)) / 1000) % 60;
        m_Sec = (int) (((System.currentTimeMillis() - date)) / 10) % 10;
        timerMin.setText(String.format("%1$02d", min));
        timerSec.setText(String.format("%1$02d", sec));
        timerMs.setText(String.format("%1$01d", m_Sec));
    }

    class Loop extends Handler {
        private boolean isUpdate = true;

        public void start() {
            this.isUpdate = true;
            handleMessage(new Message());
        }

        public void stop() {
            this.isUpdate = false;
        }

        public void handleMessage(Message msg) {
            this.removeMessages(0);
            if (this.isUpdate) {
                gameactivity.this.times();
                sendMessageDelayed(obtainMessage(0), 25);

            }
        }


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
