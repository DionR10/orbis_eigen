package com.example.testfile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Followers extends AppCompatActivity {

    public ImageButton backfollowersButton;

    public void FollowersProfile(){
        backfollowersButton = (ImageButton) findViewById(R.id.backfollowersButton);
        backfollowersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backfollowers= new Intent(Followers.this, Account.class);

                startActivity(backfollowers);
            }
        });


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_followers);
        FollowersProfile();
    }
}
