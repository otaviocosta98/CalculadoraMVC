package br.usjt.desenvmob.calculadoramvc.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import br.usjt.desenvmob.calculadoramvc.presenter.MainPresenter;
import br.usjt.deswebmob.calculadoramvc.R;

public class MainActivity extends Activity implements MainView {
    EditText valor1, valor2, operador, resultado;
    MainPresenter presenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = (EditText)findViewById(R.id.valor1);
        valor2 = (EditText)findViewById(R.id.valor2);
        operador = (EditText)findViewById(R.id.operador);
        resultado = (EditText)findViewById(R.id.resultado);
        presenter.onCreate();
    }

    public void calcular(View view){
        presenter.calculo();
    }

    public String getValor1(){
        return valor1.getText().toString();
    }

    public String getValor2(){
        return valor2.getText().toString();
    }

    public String getOperador(){
        return operador.getText().toString();
    }

    public void setResultado(String resultado) {
        this.resultado.setText(resultado);
    }
}
