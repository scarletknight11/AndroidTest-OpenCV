package com.example.you_tube_wifi_app;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.vuzix.hud.actionmenu.ActionMenuActivity;

public class HelloWorld extends ActionMenuActivity {

    private MenuItem HelloMenuItem;
    private MenuItem VuzixMenuItem;
    private MenuItem Blade2MenuItem;
    private TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstances) {
        super.onCreate(savedInstances);
        setContentView(R.layout.hello_world_layout);
    }

    @Override protected boolean onCreateActionMenu(Menu menu) {
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
        return false;
    }

    private void updateMenuItems() {
        if (HelloMenuItem == null) {
            return;
        }
        VuzixMenuItem.setEnabled(false);
        Blade2MenuItem.setEnabled(false);
    }
    //Action Menu Click events
    //This events where register via the XML for the menu definitions
    public void showHello(MenuItem item) {
        showToast("Hello World!");
        mainText.setText("Hello World!");
        VuzixMenuItem.setEnabled(true);
        Blade2MenuItem.setEnabled(true);
    }

    private void showToast(String s) {
    }

}
