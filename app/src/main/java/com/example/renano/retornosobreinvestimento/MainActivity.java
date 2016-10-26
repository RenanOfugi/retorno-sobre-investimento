package com.example.renano.retornosobreinvestimento;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ganho;
    EditText investimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void atualizaValoresROI(View view) {

        ganho = (EditText) findViewById(R.id.ganho);
        investimento = (EditText) findViewById(R.id.investimento);
        TextView msg = (TextView) findViewById(R.id.roi);

        if (naoVazio(ganho, investimento)) {

            float roi = gerenciaDados(ganho, investimento);
            assert msg != null;
            msg.setText(roi + " %");
        } else {
            msg.setText("0");
        }

    }

    private float gerenciaDados(EditText ganho, EditText investimento) {


        float ganhofloat, investimentofloat;

        ganhofloat = converterParaFloat(ganho);
        investimentofloat = converterParaFloat(investimento);

        CalculoROI calculoROI = new CalculoROI();

        float roi;
        roi = calculoROI.calculaROI(ganhofloat, investimentofloat);

        return roi;
    }

    private boolean naoVazio(EditText ganho, EditText investimento) {

        if (ganho.getText().toString().isEmpty() || investimento.getText().toString().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    private float converterParaFloat(EditText dado) {

        float dadofloat;
        String dadostring;

        dadostring = converterParaString(dado);
        dadofloat = Float.parseFloat(dadostring);

        return dadofloat;
    }

    private String converterParaString(EditText dado) {

        String dadoString;

        dadoString = dado.getText().toString();

        return dadoString;
    }
}
