package com.acrony.alertdialogjava;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder alertDialogBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button) findViewById(R.id.button);
         alertDialogBuilder=new AlertDialog.Builder(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               alertDialogBuilder.setMessage("Are You sure?");
               alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       Toast.makeText(getApplicationContext(),"I Clicked Yes",Toast.LENGTH_LONG).show();
                   }
               });

               alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       Toast.makeText(getApplicationContext(),"I Clicked NO",Toast.LENGTH_LONG).show();
                   }
               });

               AlertDialog alertDialog=alertDialogBuilder.create();
               alertDialog.show();
            }
        });
    }
}
