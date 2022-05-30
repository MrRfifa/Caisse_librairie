package com.android.caisse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Paiement extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText text1;//=(EditText) findViewById(R.id.montant);
    EditText text2;//=(EditText) findViewById(R.id.num_carte);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paiement);


        Button btn=(Button) findViewById(R.id.retour);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAccueil();
            }
        });

        radioGroup=findViewById(R.id.radioGroup);
        text1= findViewById(R.id.montant);
        text2= findViewById(R.id.num_carte);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        int radioId=radioGroup.getCheckedRadioButtonId();

        radioButton=findViewById(radioId);

        // Check which radio button was clicked
        switch(radioId) {
            case R.id.radioButton_esp:
                    text1.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.INVISIBLE);
                    break;
            case R.id.radioButton_carte:
                    text2.setVisibility(View.VISIBLE);
                    text1.setVisibility(View.INVISIBLE);
                    break;
        }
    }

    public void openAccueil(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}