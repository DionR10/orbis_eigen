package com.example.testfile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Account extends AppCompatActivity {

    public Button followersButton;
    public Button followingButton;
    public Button allmemButton;


    public void ToFollowers(){
        followersButton = (Button)findViewById(R.id.followersButton);
        followersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent followers = new Intent(Account.this,Followers.class);
                startActivity(followers);
            }
        });
    }

    public void ToFollowing(){
        followingButton = (Button)findViewById(R.id.followingButton);
        followingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent following = new Intent(Account.this,Following.class);
                startActivity(following);
            }
        });

    }

    public void ToAllMemories(){
        allmemButton = (Button)findViewById(R.id.allmemButton);
        allmemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent allmem = new Intent(Account.this,AllMemories.class);
                startActivity(allmem);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToFollowers();
        ToFollowing();
        ToAllMemories();
    }
}
