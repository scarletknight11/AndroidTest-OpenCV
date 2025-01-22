package com.example.you_tube_wifi_app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.vuzix.hud.actionmenu.ActionMenuActivity;

public class VuzixTest extends ActionMenuActivity {

    private MenuItem HelloMenuItem;
    private MenuItem VuzixMenuItem;
    private MenuItem Blade2MenuItem;
    private TextView mainText;

    @Override
    protected boolean onCreateActionMenu(Menu menu) {
        super.onCreateActionMenu(menu);
        getMenuInflater().inflate(R.menu.vuzix_test_main, menu);
        HelloMenuItem = menu.findItem(R.id.item1);
        VuzixMenuItem = menu.findItem(R.id.item2);
        Blade2MenuItem = menu.findItem(R.id.item3);
        mainText = findViewById(R.id.mainTextView);
        updateMenuItems();
        return true;
    }

    @Override protected boolean alwaysShowActionMenu() {
        return true;
    }

    private void updateMenuItems() {
        if (HelloMenuItem == null) {
            return;
        }
        VuzixMenuItem.setEnabled(false);
        Blade2MenuItem.setEnabled(false);
    }

    //Action Menu Click events
    //This events where register via the XML for the menu definitions.
    public void showHello(MenuItem item) {
        showToast("Hello World!");
        mainText.setText("Hello World!");
        VuzixMenuItem.setEnabled(true);
        Blade2MenuItem.setEnabled(true);
    }

    public void showVuzix(MenuItem item){
        showToast("Vuzix!");
        mainText.setText("Vuzix!");
    }
    public void showBlade2(MenuItem item){
        showToast("Blade2");
        mainText.setText("Blade2");
    }

    private void showToast(final String text) {
        final Activity activity = this;
        activity.runOnUiThread(new Runnable() {
            @Override public void run() {
                Toast.makeText(activity, text, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
