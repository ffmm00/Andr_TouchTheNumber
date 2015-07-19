package com.fm_example.touchthenumber;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import java.util.Arrays;
import java.util.Random;

public class gameactivity extends ActionBarActivity {

    TextView timerMin, timerSec, timerMs, timerDot1, timerDot2, missCountText, missTimes, clear;
    int min, sec, mSec;
    private int number = 0, missCount = 0;
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
        missCountText = (TextView) findViewById(R.id.textView6);
        missTimes = (TextView) findViewById(R.id.textView7);
        clear = (TextView) findViewById(R.id.textView11);
        final ImageButton imgOne = (ImageButton) findViewById(R.id.one);
        final ImageButton imgTwo = (ImageButton) findViewById(R.id.two);
        final ImageButton imgThree = (ImageButton) findViewById(R.id.three);
        final ImageButton imgFour = (ImageButton) findViewById(R.id.four);
        final ImageButton imgFive = (ImageButton) findViewById(R.id.five);
        final ImageButton imgSix = (ImageButton) findViewById(R.id.six);
        final ImageButton imgSeven = (ImageButton) findViewById(R.id.seven);
        final ImageButton imgEight = (ImageButton) findViewById(R.id.eight);
        final ImageButton imgNine = (ImageButton) findViewById(R.id.nine);
        final ImageButton imgTen = (ImageButton) findViewById(R.id.ten);
        final ImageButton imgEleven = (ImageButton) findViewById(R.id.eleven);
        final ImageButton imgTwelve = (ImageButton) findViewById(R.id.twelve);
        final ImageButton imgThrteen = (ImageButton) findViewById(R.id.thirteen);
        final ImageButton imgFourteen = (ImageButton) findViewById(R.id.fourteen);
        final ImageButton imgFifteen = (ImageButton) findViewById(R.id.fifteen);
        final ImageButton imgSiteen = (ImageButton) findViewById(R.id.sixteen);
        final ImageButton imgSeventeen = (ImageButton) findViewById(R.id.seventeen);
        final ImageButton imgEighteen = (ImageButton) findViewById(R.id.eighteen);

        final TextView[] timer = {timerMin, timerDot1, timerSec, timerDot2, timerMs,
                missCountText, clear,missTimes};

        ImageButton[] img = {imgOne, imgTwo, imgThree, imgFour, imgFive, imgSix
                , imgSeven, imgEight, imgNine, imgTen, imgEleven, imgTwelve, imgThrteen
                , imgFourteen, imgFifteen, imgSiteen, imgSeventeen, imgEighteen};

        int[] draw = {R.drawable.icon_01, R.drawable.icon_02, R.drawable.icon_03, R.drawable.icon_04,
                R.drawable.icon_05, R.drawable.icon_06, R.drawable.icon_07, R.drawable.icon_08,
                R.drawable.icon_09, R.drawable.icon_10, R.drawable.icon_11, R.drawable.icon_12,
                R.drawable.icon_13, R.drawable.icon_14, R.drawable.icon_15, R.drawable.icon_16,
                R.drawable.icon_17, R.drawable.icon_18, R.drawable.icon_19, R.drawable.icon_20,
                R.drawable.icon_21, R.drawable.icon_22, R.drawable.icon_23, R.drawable.icon_24,
                R.drawable.icon_25, R.drawable.icon_26, R.drawable.icon_27, R.drawable.icon_28,
                R.drawable.icon_29, R.drawable.icon_30, R.drawable.icon_31, R.drawable.icon_32,
                R.drawable.icon_33, R.drawable.icon_34, R.drawable.icon_35, R.drawable.icon_36,
                R.drawable.icon_37, R.drawable.icon_38, R.drawable.icon_39, R.drawable.icon_40,
                R.drawable.icon_41,};

        Random rand = new Random();

