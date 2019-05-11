package com.example.bmiapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaration of components (editext & textview) and global variables (string and double)
    EditText edHeight,edWeight;
    String weight,height;
    Double val1, val2, BMI;
    TextView txtBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference the components to the layout file -->SET CONTENT VIEW
        edHeight = findViewById(R.id.edHeight);
        edWeight = findViewById(R.id.edWeight);
        txtBMI = findViewById(R.id.txtBMI);


    }

    public void calculateBMI(View view) {
        val1=Double.parseDouble(edHeight.getText().toString());
        val2=Double.parseDouble(edWeight.getText().toString());
        BMI = (val2/(val1 * val1));

        //start of loops

        if(BMI<15){
            Toast.makeText(getApplicationContext(),"Very Severely Underweight",Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            txtBMI.setText("Your BMI is " +finalResult+ " and your health is very severely underweight");

        }
        else if(BMI >= 15 && BMI <= 16){
            Toast.makeText(getApplicationContext(),"Severely Underweight",Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            txtBMI.setText("Your BMI is " +finalResult+ " and your health is severely underweight");
        }
        else if(BMI >= 16 && BMI <= 18.5){
            Toast.makeText(getApplicationContext(),"Underweight",Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            txtBMI.setText("Your BMI is " +finalResult+ " and your health is Underweight");
        }
        else if(BMI >= 18.5 && BMI <= 25){
            Toast.makeText(getApplicationContext()," Normal healthy weight",Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            txtBMI.setText("Your BMI is " +finalResult+ " and your health is normal Healthy Weight");
        }
        else if(BMI >= 25 && BMI <= 30){
            Toast.makeText(getApplicationContext(),"Overweight",Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            txtBMI.setText("Your BMI is" +finalResult+ " and your health is  Overweight");
        }
        else if(BMI >= 30 && BMI <= 35){
            Toast.makeText(getApplicationContext(),"Moderate Obese",Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            txtBMI.setText("Your BMI is " +finalResult+ " and your health is Moderate Obese");
        }
        else if(BMI >= 35 && BMI <= 40){
            Toast.makeText(getApplicationContext(),"Severely Obese",Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            txtBMI.setText("Your BMI is "  +finalResult+ " and your health is Severely Obese");
        }
        else if(BMI > 40){
            Toast.makeText(getApplicationContext(),"Very Severely Obese", Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            txtBMI.setText("Your BMI is " +finalResult+ " and your health is Very Severely Overweight");
        }

    }
}
