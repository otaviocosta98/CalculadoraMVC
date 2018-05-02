package br.usjt.desenvmob.calculadoramvc.model;

public class Calculadora {
    String valor1, valor2, operador, resultado;

    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void calculo(){
        int val1 = Integer.parseInt(valor1);
        int val2 = Integer.parseInt(valor2);

        switch (operador){
            case "+": resultado = (val1+val2)+""; break;
            case "-": resultado =  (val1-val2)+""; break;
            case "*": resultado =  (val1*val2)+""; break;
            case "/": resultado =  (val1/val2)+""; break;
            default:resultado =  "ERRO";

        }
    }
}
