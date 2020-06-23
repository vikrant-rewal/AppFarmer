package com.example.profilepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
    }
    public void openUpload(View view){
        Intent i= new Intent(this,NumbersActivity.class);
        startActivity(i);
    }
    public void Uploadcrops(View view){
        Intent i= new Intent(this,Uploadcrops.class);
        startActivity(i);
    }
    public void Mycrops(View view){
        Intent i= new Intent(this,PhrasesActivity.class);
        startActivity(i);
    }
}
