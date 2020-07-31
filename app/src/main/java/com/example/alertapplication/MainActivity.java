package com.example.alertapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click = findViewById(R.id.button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this, R.style.dialog);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"You clicked Yes",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"You Clicked on No",Toast.LENGTH_SHORT).show();
            }
        });
//builder.setTitle("Exit");


        Context context = builder.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.simple,null);
        TextView textView = (TextView) view.findViewById(R.id.title_text);
        textView.setText("Are You Sure ?");
        builder.setCustomTitle(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        Button button = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);

        button.setPadding(45, 2, 45, 2);
        button.setTextColor(Color.WHITE);
        button.setElevation(6.0f);
        button.setBackgroundColor(Color.BLUE);

        Button button1 = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE);

        button1.setPadding(45, 2, 45, 2);
        button1.setTextColor(Color.WHITE);
        button1.setElevation(6.0f);
        button1.setBackgroundColor(Color.BLUE);
            }
        });

    }
}