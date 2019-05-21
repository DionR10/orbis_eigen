package com.example.testfile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FollowersOther extends AppCompatActivity {

    public ImageButton backfollowersotherBtn;

    public void BackToOther1(){
        backfollowersotherBtn = (ImageButton) findViewById(R.id.backfollowersButtonOther);
        backfollowersotherBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtoother1 = new Intent(FollowersOther.this, OtherAccount.class);
                startActivity(backtoother1);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_followers_other);
        BackToOther1();

    }
}
