package com.example.testfile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Following extends AppCompatActivity {

    public ImageButton backfollowers;



    public void FollowingProfile(){
        backfollowers = (ImageButton) findViewById(R.id.backfollowingButton);
        backfollowers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent testnew = new Intent(Following.this, Account.class);
                startActivity(testnew);

            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_following);
        FollowingProfile();

    }
}
