package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button add,sub,multi,div,clear;
    EditText first;
    EditText sec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=findViewById(R.id.button2);
        sub=findViewById(R.id.button4);
        multi=findViewById(R.id.button5);
        div=findViewById(R.id.button6);
        clear=findViewById(R.id.button7);

        first= findViewById(R.id.editTextTextPersonName3);
        sec= findViewById(R.id.editTextTextPersonName4);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=first.getText().toString();
                String num2=sec.getText().toString();

                int sum=Integer.parseInt(num1)+Integer.parseInt(num2);
                Toast.makeText(MainActivity.this, "sum is:"+(sum), Toast.LENGTH_SHORT).show();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=first.getText().toString();
                String num2=sec.getText().toString();

                int sub=Integer.parseInt(num1)-Integer.parseInt(num2);
                Toast.makeText(MainActivity.this, "sub is:"+(sub), Toast.LENGTH_SHORT).show();
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=first.getText().toString();
                String num2=sec.getText().toString();

                int multi=Integer.parseInt(num1)*Integer.parseInt(num2);
                Toast.makeText(MainActivity.this, "multi is:"+(multi), Toast.LENGTH_SHORT).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1=first.getText().toString();
                String num2=sec.getText().toString();

                int div=Integer.parseInt(num1)/Integer.parseInt(num2);
                Toast.makeText(MainActivity.this, "div is:"+(div), Toast.LENGTH_SHORT).show();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setText("");
                sec.setText("");

                Toast.makeText(MainActivity.this, "reset successful ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}