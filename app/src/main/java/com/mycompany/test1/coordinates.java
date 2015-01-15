package com.mycompany.test1;


        import android.content.Intent;
        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.EditText;


public class coordinates extends ActionBarActivity {


    public final static String EXTRA_MESSAGE1 = "com.mycompany.myfirstapp.MESSAGE1";
    public final static String EXTRA_MESSAGE12 = "com.mycompany.myfirstapp.MESSAGE12";
    public final static String EXTRA_MESSAGE2 = "com.mycompany.myfirstapp.MESSAGE2";
    public final static String EXTRA_MESSAGE22 = "com.mycompany.myfirstapp.MESSAGE22";
    public final static String EXTRA_MESSAGE3 = "com.mycompany.myfirstapp.MESSAGE3";
    public final static String EXTRA_MESSAGE32 = "com.mycompany.myfirstapp.MESSAGE32";
    public final static String EXTRA_MESSAGE4 = "com.mycompany.myfirstapp.MESSAGE4";
    public final static String EXTRA_MESSAGE42 = "com.mycompany.myfirstapp.MESSAGE42";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    public void mapTrack(View view)
    {
        Intent intent = new Intent(this, tracker.class);

        EditText cord1 = (EditText) findViewById(R.id.editText1);
        Double no1 = Double.parseDouble(cord1.getText().toString());
        EditText cord12 = (EditText) findViewById(R.id.editText12);
        Double no12 = Double.parseDouble(cord12.getText().toString());

        EditText cord2 = (EditText) findViewById(R.id.editText2);
        Double no2 = Double.parseDouble(cord2.getText().toString());
        EditText cord22 = (EditText) findViewById(R.id.editText22);
        Double no22 = Double.parseDouble(cord22.getText().toString());

        EditText cord3 = (EditText) findViewById(R.id.editText3);
        Double no3 = Double.parseDouble(cord3.getText().toString());
        EditText cord32 = (EditText) findViewById(R.id.editText32);
        Double no32 = Double.parseDouble(cord32.getText().toString());

        EditText cord4 = (EditText) findViewById(R.id.editText4);
        Double no4 = Double.parseDouble(cord4.getText().toString());
        EditText cord42 = (EditText) findViewById(R.id.editText42);
        Double no42 = Double.parseDouble(cord42.getText().toString());

        intent.putExtra(EXTRA_MESSAGE1, no1);
        intent.putExtra(EXTRA_MESSAGE12, no12);

        intent.putExtra(EXTRA_MESSAGE2, no2);
        intent.putExtra(EXTRA_MESSAGE22, no22);

        intent.putExtra(EXTRA_MESSAGE3, no3);
        intent.putExtra(EXTRA_MESSAGE32, no32);

        intent.putExtra(EXTRA_MESSAGE4, no4);
        intent.putExtra(EXTRA_MESSAGE42, no42);

        startActivity(intent);


    }


}
