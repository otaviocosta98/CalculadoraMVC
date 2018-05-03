package br.usjt.desenvmob.calculadoramvc.presenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.usjt.desenvmob.calculadoramvc.view.MainView;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by arqdsis on 03/05/2018.
 */

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    private MainPresenter presenter;

    @Mock
    private MainView view;

    @Before
    public void setUp(){
        presenter = new MainPresenter(view);
        presenter.onCreate();
    }

    @Test
    public void testCalculo(){
        when(view.getValor1()).thenReturn("1");
        when(view.getValor2()).thenReturn("2");
        when(view.getOperador()).thenReturn("+");
        presenter.calculo();
        assertEquals("3", presenter.getResultado());

        when(view.getValor1()).thenReturn("1");
        when(view.getValor2()).thenReturn("2");
        when(view.getOperador()).thenReturn("-");
        presenter.calculo();
        assertEquals("-1", presenter.getResultado());

        when(view.getValor1()).thenReturn("1");
        when(view.getValor2()).thenReturn("2");
        when(view.getOperador()).thenReturn("*");
        presenter.calculo();
        assertEquals("2", presenter.getResultado());

        when(view.getValor1()).thenReturn("1");
        when(view.getValor2()).thenReturn("2");
        when(view.getOperador()).thenReturn("/");
        presenter.calculo();
        assertEquals("0", presenter.getResultado());
    }
}
