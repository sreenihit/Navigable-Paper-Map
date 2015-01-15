package com.mycompany.test1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class tracker extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_tracker);


        ImageView myView = (ImageView) findViewById(R.id.trackerr);
        int toX = 50;
        int toY = 100;
        //RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) myView.getLayoutParams();
       // lp.leftMargin = toX;
        //lp.topMargin = toY;
        //myView.setLayoutParams(lp);
        myView.layout(toX, toY, 10, 10);

        Intent intent = getIntent();

        Double no1 = intent.getDoubleExtra(coordinates.EXTRA_MESSAGE1,0.0);
        Double no12 = intent.getDoubleExtra(coordinates.EXTRA_MESSAGE12,0.0);

        Double no2 = intent.getDoubleExtra(coordinates.EXTRA_MESSAGE2,0.0);
        Double no22 = intent.getDoubleExtra(coordinates.EXTRA_MESSAGE22,0.0);

        Double no3 = intent.getDoubleExtra(coordinates.EXTRA_MESSAGE3,0.0);
        Double no32 = intent.getDoubleExtra(coordinates.EXTRA_MESSAGE32,0.0);

        Double no4 = intent.getDoubleExtra(coordinates.EXTRA_MESSAGE4,0.0);
        Double no42 = intent.getDoubleExtra(coordinates.EXTRA_MESSAGE42,0.0);


        TextView textView1 = new TextView(this);
        textView1.setTextSize(40);

        String sno1 = Double.toString(no1);

        textView1.setText(sno1);textView1.setTextSize(40);
        textView1.setText(sno1);
        setContentView(textView1);




    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tracking, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
