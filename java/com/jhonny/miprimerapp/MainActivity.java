package com.jhonny.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox check1, check2 , check3, check4;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_valor1);
        et2 = (EditText)findViewById(R.id.txt_valor2);

        check1 = (CheckBox)findViewById(R.id.check_suma);
        check2 = (CheckBox)findViewById(R.id.check_resta);
        check3 = (CheckBox)findViewById(R.id.check_multiplicacion);
        check4 = (CheckBox)findViewById(R.id.check_division);
        tv1 = (TextView)findViewById(R.id.tv_resultado);
    }

    //este metodo es para la funcion del button
    public void Calcular(View view) {
        String valor1_string = et1.getText().toString();
        String valor2_string = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        String resultado = "";
        if (check1.isChecked() == true) {
            int suma = valor1_int + valor2_int;
            resultado = "La suma es: " + suma + "/";
        }
        if (check2.isChecked() == true) {
            if (valor1_int >= valor2_int) {
                int resta = valor1_int - valor2_int;
                resultado = resultado + "/La resta es: " + resta+ "/";
            }else if (valor1_int < valor2_int){
                resultado = resultado+"la resta no es posible";
            }
        }
        if (check3.isChecked() == true) {
            int multiplicacion = valor1_int * valor2_int;
            resultado = resultado + "/La multiplicacion es: " + multiplicacion+ "/";
        }
        if (check4.isChecked() == true) {
            if (valor1_int >= valor2_int) {
                int division = valor1_int / valor2_int;
                resultado = resultado + "La division es: " + division+ "/";
            }else if (valor1_int < valor2_int){
                resultado = resultado+"/la division no es posible";
            }
        }
        tv1.setText(resultado);
    }
}