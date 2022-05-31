package com.android.caisse;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
    EditText text1;
    EditText text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paiement);
        radioGroup=findViewById(R.id.radioGroup);
        text1= findViewById(R.id.montant);
        text2= findViewById(R.id.num_carte);


        Button btn=(Button) findViewById(R.id.retour);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(Paiement.this);
                if (text1.getVisibility()==View.INVISIBLE && text2.getVisibility()==View.INVISIBLE ) {
                    builder.setCancelable(false);
                    builder.setTitle("Erreur de paiement");
                    builder.setMessage("Il faut choisir une méthode de paiement");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    builder.show();
                }

                else if ( text2.getText().toString().trim().length()==0 && text1.getVisibility()==View.INVISIBLE ) {
                    builder.setCancelable(false);
                    builder.setTitle("Champ vide");
                    builder.setMessage("Numéro de la carte est vide");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.show();
                }
                else if ( text1.getText().toString().trim().length()==0 && text2.getVisibility()==View.INVISIBLE )
                {
                    builder.setCancelable(false);
                    builder.setTitle("Champ vide");
                    builder.setMessage("Montant à payer est vide");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.show();
                }
                else if ( text2.getText().toString().length()<12 )
                {
                    builder.setCancelable(false);
                    builder.setTitle("Carte invalide");
                    builder.setMessage("La taille d'un numéro de carte est 12");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.show();
                }
                else {
                    builder.setCancelable(false);
                    builder.setTitle("Paiement");
                    builder.setMessage("Paiement effectué avec succées");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            openAccueil();
                        }
                    });
                    builder.show();
                }



            }
        });


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