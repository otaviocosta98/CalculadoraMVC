package br.usjt.desenvmob.calculadoramvc.presenter;

/**
 * Created by arqdsis on 02/05/2018.
 */

public interface Presenter {
    void onCreate();
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onRestart();
    void onDestroy();
}
