package com.example.alumno.segundaclase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Controller controller;
    Vista vista;
    Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model = new Model();
        controller = new Controller();
        controller.setModelo(model);
        vista = new Vista(this,controller);
        controller.setVista(vista);

        //de los imports lo q sea view y widget van en la clase vista
    }
}
