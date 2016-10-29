package com.hst.andrew.hstworkout;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class WorkoutCreation extends AppCompatActivity {
    private EditText workoutname, ex1,ex2,ex3,ex4,ex5,ex6,ex7,ex8,ex9;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_creation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        workoutname = (EditText) findViewById(R.id.txtWorkoutName);
        ex1 = (EditText) findViewById(R.id.txtex1);
        ex2 = (EditText) findViewById(R.id.txtex2);
        ex3 = (EditText) findViewById(R.id.txtex3);
        ex4 = (EditText) findViewById(R.id.txtex4);
        ex5 = (EditText) findViewById(R.id.txtex5);
        ex6 = (EditText) findViewById(R.id.txtex6);
        ex7 = (EditText) findViewById(R.id.txtex7);
        ex8 = (EditText) findViewById(R.id.txtex8);
        ex9 = (EditText) findViewById(R.id.txtex9);
        next = (Button) findViewById(R.id.btnNext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  ArrayList<Excercise> excercises = new ArrayList<Excercise>();

                    Excercise ex = new Excercise(ex1.toString());
                excercises.add(ex);
                ex.setName(ex2.toString());
                excercises.add(ex);
                ex.setName(ex3.toString());
                excercises.add(ex);
                ex.setName(ex4.toString());
                excercises.add(ex);
                ex.setName(ex5.toString());
                excercises.add(ex);
                ex.setName(ex6.toString());
                excercises.add(ex);
                ex.setName(ex7.toString());
                excercises.add(ex);
                ex.setName(ex8.toString());
                excercises.add(ex);
                ex.setName(ex9.toString());
                excercises.add(ex);
                */

                Intent intent = new Intent();
                Bundle b = new Bundle();

                b.putStringArray("names", new String[]{workoutname.toString(), ex1.toString(), ex2.toString(), ex3.toString(),ex4.toString(), ex5.toString(),ex6.toString(),ex7.toString(),ex8.toString(),ex9.toString()});
                intent.putExtras(b);
                intent.setClass(WorkoutCreation.this, WeightCalculations.class);
                startActivity(intent);



            }
        });
    }

}
