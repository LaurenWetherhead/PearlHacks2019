package edu.gatech.juniordesign.pearlhacks2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {



    public void goToScanner(View view) {
        Intent intent = new Intent (this, BarcodeScannerActivity.class);
        startActivity(intent);
    }
}
