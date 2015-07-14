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
import android.widget.LinearLayout;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class gameactivity extends ActionBarActivity {

    private int c = 1;

    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

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

        Imgone.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 1) {
                    c++;
                    Imgone.setEnabled(false);
                }
            }
        });

        Imgtwo.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 2) {
                    c++;
                    Imgtwo.setEnabled(false);
                }
            }
        });

        Imgthr.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 3) {
                    c++;
                    Imgthr.setEnabled(false);
                }
            }
        });

        Imgfor.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 4) {
                    c++;
                    Imgfor.setEnabled(false);
                }
            }
        });

        Imgfiv.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 5) {
                    c++;
                    Imgfiv.setEnabled(false);
                }
            }
        });

        Imgsix.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 6) {
                    c++;
                    Imgsix.setEnabled(false);
                }
            }
        });

        Imgsev.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 7) {
                    c++;
                    Imgsev.setEnabled(false);
                }
            }
        });

        Imgeig.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 8) {
                    c++;
                    Imgeig.setEnabled(false);
                }
            }
        });

        Imgnin.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 9) {
                    c++;
                    Imgnin.setEnabled(false);
                }
            }
        });

        Imgten.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 10) {
                    c++;
                    Imgten.setEnabled(false);
                }
            }
        });

        Imgele.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 11) {
                    c++;
                    Imgele.setEnabled(false);
                }
            }
        });

        Imgtwe.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 12) {
                    c++;
                    Imgtwe.setEnabled(false);
                }
            }
        });

        Imgthy.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 13) {
                    c++;
                    Imgthy.setEnabled(false);
                }
            }
        });

        Imgfot.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 14) {
                    c++;
                    Imgfot.setEnabled(false);
                }
            }
        });

        Imgfit.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 15) {
                    c++;
                    Imgfit.setEnabled(false);
                }
            }
        });


        Imgsit.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (c == 16) {
                    Toast.makeText(getApplicationContext(), "ゲームクリア",
                            Toast.LENGTH_LONG).show();
                    c++;
                    Imgsit.setEnabled(false);
                    Button btn1 = (Button)gameactivity.this.findViewById(R.id.egame);
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
