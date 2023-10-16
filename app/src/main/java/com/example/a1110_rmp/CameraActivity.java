package com.example.a1110_rmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class CameraActivity extends AppCompatActivity {
    private Button btnCamera;
    private ImageView imgPhoto;
    private final int REQUEST_CAMERA_IMAGE=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        btnCamera= (Button) findViewById(R.id.btnCamera);
        imgPhoto=(ImageView) findViewById(R.id.imgPhoto);

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent,REQUEST_CAMERA_IMAGE);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==REQUEST_CAMERA_IMAGE){
            Bitmap imageBitmap=(Bitmap) data.getExtras().get("data");
            imgPhoto.setImageBitmap(imageBitmap);
        }
    }

}