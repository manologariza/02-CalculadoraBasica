package com.example.manolo.a02_calculadorabasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);

    }

    public void sumar(View v){
        int operando1=Integer.parseInt(et1.getText().toString());
        int operando2=Integer.parseInt(et2.getText().toString());
        int suma=operando1+operando2;
        et3.setText(""+suma);
        //Otra forma:
        // et3.setText(String.valueOf(suma));
    }
}
