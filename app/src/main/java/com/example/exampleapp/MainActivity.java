package com.example.exampleapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.exampleapp.R.raw.welcome_to_le_club_b;
import static com.example.exampleapp.R.raw.sound_12010;

public class MainActivity extends AppCompatActivity {

    private Button sum;
    private Button btn;
    private Button btn2;
    private Button btn3;
    private EditText pass;
    private Button btn4;
    private Button btn5;
    private Button exit;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

        view = this.getWindow().getDecorView();

    }


    @SuppressLint("SetTextI18n")
    public void onButtonClick(View v) {
        EditText ob1 = (EditText) findViewById(R.id.num1);
        EditText ob2 = (EditText) findViewById(R.id.num2);
        TextView resText = (TextView) findViewById(R.id.result);
            if (ob1.getText().length() * ob2.getText().length() == 0) {
                Toast.makeText(
                    MainActivity.this, "Че ахуел?",
                    Toast.LENGTH_SHORT
                 ).show(); }
            else {
                int num1 = Integer.parseInt(ob1.getText().toString());
                int num2 = Integer.parseInt(ob2.getText().toString());
                int resSum = num1 + num2;
                resText.setText(Integer.toString(resSum));
            }
    }

    @SuppressLint("SetTextI18n")
    public void onButtonClick1(View v) {
        EditText ob1 = (EditText) findViewById(R.id.num1);
        EditText ob2 = (EditText) findViewById(R.id.num2);
        TextView resText = (TextView) findViewById(R.id.result);
        if (ob1.getText().length() * ob2.getText().length() == 0) {
            Toast.makeText(
                    MainActivity.this, "Не петух ли ты?",
                    Toast.LENGTH_SHORT
            ).show(); }
        else {
            int num1 = Integer.parseInt(ob1.getText().toString());
            int num2 = Integer.parseInt(ob2.getText().toString());
            int resSum = num1 - num2;
            resText.setText(Integer.toString(resSum));
        }
    }

    @SuppressLint("SetTextI18n")
    public void onButtonClick2(View v) {
        EditText ob1 = (EditText) findViewById(R.id.num1);
        EditText ob2 = (EditText) findViewById(R.id.num2);
        TextView resText = (TextView) findViewById(R.id.result);
        if (ob1.getText().length() * ob2.getText().length() == 0) {
            Toast.makeText(
                    MainActivity.this, "Готовь очко",
                    Toast.LENGTH_SHORT
            ).show(); }
        else {
            int num1 = Integer.parseInt(ob1.getText().toString());
            int num2 = Integer.parseInt(ob2.getText().toString());
            int resSum = num1 * num2;
            resText.setText(Integer.toString(resSum));
        }
    }

    @SuppressLint("SetTextI18n")
    public void onButtonClick3(View v) {
        EditText ob1 = (EditText) findViewById(R.id.num1);
        EditText ob2 = (EditText) findViewById(R.id.num2);
        TextView resText = (TextView) findViewById(R.id.result);
        if (ob1.getText().length() * ob2.getText().length() == 0) {
            Toast.makeText(
                    MainActivity.this, "Только на нолик не дели, плиз",
                    Toast.LENGTH_SHORT
            ).show();
        } else {
                double num1 = Integer.parseInt(ob1.getText().toString());
                double num2 = Integer.parseInt(ob2.getText().toString());
            if (num2 == 0) {
                Toast.makeText(
                        MainActivity.this, "Ну попросил же, сучка :(",
                        Toast.LENGTH_SHORT
                ).show();
            } else {
                double resSum = num1 / num2;
                resText.setText(Double.toString(resSum));
            }
        }
    }

    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void goGay(View view) {

        sum = (Button) findViewById(R.id.sum);
        btn = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);

        pass = (EditText) findViewById(R.id.editText);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        exit = (Button) findViewById(R.id.exit);
        if (pass.getText().toString().equals("gay")) {
            this.view.setBackgroundColor(Color.parseColor("#FFB5C1"));
            final MediaPlayer ClubMP = MediaPlayer.create(this, welcome_to_le_club_b);
            ClubMP.start();
            btn5.setVisibility(View.VISIBLE);
            btn4.setText("DJ Миша");
            btn4.setBackgroundTintList(ColorStateList.valueOf((Color.parseColor("#A5FEFD"))));
            btn4.setTextColor(Color.parseColor("#FF9DC1"));
            btn5.setBackgroundTintList(ColorStateList.valueOf((Color.parseColor("#A5FEFD"))));
            btn5.setTextColor(Color.parseColor("#FF9DC1"));


            sum.setBackgroundTintList(ColorStateList.valueOf((Color.parseColor("#A5FEFD"))));
            sum.setTextColor(Color.parseColor("#FF9DC1"));
            btn.setBackgroundTintList(ColorStateList.valueOf((Color.parseColor("#A5FEFD"))));
            btn.setTextColor(Color.parseColor("#FF9DC1"));
            btn2.setBackgroundTintList(ColorStateList.valueOf((Color.parseColor("#A5FEFD"))));
            btn2.setTextColor(Color.parseColor("#FF9DC1"));
            btn3.setBackgroundTintList(ColorStateList.valueOf((Color.parseColor("#A5FEFD"))));
            btn3.setTextColor(Color.parseColor("#FF9DC1"));
            exit.setBackgroundTintList(ColorStateList.valueOf((Color.parseColor("#A5FEFD"))));
            exit.setTextColor(Color.parseColor("#FF9DC1"));

            Toast.makeText(
                    MainActivity.this, "Let's try " + btn5.getText(),
                    Toast.LENGTH_SHORT
            ).show();
        }
        else {
            Toast.makeText(
                    MainActivity.this, "Хуй соси" ,
                    Toast.LENGTH_SHORT
            ).show();
        }
    }

    public void addListenerOnButton() {
        btn5 = (Button) findViewById(R.id.button5);
        exit = (Button) findViewById(R.id.exit);
        final MediaPlayer Exit = MediaPlayer.create(this, sound_12010);
        btn5.setOnClickListener(
                new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                    @Override
                    public void onClick(View v) {
                        getWindow().setBackgroundDrawableResource(R.drawable.gradient);
                    }
                }
        );
        exit.setOnClickListener(
                new View.OnClickListener() {


                    @Override
                    public void onClick(View v) {
                        Exit.start();
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setMessage("Закрыть приложение?").setCancelable(false)
                                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert = builder.create();
                        alert.setTitle("Выход");
                        alert.show();
                    }
                }
        );
    }
}
