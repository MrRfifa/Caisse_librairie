package com.android.caisse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class checkout extends AppCompatActivity {

    public static final String total_pay="com.android.caisse.total";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        Intent intent=getIntent();
        int nb1=intent.getIntExtra(MainActivity.int1,0);
        int nb2=intent.getIntExtra(MainActivity.int2,0);
        int nb3=intent.getIntExtra(MainActivity.int3,0);
        int nb4=intent.getIntExtra(MainActivity.int4,0);
        int nb5=intent.getIntExtra(MainActivity.int5,0);
        int nb6=intent.getIntExtra(MainActivity.int6,0);
        int nb7=intent.getIntExtra(MainActivity.int7,0);
        int nb8=intent.getIntExtra(MainActivity.int8,0);
        int nb9=intent.getIntExtra(MainActivity.int9,0);
        int nb10=intent.getIntExtra(MainActivity.int10,0);

        TextView txt1= (TextView) findViewById(R.id.qt1);
        TextView txt2= (TextView) findViewById(R.id.qt2);
        TextView txt3= (TextView) findViewById(R.id.qt3);
        TextView txt4= (TextView) findViewById(R.id.qt4);
        TextView txt5= (TextView) findViewById(R.id.qt5);
        TextView txt6= (TextView) findViewById(R.id.qt6);
        TextView txt7= (TextView) findViewById(R.id.qt7);
        TextView txt8= (TextView) findViewById(R.id.qt8);
        TextView txt9= (TextView) findViewById(R.id.qt9);
        TextView txt10= (TextView) findViewById(R.id.qt10);
        TextView total= (TextView) findViewById(R.id.total);

        txt1.setText(""+nb1);
        txt2.setText(""+nb2);
        txt3.setText(""+nb3);
        txt4.setText(""+nb4);
        txt5.setText(""+nb5);
        txt6.setText(""+nb6);
        txt7.setText(""+nb7);
        txt8.setText(""+nb8);
        txt9.setText(""+nb9);
        txt10.setText(""+nb10);

        int f0=50;
        float f1 = Float.parseFloat("1.7");
        float f2 = Float.parseFloat("2.2");
        float f3 = Float.parseFloat("3.1");
        float f4 = Float.parseFloat("0.8");
        float f5 = Float.parseFloat("5.5");
        float f6 = Float.parseFloat("2.5");
        float f7 = Float.parseFloat("4.8");
        float f8 = Float.parseFloat("6.7");
        float f9 = Float.parseFloat("1.2");
        float tot=nb1*f0+nb2*f1+nb3*f2+nb4*f3+nb5*f4+nb6*f5+nb7*f6+nb8*f7+nb9*f8+nb10*f9;

        total.setText(""+tot);

        Button btn1=(Button) findViewById(R.id.payer);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPaiement();
            }
        });
    }

    public void openPaiement(){
        Intent intent=new Intent(this,Paiement.class);
        startActivity(intent);
    }
}