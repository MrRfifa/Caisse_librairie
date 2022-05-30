package com.android.caisse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int minteger1 = 0;
    int minteger2 = 0;
    int minteger3 = 0;
    int minteger4 = 0;
    int minteger5 = 0;
    int minteger6 = 0;
    int minteger7 = 0;
    int minteger8 = 0;
    int minteger9 = 0;
    int minteger10 = 0;
    public static final String int1="com.android.caisse.nb1";
    public static final String int2="com.android.caisse.nb2";
    public static final String int3="com.android.caisse.nb3";
    public static final String int4="com.android.caisse.nb4";
    public static final String int5="com.android.caisse.nb5";
    public static final String int6="com.android.caisse.nb6";
    public static final String int7="com.android.caisse.nb7";
    public static final String int8="com.android.caisse.nb8";
    public static final String int9="com.android.caisse.nb9";
    public static final String int10="com.android.caisse.nb10";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCheckout();
            }
        });
        Intent intent=getIntent();
    }

    public void openCheckout(){


        Intent intent=new Intent(this,checkout.class);
        intent.putExtra(int1,minteger1);
        intent.putExtra(int2,minteger2);
        intent.putExtra(int3,minteger3);
        intent.putExtra(int4,minteger4);
        intent.putExtra(int5,minteger5);
        intent.putExtra(int6,minteger6);
        intent.putExtra(int7,minteger7);
        intent.putExtra(int8,minteger8);
        intent.putExtra(int9,minteger9);
        intent.putExtra(int10,minteger10);
        startActivity(intent);
    }
    public void increaseInteger1(View view) {
        minteger1 = minteger1 + 1;
        display1(minteger1);

    }public void decreaseInteger1(View view) {
        if (minteger1>0)
        {minteger1 = minteger1 - 1;}
        else minteger1=0;
        display1(minteger1);
    }


    private void display1(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number1);
        displayInteger.setText("" + number);
    }

    public void increaseInteger2(View view) {
        minteger2 = minteger2 + 1;
        display2(minteger2);

    }public void decreaseInteger2(View view) {
        if (minteger2>0)
        {minteger2 = minteger2 - 1;}
        else minteger2=0;
        display2(minteger2);
    }


    private void display2(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number2);
        displayInteger.setText("" + number);
    }

    public void increaseInteger3(View view) {
        minteger3 = minteger3 + 1;
        display3(minteger3);

    }public void decreaseInteger3(View view) {
        if (minteger3>0)
        {minteger3 = minteger3 - 1;}
        else minteger3=0;
        display3(minteger3);
    }


    private void display3(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number3);
        displayInteger.setText("" + number);
    }



    public void increaseInteger4(View view) {
        minteger4 = minteger4 + 1;
        display4(minteger4);

    }public void decreaseInteger4(View view) {
        if (minteger4>0)
        {minteger4 = minteger4 - 1;}
        else minteger4=0;
        display4(minteger4);
    }


    private void display4(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number4);
        displayInteger.setText("" + number);
    }


    public void increaseInteger5(View view) {
        minteger5 = minteger5 + 1;
        display5(minteger5);

    }public void decreaseInteger5(View view) {
        if (minteger5>0)
        {minteger5 = minteger5 - 1;}
        else minteger5=0;
        display5(minteger5);
    }


    private void display5(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number5);
        displayInteger.setText("" + number);
    }


    public void increaseInteger6(View view) {
        minteger6 = minteger6 + 1;
        display6(minteger6);

    }public void decreaseInteger6(View view) {
        if (minteger6>0)
        {minteger6 = minteger6 - 1;}
        else minteger6=0;
        display6(minteger6);
    }


    private void display6(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number6);
        displayInteger.setText("" + number);
    }

    public void increaseInteger7(View view) {
        minteger7 = minteger7 + 1;
        display7(minteger7);

    }public void decreaseInteger7(View view) {
        if (minteger7>0)
        {minteger7 = minteger7 - 1;}
        else minteger7=0;
        display7(minteger7);
    }


    private void display7(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number7);
        displayInteger.setText("" + number);
    }


    public void increaseInteger8(View view) {
        minteger8 = minteger8 + 1;
        display8(minteger8);

    }public void decreaseInteger8(View view) {
        if (minteger8>0)
        {minteger8 = minteger8 - 1;}
        else minteger8=0;
        display8(minteger8);
    }



    private void display8(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number8);
        displayInteger.setText("" + number);
    }

    public void increaseInteger9(View view) {
        minteger9 = minteger9 + 1;
        display9(minteger9);

    }public void decreaseInteger9(View view) {
        if (minteger9>0)
        {minteger9 = minteger9 - 1;}
        else minteger9=0;
        display9(minteger9);
    }



    private void display9(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number9);
        displayInteger.setText("" + number);
    }

    public void increaseInteger10(View view) {
        minteger10 = minteger10 + 1;
        display10(minteger10);

    }public void decreaseInteger10(View view) {
        if (minteger10>0)
        {minteger10 = minteger10 - 1;}
        else minteger10=0;
        display10(minteger10);
    }


    private void display10(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number10);
        displayInteger.setText("" + number);
    }


}