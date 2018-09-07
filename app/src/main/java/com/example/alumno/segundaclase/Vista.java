package com.example.alumno.segundaclase;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by alumno on 06/09/2018.
 */

public class Vista {

    Activity act;
    EditText edtn1;
    EditText edtn2;
    TextView resultado;
    Button suma;
    Button resta;
    Button division;
    Button multiplicacion;
    Button igual;

    public Vista(Activity act, Controller ctrl)
    {
        this.act = act;
        suma = (Button) act.findViewById(R.id.suma);
        resta = (Button) act.findViewById(R.id.resta);
        division = (Button) act.findViewById(R.id.division);
        multiplicacion = (Button) act.findViewById(R.id.multiplicacion);
        igual = (Button) act.findViewById(R.id.igual);
        resultado = (TextView) act.findViewById(R.id.res);
        edtn1 = (EditText) act.findViewById(R.id.edtn1);
        edtn2 = (EditText) act.findViewById(R.id.edtn2);
        this.suma.setOnClickListener(ctrl);
        this.resta.setOnClickListener(ctrl);
        this.igual.setOnClickListener(ctrl);
        this.division.setOnClickListener(ctrl);
        this.multiplicacion.setOnClickListener(ctrl);

    }


}
