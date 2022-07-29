package com.example.xo_buttons;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int counter = 1;
    Button polje_1, polje_2, polje_3, polje_4, polje_5, polje_6, polje_7, polje_8, polje_9;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        polje_1 = (Button) findViewById(R.id.polje_1);
        polje_2 = (Button) findViewById(R.id.polje_2);
        polje_3 = (Button) findViewById(R.id.polje_3);
        polje_4 = (Button) findViewById(R.id.polje_4);
        polje_5 = (Button) findViewById(R.id.polje_5);
        polje_6 = (Button) findViewById(R.id.polje_6);
        polje_7 = (Button) findViewById(R.id.polje_7);
        polje_8 = (Button) findViewById(R.id.polje_8);
        polje_9 = (Button) findViewById(R.id.polje_9);
        btnReset = (Button) findViewById(R.id.btnReset);

        polje_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter % 2 != 0) {
                    polje_1.setText("X");
                    counter++;
                    polje_1.setEnabled(false);
                    checkWinner();
                    draw();


                } else {
                    polje_1.setText("O");
                    counter++;
                    polje_1.setEnabled(false);
                    checkWinnerO();
                    draw();


                }
            }


        });
        polje_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter % 2 != 0) {
                    polje_2.setText("X");
                    counter++;
                    polje_2.setEnabled(false);
                    checkWinner();draw();


                } else {
                    polje_2.setText("O");
                    counter++;
                    polje_2.setEnabled(false);
                    checkWinnerO();draw();


                }
            }
        });
        polje_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter % 2 != 0) {
                    polje_3.setText("X");
                    counter++;
                    polje_3.setEnabled(false);
                    checkWinner();draw();


                } else {
                    polje_3.setText("O");
                    counter++;
                    polje_3.setEnabled(false);
                    checkWinnerO();draw();


                }
            }
        });
        polje_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter % 2 != 0) {
                    polje_4.setText("X");
                    counter++;
                    polje_4.setEnabled(false);
                    checkWinner();draw();


                } else {
                    polje_4.setText("O");
                    counter++;
                    polje_4.setEnabled(false);
                    checkWinnerO();draw();


                }
            }
        });
        polje_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter % 2 != 0) {
                    polje_5.setText("X");
                    counter++;
                    polje_5.setEnabled(false);
                    checkWinner();draw();


                } else {
                    polje_5.setText("O");
                    counter++;
                    polje_5.setEnabled(false);
                    checkWinnerO();draw();

                }
            }
        });
        polje_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter % 2 != 0) {
                    polje_6.setText("X");
                    counter++;
                    polje_6.setEnabled(false);
                    checkWinner();draw();

                } else {
                    polje_6.setText("O");
                    counter++;
                    polje_6.setEnabled(false);
                    checkWinnerO();draw();

                }
            }
        });
        polje_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter % 2 != 0) {
                    polje_7.setText("X");
                    counter++;
                    polje_7.setEnabled(false);
                    checkWinner();draw();


                } else {
                    polje_7.setText("O");
                    counter++;
                    polje_7.setEnabled(false);
                    checkWinnerO();draw();

                }
            }
        });
        polje_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter % 2 != 0) {
                    polje_8.setText("X");
                    counter++;
                    polje_8.setEnabled(false);
                    checkWinner();draw();

                } else {
                    polje_8.setText("O");
                    counter++;
                    polje_8.setEnabled(false);
                    checkWinnerO();draw();

                }
            }
        });
        polje_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter % 2 != 0) {
                    polje_9.setText("X");
                    counter++;
                    polje_9.setEnabled(false);
                    checkWinner();draw();

                } else {
                    polje_9.setText("O");
                    counter++;
                    polje_9.setEnabled(false);
                    checkWinnerO();draw();

                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                polje_1.setText("");
                polje_1.setEnabled(true);
                polje_2.setText("");
                polje_2.setEnabled(true);
                polje_3.setText("");
                polje_3.setEnabled(true);
                polje_4.setText("");
                polje_4.setEnabled(true);
                polje_5.setText("");
                polje_5.setEnabled(true);
                polje_6.setText("");
                polje_6.setEnabled(true);
                polje_7.setText("");
                polje_7.setEnabled(true);
                polje_8.setText("");
                polje_8.setEnabled(true);
                polje_9.setText("");
                polje_9.setEnabled(true);
                counter = 0;
            }
        });


    }

    private void draw() {
        if(!polje_1.isEnabled() && !polje_2.isEnabled() && !polje_3.isEnabled() && !polje_4.isEnabled() && !polje_5.isEnabled()
        && !polje_6.isEnabled() && !polje_7.isEnabled() && !polje_8.isEnabled() && !polje_9.isEnabled()){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("DRAW");
            builder.setPositiveButton("Dismmis", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            builder.setNegativeButton("Restart", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    polje_1.setText("");
                    polje_1.setEnabled(true);
                    polje_2.setText("");
                    polje_2.setEnabled(true);
                    polje_3.setText("");
                    polje_3.setEnabled(true);
                    polje_4.setText("");
                    polje_4.setEnabled(true);
                    polje_5.setText("");
                    polje_5.setEnabled(true);
                    polje_6.setText("");
                    polje_6.setEnabled(true);
                    polje_7.setText("");
                    polje_7.setEnabled(true);
                    polje_8.setText("");
                    polje_8.setEnabled(true);
                    polje_9.setText("");
                    polje_9.setEnabled(true);
                    counter = 0;
                }
            });
            builder.create().show();

        }

    }

    private void checkWinnerO() {
        if (polje_1.getText().toString().equals("O") && polje_2.getText().toString().equals("O") && polje_3.getText().toString().equals("O")
                || polje_4.getText().toString().equals("O") && polje_5.getText().toString().equals("O") && polje_6.getText().toString().equals("O")
                || polje_7.getText().toString().equals("O") && polje_8.getText().toString().equals("O") && polje_9.getText().toString().equals("O")
                ||  polje_1.getText().toString().equals("O") && polje_4.getText().toString().equals("O") && polje_7.getText().toString().equals("O")
                ||  polje_2.getText().toString().equals("O") && polje_5.getText().toString().equals("O") && polje_8.getText().toString().equals("O")
                ||  polje_3.getText().toString().equals("O") && polje_6.getText().toString().equals("O") && polje_9.getText().toString().equals("O")
                ||  polje_1.getText().toString().equals("O") && polje_5.getText().toString().equals("O") && polje_9.getText().toString().equals("O")
                ||  polje_3.getText().toString().equals("O") && polje_5.getText().toString().equals("O") && polje_7.getText().toString().equals("O")
        ) {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Player 2 WON");
//            builder.setPositiveButton("Dismiss", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//
//                }
//            });
            builder.setPositiveButton("Reset", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    polje_1.setText("");
                    polje_1.setEnabled(true);
                    polje_2.setText("");
                    polje_2.setEnabled(true);
                    polje_3.setText("");
                    polje_3.setEnabled(true);
                    polje_4.setText("");
                    polje_4.setEnabled(true);
                    polje_5.setText("");
                    polje_5.setEnabled(true);
                    polje_6.setText("");
                    polje_6.setEnabled(true);
                    polje_7.setText("");
                    polje_7.setEnabled(true);
                    polje_8.setText("");
                    polje_8.setEnabled(true);
                    polje_9.setText("");
                    polje_9.setEnabled(true);
                }
            });
            builder.create().show();

        }
    }

    private void checkWinner() {
        if (polje_1.getText().toString().equals("X") && polje_2.getText().toString().equals("X") && polje_3.getText().toString().equals("X")
                || polje_4.getText().toString().equals("X") && polje_5.getText().toString().equals("X") && polje_6.getText().toString().equals("X")
                || polje_7.getText().toString().equals("X") && polje_8.getText().toString().equals("X") && polje_9.getText().toString().equals("X")
                ||  polje_1.getText().toString().equals("X") && polje_4.getText().toString().equals("X") && polje_7.getText().toString().equals("X")
                ||  polje_2.getText().toString().equals("X") && polje_5.getText().toString().equals("X") && polje_8.getText().toString().equals("X")
                ||  polje_3.getText().toString().equals("X") && polje_6.getText().toString().equals("X") && polje_9.getText().toString().equals("X")
                ||  polje_1.getText().toString().equals("X") && polje_5.getText().toString().equals("X") && polje_9.getText().toString().equals("X")
                ||  polje_3.getText().toString().equals("X") && polje_5.getText().toString().equals("X") && polje_7.getText().toString().equals("X")
        ) {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Player 1 WON");
//            builder.setPositiveButton("Dismiss", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//
//                }
//            });
            builder.setPositiveButton("Restart", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    polje_1.setText("");
                    polje_1.setEnabled(true);
                    polje_2.setText("");
                    polje_2.setEnabled(true);
                    polje_3.setText("");
                    polje_3.setEnabled(true);
                    polje_4.setText("");
                    polje_4.setEnabled(true);
                    polje_5.setText("");
                    polje_5.setEnabled(true);
                    polje_6.setText("");
                    polje_6.setEnabled(true);
                    polje_7.setText("");
                    polje_7.setEnabled(true);
                    polje_8.setText("");
                    polje_8.setEnabled(true);
                    polje_9.setText("");
                    polje_9.setEnabled(true);
                }
            });
            builder.create().show();

        }
    }


}




