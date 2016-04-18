package com.unlimitedappworks.gatos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    Musica gato, leon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gato = new Musica(this, "gato.mp3");
        leon = new Musica(this, "leon.mp3");
    }

    public void click(View v) {
        if (v.getId() == R.id.btnGato) {
            gato.play();
        } else {
            leon.play();
        }
    }
}
