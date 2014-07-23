package com.example.bgreenes.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void calculate(View view) {
        EditText editTextTotal = (EditText) findViewById(R.id.total);
        double total_before_tip = Double.parseDouble(editTextTotal.getText().toString());
        EditText editTextTipPercent = (EditText) findViewById(R.id.tipPercent);
        double tip_percent = Double.parseDouble(editTextTipPercent.getText().toString());
        double tip = total_before_tip * (tip_percent / 100);
        double finalTotal = tip + total_before_tip;
        TextView total_after_tip_view = (TextView) findViewById(R.id.total_after_tip);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        total_after_tip_view.setText(formatter.format(finalTotal));
    }




}