        int[] randomPictureNum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40};

        for (int i = 0; i < 41; i++) {
            int n = rand.nextInt(41);
            int temp = randomPictureNum[i];
            randomPictureNum[i] = randomPictureNum[n];
            randomPictureNum[n] = temp;
        }

        int[] picture = new int[18];

        for (int i = 0; i < 18; i++) {
            picture[i] = randomPictureNum[i];
        }

        Arrays.sort(picture);


        final int oddNum[] = new int[18];

        for (int i = 0; i < 18; i++) {
            if (picture[i] % 2 == 0) {
                oddNum[i]++;
            }
        }


        int[] randomNum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

        for (int i = 0; i < 18; i++) {
            int n = rand.nextInt(18);
            int temp = randomNum[i];
            randomNum[i] = randomNum[n];
            randomNum[n] = temp;
        }

        for (int i = 0; i < 18; i++) {
            img[randomNum[i]].setImageResource(draw[picture[i]]);
        }

        final ImageButton[] click = {img[randomNum[0]], img[randomNum[1]], img[randomNum[2]],
                img[randomNum[3]], img[randomNum[4]], img[randomNum[5]], img[randomNum[6]],
                img[randomNum[7]], img[randomNum[8]], img[randomNum[9]], img[randomNum[10]],
                img[randomNum[11]], img[randomNum[12]], img[randomNum[13]],
                img[randomNum[14]], img[randomNum[15]], img[randomNum[16]], img[randomNum[17]]};

        date = System.currentTimeMillis();
        loop.start();

        click[0].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number >= 3)
                    missCount++;
                if (number == 0 || number == 1) {
                    if (oddNum[0] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 2) {
                    click[0].setSoundEffectsEnabled(false);
                    click[0].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[1].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 2 || number >= 6)
                    missCount++;
                if (number == 3 || number == 4) {
                    if (oddNum[1] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 5) {
                    click[1].setSoundEffectsEnabled(false);
                    click[1].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[2].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 5 || number >= 9)
                    missCount++;
                if (number == 6 || number == 7) {
                    if (oddNum[2] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 8) {
                    click[2].setSoundEffectsEnabled(false);
                    click[2].setColorFilter(0xaa808080);
                    number++;
                }

            }
        });

        click[3].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 8 || number >= 12)
                    missCount++;
                if (number == 9 || number == 10) {
                    if (oddNum[3] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 11) {
                    click[3].setSoundEffectsEnabled(false);
                    click[3].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[4].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 11 || number >= 15)
                    missCount++;
                if (number == 12 || number == 13) {
                    if (oddNum[4] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 14) {
                    click[4].setSoundEffectsEnabled(false);
                    click[4].setColorFilter(0xaa808080);
                    number++;
                }

            }
        });

        click[5].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 14 || number >= 18)
                    missCount++;
                if (number == 15 || number == 16) {
                    if (oddNum[5] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 17) {
                    click[5].setSoundEffectsEnabled(false);
                    click[5].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[6].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 17 || number >= 21)
                    missCount++;
                if (number == 18 || number == 19) {
                    if (oddNum[6] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 20) {
                    click[6].setSoundEffectsEnabled(false);
                    click[6].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[7].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 20 || number >= 24)
                    missCount++;
                if (number == 21 || number == 22) {
                    if (oddNum[7] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 23) {
                    click[7].setSoundEffectsEnabled(false);
                    click[7].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[8].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 23 || number >= 27)
                    missCount++;
                if (number == 24 || number == 25) {
                    if (oddNum[8] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 26) {
                    click[8].setSoundEffectsEnabled(false);
                    click[8].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[9].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 26 || number >= 30)
                    missCount++;
                if (number == 27 || number == 28) {
                    if (oddNum[9] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 29) {
                    click[9].setSoundEffectsEnabled(false);
                    click[9].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[10].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 29 || number >= 33)
                    missCount++;
                if (number == 30 || number == 31) {
                    if (oddNum[10] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 32) {
                    click[10].setSoundEffectsEnabled(false);
                    click[10].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[11].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 32 || number >= 36)
                    missCount++;
                if (number == 33 || number == 34) {
                    if (oddNum[11] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 35) {
                    click[11].setSoundEffectsEnabled(false);
                    click[11].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[12].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 35 || number >= 39)
                    missCount++;
                if (number == 36 || number == 37) {
                    if (oddNum[12] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 38) {
                    click[12].setSoundEffectsEnabled(false);
                    click[12].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[13].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 38 || number >= 42)
                    missCount++;
                if (number == 39 || number == 40) {
                    if (oddNum[13] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 41) {
                    click[13].setSoundEffectsEnabled(false);
                    click[13].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[14].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 41 || number >= 45)
                    missCount++;
                if (number == 42 || number == 43) {
                    if (oddNum[14] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 44) {
                    click[14].setSoundEffectsEnabled(false);
                    click[14].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[15].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 44 || number >= 48)
                    missCount++;
                if (number == 45 || number == 46) {
                    if (oddNum[15] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 47) {
                    click[15].setSoundEffectsEnabled(false);
                    click[15].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });

        click[16].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 47 || number >= 51)
                    missCount++;
                if (number == 48 || number == 49) {
                    if (oddNum[16] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 50) {
                    click[16].setSoundEffectsEnabled(false);
                    click[16].setColorFilter(0xaa808080);
                    number++;
                }
            }
        });


        click[17].setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (number <= 50)
                    missCount++;
                if (number == 51 || number == 52) {
                    if (oddNum[17] == 1) {
                        number++;
                    } else
                        number += 2;
                }

                if (number == 53) {
                    click[17].setSoundEffectsEnabled(false);
                    click[17].setColorFilter(0xaa808080);
                    loop.stop();
                    Toast.makeText(getApplicationContext(), "ゲームクリア",
                            Toast.LENGTH_LONG).show();
                    number++;
                    Button btn1 = (Button) gameactivity.this.findViewById(R.id.egame);
                    btn1.setVisibility(View.VISIBLE);
                    for (int i = 0; i <= 7; i++) {
                        timer[i].setVisibility(View.VISIBLE);
                    }
                    missTimes.setText(String.format("%1$02d", missCount));
                }
            }
        });

        Button btnNext = (Button) findViewById(R.id.egame);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gameactivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


    public void times() {
        min = (int) (((System.currentTimeMillis() - date)) / 1000) / 60;
        sec = (int) (((System.currentTimeMillis() - date)) / 1000) % 60;
        mSec = (int) (((System.currentTimeMillis() - date)) / 10) % 10;
        timerMin.setText(String.format("%1$02d", min));
        timerSec.setText(String.format("%1$02d", sec));
        timerMs.setText(String.format("%1$01d", mSec));
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
