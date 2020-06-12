package com.example.chatbook;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {

    final int myPicResultCode = 1;
    ImageView ivProfilePic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivProfilePic = findViewById(R.id.IvSignInprofileImage);
    }

    public void getProfileFromGallery(View view) {

        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent,myPicResultCode);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == myPicResultCode)
        {
            try {
                ivProfilePic.setImageURI(data.getData());
            }
            catch (Exception e)
            {
                Toast.makeText(this, "Error! try again", Toast.LENGTH_SHORT).show();
            }

        }

    }
}
