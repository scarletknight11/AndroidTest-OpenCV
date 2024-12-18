package com.example.you_tube_wifi_app;


import android.bluetooth.BluetoothSocket;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//Class that given an open BT Socket will
//Open, manage and close the data stream from Arduino BT device
public class ConnectedThread extends Thread {

    private static final String TAG = "FrugalLogs";
    private final BluetoothSocket mmSocket;
    private final InputStream mmInStream;
    private final OutputStream mmOutStream;
    private String valueRead;


    public ConnectedThread(BluetoothSocket socket) {
        this.mmSocket = socket;
        InputStream tmpIn = null;
        OutputStream tmpOut = null;

        // Get the input & output stream; using temp objects because
        // member streams are final
        try {
            tmpIn = socket.getInputStream();
        } catch (IOException e) {
            Log.e(TAG, "Error occured when creating input stream", e);
        }
        //Input and Output streams members of the class
        //We wont use the Output stream of this project
        mmInStream = tmpIn;
        mmOutStream = tmpOut;
    }

    public String getValueRead() {
        return valueRead;
    }

    public void run() {

        byte[] buffer = new byte[1024];
        int bytes = 0; // bytes returned from read()
        int numberOfReadings = 0;

        // Keep listening to the InputStream until an exception occurs
        // We just want to get 1 readings


    }

}
