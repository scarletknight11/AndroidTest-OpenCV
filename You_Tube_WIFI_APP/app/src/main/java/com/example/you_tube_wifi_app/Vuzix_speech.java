package com.example.you_tube_wifi_app;

import android.app.Activity;
import android.os.RemoteException;

import com.vuzix.hud.actionmenu.ActionMenuActivity;
import com.vuzix.sdk.speechrecognitionservice.VuzixSpeechClient;

import java.util.List;

public class Vuzix_speech extends ActionMenuActivity {
    Activity myActivity = this;
    VuzixSpeechClient sc;

    public Vuzix_speech() {
        try {
            sc = new VuzixSpeechClient(myActivity);
        } catch (RuntimeException | RemoteException e) {
            if (e.getMessage().equals("Stub!")) {
                // This is not being run on Vuzix hardware (or the Proguard rules are incorrect)
                // Alert the user, or insert recovery here.
            } else {
                // Other RuntimeException to be handled
            }
        }
        // Surround all speech client commands with a try/catch for unsupported interfaces
        try {
            List<String> phrases = sc.getPhrases();
        }
        catch(NoClassDefFoundError e) {
            // The hardware does not support the specific command expected by the Vuzix Speech SDK.
            // Alert the user, or insert recovery here.
        }
    }
}
