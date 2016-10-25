package com.example.renano.retornosobreinvestimento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ganho;
    EditText investimento;
    EditText juros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void recebeValoresROI(View view){

        ganho = (EditText) findViewById(R.id.ganho);
        investimento = (EditText) findViewById(R.id.investimento);
        juros = (EditText) findViewById(R.id.juros);
    }
}
