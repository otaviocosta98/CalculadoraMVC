package br.usjt.desenvmob.calculadoramvc.model;

import org.junit.Test;

import br.usjt.desenvmob.calculadoramvc.model.Calculadora;

import static junit.framework.Assert.assertEquals;

public class CalculadoraTest {
    @Test
    public void testaCalculadora(){
        Calculadora model = new Calculadora();
        model.setValor1("2");
        model.setValor2("2");
        model.setOperador("+");
        model.calculo();
        assertEquals("4", model.getResultado());
        model.setOperador("-");
        model.calculo();
        assertEquals("0", model.getResultado());
        model.setOperador("*");
        model.calculo();
        assertEquals("4", model.getResultado());
        model.setOperador("/");
        model.calculo();
        assertEquals("1", model.getResultado());

        model.setValor1("3");
        model.setValor2("2");
        model.setOperador("+");
        model.calculo();
        assertEquals("5", model.getResultado());
        model.setOperador("-");
        model.calculo();
        assertEquals("1", model.getResultado());
        model.setOperador("*");
        model.calculo();
        assertEquals("6", model.getResultado());
        model.setOperador("/");
        model.calculo();
        assertEquals("1", model.getResultado());
        model.setValor1("2");
        model.setValor2("3");
        model.setOperador("/");
        model.calculo();
        assertEquals("0", model.getResultado());

    }
}
