package com.example.alumno.segundaclase;

import android.view.View;

/**
 * Created by alumno on 06/09/2018.
 */

public class Controller implements View.OnClickListener {
    private Vista vista;
    private Model modelo;

    public Controller() {

    }

    public void setVista(Vista vista)
    {
        this.vista = vista;
    }
    public void setModelo(Model modelo)
    {
        this.modelo = modelo;
    }

    public double Operacion(String accion, Model modelo)
    {
        switch (accion)
        {
            case "suma":
                return modelo.getN1() + modelo.getN2();
            case "resta":
                return modelo.getN1() - modelo.getN2();
            case "division":
                if(modelo.getN2() != 0)
                {
                    return modelo.getN1() / modelo.getN2();
                }
                return 0;
            case "multiplicacion":
                return modelo.getN1() * modelo.getN2();
        }
        return 0;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.suma:
                vista.resultado.setText(String.valueOf(this.Operacion("Sumar",this.modelo)));
                break;
            case R.id.resta:
                vista.resultado.setText(String.valueOf(this.Operacion("Resta",this.modelo)));
                break;
            case R.id.multiplicacion:
                vista.resultado.setText(String.valueOf(this.Operacion("Multiplicacion",this.modelo)));
                break;
            case R.id.division:
                vista.resultado.setText(String.valueOf(this.Operacion("division",this.modelo)));
                break;
        }

    }
}
