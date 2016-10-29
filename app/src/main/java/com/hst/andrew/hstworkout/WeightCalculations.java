package com.hst.andrew.hstworkout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WeightCalculations extends AppCompatActivity {
    EditText
            ex1_1,ex2_1,ex3_1,ex4_1,ex5_1,ex6_1,ex7_1,ex8_1,ex9_1,
            ex1_2,ex2_2,ex3_2,ex4_2,ex5_2,ex6_2,ex7_2,ex8_2,ex9_2,
            ex331,ex2_3,ex3_3,ex4_3,ex5_3,ex6_3,ex7_3,ex8_3,ex9_3, decrement;


    TextView  ex1,ex2,ex3,ex4,ex5,ex6,ex7,ex8,ex9;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_calculations);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        b = (Button) findViewById(R.id.btnNext);
        //Setting up textviews
        ex1  = (TextView) findViewById(R.id.txtex1);
        ex2 = (TextView) findViewById(R.id.txtex2);
        ex3 = (TextView) findViewById(R.id.txtex3);
        ex4 = (TextView) findViewById(R.id.txtex4);
        ex5 = (TextView) findViewById(R.id.txtex5);
        ex6 = (TextView) findViewById(R.id.txtex6);
        ex7 = (TextView) findViewById(R.id.txtex7);
        ex8 = (TextView) findViewById(R.id.txtex8);
        ex9 = (TextView) findViewById(R.id.txtex9);

        //Setting up EditTexts
        ex1_1 = (EditText) findViewById(R.id.ex1_1);
        ex2_1 = (EditText) findViewById(R.id.ex2_1);
        ex3_1 = (EditText) findViewById(R.id.ex3_1);
        ex4_1 = (EditText) findViewById(R.id.ex4_1);
        ex5_1 = (EditText) findViewById(R.id.ex5_1);
        ex6_1 = (EditText) findViewById(R.id.ex6_1);
        ex7_1 = (EditText) findViewById(R.id.ex7_1);
        ex8_1 = (EditText) findViewById(R.id.ex8_1);
        ex9_1 = (EditText) findViewById(R.id.ex9_1);
        ex1_2 = (EditText) findViewById(R.id.ex1_2);
        ex2_2 = (EditText) findViewById(R.id.ex2_2);
        ex3_2 = (EditText) findViewById(R.id.ex3_2);
        ex4_2 = (EditText) findViewById(R.id.ex4_2);
        ex5_2 = (EditText) findViewById(R.id.ex5_2);
        ex6_2 = (EditText) findViewById(R.id.ex6_2);
        ex7_2 = (EditText) findViewById(R.id.ex7_2);
        ex8_2 = (EditText) findViewById(R.id.ex8_2);
        ex9_2 = (EditText) findViewById(R.id.ex9_2);
        ex331 = (EditText) findViewById(R.id.ex1_3);
        ex2_3 = (EditText) findViewById(R.id.ex2_3);
        ex3_3 = (EditText) findViewById(R.id.ex3_3);
        ex4_3 = (EditText) findViewById(R.id.ex4_3);
        ex5_3 = (EditText) findViewById(R.id.ex5_3);
        ex6_3 = (EditText) findViewById(R.id.ex6_3);
        ex7_3 = (EditText) findViewById(R.id.ex7_3);
        ex8_3 = (EditText) findViewById(R.id.ex8_3);
        ex9_3 = (EditText) findViewById(R.id.ex9_3);
        decrement = (EditText) findViewById(R.id.decrementval);


    }

    public int[] values(int x){
        int[] val = new int[x];
        val[0] = Integer.parseInt(ex1_1.getText().toString());
        val[1] = Integer.parseInt(ex1_2.getText().toString());
        val[2] = Integer.parseInt(ex331.getText().toString());
        val[3] = Integer.parseInt(ex2_1.getText().toString());
        val[4] = Integer.parseInt(ex2_2.getText().toString());
        val[5] = Integer.parseInt(ex2_3.getText().toString());
        val[6] = Integer.parseInt(ex3_1.getText().toString());
        val[7] = Integer.parseInt(ex3_2.getText().toString());
        val[8] = Integer.parseInt(ex3_3.getText().toString());
        val[9] = Integer.parseInt(ex4_1.getText().toString());
        val[10] = Integer.parseInt(ex4_2.getText().toString());
        val[11] = Integer.parseInt(ex4_3.getText().toString());
        val[12] = Integer.parseInt(ex5_1.getText().toString());
        val[13] = Integer.parseInt(ex5_2.getText().toString());
        val[14] = Integer.parseInt(ex5_3.getText().toString());
        val[15] = Integer.parseInt(ex6_1.getText().toString());
        val[16] = Integer.parseInt(ex6_2.getText().toString());
        val[17] = Integer.parseInt(ex6_3.getText().toString());
        val[18] = Integer.parseInt(ex7_1.getText().toString());
        val[19] = Integer.parseInt(ex7_2.getText().toString());
        val[20] = Integer.parseInt(ex7_3.getText().toString());
        val[21] = Integer.parseInt(ex8_1.getText().toString());
        val[22] = Integer.parseInt(ex8_2.getText().toString());
        val[23] = Integer.parseInt(ex8_3.getText().toString());
        val[24] = Integer.parseInt(ex9_1.getText().toString());
        val[25] = Integer.parseInt(ex9_2.getText().toString());
        val[26] = Integer.parseInt(ex9_3.getText().toString());
        val[27] = Integer.parseInt(decrement.getText().toString());


        return val;
    }
}
