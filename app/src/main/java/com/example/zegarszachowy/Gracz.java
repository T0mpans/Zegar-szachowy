package com.example.zegarszachowy;

import android.os.CountDownTimer;
import android.widget.Button;

public class Gracz {
    private int ileSekund = 180;
    private boolean czyAktywny;
    private CountDownTimer countDownTimer;
    private Button button; //nie powinno się tak robić

    public Gracz(boolean czyAktywny, Button button) {
        this.czyAktywny = czyAktywny;
        this.button = button;
        countDownTimer = new CountDownTimer(ileSekund*1000, 1000) {
            @Override
            public void onTick(long l) {
                ileSekund = (int)l/1000;
                button.setText(""+ileSekund);
            }
            @Override
            public void onFinish() {

            }
        };
        countDownTimer.start();
    }


}
