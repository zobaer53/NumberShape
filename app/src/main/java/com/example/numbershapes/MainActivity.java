package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    class Pattern {

        Scanner sc = new Scanner(System.in);
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        double n = Double.parseDouble(editText.getText().toString());

        public boolean answer() {
            double sum = 0;
            System.out.println("n="+n);
            int a=1;
            for (int i = 1; i <= n; i++) {
                sum += i;
                System.out.println("sum="+sum);
                if (sum == n) {
                    a=1;
                    System.out.println("if sum="+sum);
                    break;
                }
                else {
                    a=0;
                }


            }
            System.out.println("A="+a);
            if(a==1){
                return true;
            }
            else {
                return false;
            }
        }

        public boolean answer2() {
            double m = Math.sqrt(n);

            if (m - Math.floor(m) == 0) {
               return  true;

            } else {
               return false;
            }
        }
    }
    public void shape(View view) {
        Pattern p = new Pattern();
        if(p.n==1){

            Toast.makeText(this,"Triangle ",Toast.LENGTH_LONG).show();
        }
        else if (p.answer() && p.answer2()) {
            Toast.makeText(this,"Triangle & square ",Toast.LENGTH_LONG).show();
        } else if (p.answer()) {
            Toast.makeText(this,"Triangle ",Toast.LENGTH_LONG).show();
        }
          else if(p.answer2()){
            Toast.makeText(this,"square ",Toast.LENGTH_LONG).show();
        }
          else
        {
            Toast.makeText(this,"Not Triangle & square ",Toast.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}


