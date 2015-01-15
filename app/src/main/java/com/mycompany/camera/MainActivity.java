package com.mycompany.camera;
import android.content.Intent;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.content.pm.PackageInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;


public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    static final int REQUEST_IMAGE_CAPTURE=1;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        imageView=(ImageView) findViewById(R.id.imageView);


    /*  RelativeLayout myView = (RelativeLayout) findViewById(R.id.trackerr);
        int toX = 50;
        int toY = 100;
        RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) myView.getLayoutParams();
        lp.leftMargin = toX;
        lp.topMargin = toY;
        myView.setLayoutParams(lp);
        myView.layout(toX, toY, 0, 0);*/
    }

public void launchCamera(View view)
    {
    Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
    }
public void onActivityResult(int requestCode,int resultCode,Intent data){
    if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK){
        Bundle extras =data.getExtras();
        Bitmap photo=(Bitmap) extras.get("data");
        imageView.setImageBitmap(photo);
        createImageFromBitmap(photo);

    }


}
   public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MainActivity2.class);
       /* EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);*/
        startActivity(intent);

    }
    public String createImageFromBitmap(Bitmap bitmap) {
        String fileName = "myImage";//no .png or .jpg needed
        try {
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
            FileOutputStream fo = openFileOutput(fileName, Context.MODE_PRIVATE);
            fo.write(bytes.toByteArray());
            // remember close file output
            fo.close();
        } catch (Exception e) {
            e.printStackTrace();
            fileName = null;
        }
        return fileName;
    }
}
