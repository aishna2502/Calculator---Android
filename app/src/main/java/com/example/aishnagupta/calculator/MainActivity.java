package com.example.aishnagupta.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   EditText disp;
   Button one, two, three, four, five, six, seven, eight, nine, zero, add, mul, sub, div, clr, equal, point;
//   String optr;
   float op1, op2;
   boolean opnAdd, opnSub, opnMul, opnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        disp = (EditText) findViewById(R.id.editText);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        clr = (Button) findViewById(R.id.clr);
        equal = (Button) findViewById(R.id.equal);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        point = (Button) findViewById(R.id.point);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"6");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"0");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(disp == null){
                    disp.setText("");
                }
                else{
                    op1 = Float.parseFloat(disp.getText()+"");
                    opnAdd = true;
                    disp.setText(null);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(disp == null){
                    disp.setText("");
                }
                else{
                    op1 = Float.parseFloat(disp.getText()+"");
                    opnSub = true;
                    disp.setText(null);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(disp == null){
                    disp.setText("");
                }
                else{
                    op1 = Float.parseFloat(disp.getText()+"");
                    opnMul = true;
                    disp.setText(null);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(disp == null){
                    disp.setText("");
                }
                else{
                    op1 = Float.parseFloat(disp.getText()+"");
                    opnDiv = true;
                    disp.setText(null);
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText(disp.getText()+"9");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op2 = Float.parseFloat(disp.getText()+"");

                if(opnAdd){
                    disp.setText(op1 + op2 + "");
                    opnAdd = false;
                }

                if(opnSub){
                    disp.setText(op1 - op2 + "");
                    opnSub = false;
                }

                if(opnMul){
                    disp.setText(op1 * op2 + "");
                    opnMul = false;
                }

                if(opnDiv){
                    disp.setText(op1 / op2 + "");
                    opnDiv = false;
                }

            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp.setText("");
            }
        });

    }
}
