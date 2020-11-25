package com.example.mathcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numbersView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbersView = findViewById(R.id.CalcView);

    }


    public void Add(View view) {

        Button button_text = (Button) view;
        String add = button_text.getText().toString();

        numbersView.setText(numbersView.getText().toString()+add);

    }

    public void Calculate(View view) {

        String calculation = numbersView.getText().toString();

        int hasil = 0;

        if(calculation.contains("+")){
           String bil[] = calculation.split("\\+",2);
           int bil1 = Integer.parseInt(bil[0]) ;
           int bil2 = Integer.parseInt(bil[1]) ;
           hasil = bil1 + bil2;
        }
        else if(calculation.contains("-")){
            String bil[] = calculation.split("-",2);
            int bil1 = Integer.parseInt(bil[0]) ;
            int bil2 = Integer.parseInt(bil[1]) ;
            hasil = bil1 - bil2;
        }
        else if(calculation.contains("X")){
            String bil[] = calculation.split("X",2);
            int bil1 = Integer.parseInt(bil[0]) ;
            int bil2 = Integer.parseInt(bil[1]) ;
            hasil = bil1 * bil2;
        }
        else if(calculation.contains("/")){
            String bil[] = calculation.split("/",2);
            int bil1 = Integer.parseInt(bil[0]) ;
            int bil2 = Integer.parseInt(bil[1]) ;
            hasil = bil1 / bil2;
        }
        else{
            hasil = 0;
        }

        numbersView.setText(""+hasil);

    }

    public void Reset(View view) {
        numbersView.setText("");
    }
}