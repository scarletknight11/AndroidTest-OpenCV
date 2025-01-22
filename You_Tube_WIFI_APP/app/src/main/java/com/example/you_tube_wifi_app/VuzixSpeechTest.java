package com.example.you_tube_wifi_app;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.firestore.util.Listener;
import com.vuzix.hud.actionmenu.ActionMenuActivity;
import com.vuzix.sdk.speechrecognitionservice.VuzixSpeechClient;


public class VuzixSpeechTest extends ActionMenuActivity {
    VuzixSpeechClient speechClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }
    private void startSpeechRecognition() {
        Toast.makeText(this, "Speech recognition started!", Toast.LENGTH_SHORT).show();
    }

}