package com.example.testfile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OtherAccount extends AppCompatActivity {

    public ImageButton backsearchBtn;
    public Button followersButton_other;
    public Button followingButton_other;

    public void BackSearch(){
        backsearchBtn = (ImageButton) findViewById(R.id.backsearchButton);
        backsearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtosearch = new Intent(OtherAccount.this,Search.class);
                startActivity(backtosearch);
            }
        });
    }

    public void ToFollowersOther(){
        followersButton_other = (Button) findViewById(R.id.followersButton_other);
        followersButton_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tofollowersother = new Intent(OtherAccount.this, FollowersOther.class);
                startActivity(tofollowersother);
            }
        });

    }

    public void ToFollowingOther(){
        followingButton_other = (Button) findViewById(R.id.followingButton_other);
        followingButton_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tofollowingother = new Intent(OtherAccount.this,FollowingOther.class);
                startActivity(tofollowingother);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_account);
        BackSearch();
        ToFollowersOther();
        ToFollowingOther();
    }
}
