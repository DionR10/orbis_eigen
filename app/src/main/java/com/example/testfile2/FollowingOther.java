package com.example.testfile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FollowingOther extends AppCompatActivity {

    public ImageButton backfollowingotherBtn;

    public void BackToOther2(){
        backfollowingotherBtn = (ImageButton) findViewById(R.id.backfollowingButtonOther);
        backfollowingotherBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtoother2 = new Intent(FollowingOther.this,OtherAccount.class);
                startActivity(backtoother2);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_following_other);
        BackToOther2();
    }
}
