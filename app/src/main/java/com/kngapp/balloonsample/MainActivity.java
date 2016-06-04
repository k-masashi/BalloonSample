package com.kngapp.balloonsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listBalloon = (ListView)findViewById(R.id.listView);
        ArrayList<BalloonContent> contents = new ArrayList<>();
        BalloonAdapter adapter = new BalloonAdapter(this);

        BalloonContent sample1 = new BalloonContent("もしもし");
        sample1.setLeft(true);
        contents.add(sample1);

        BalloonContent sample2 = new BalloonContent("What?");
        sample2.setLeft(false);
        contents.add(sample2);

        //adapter.notifyDataSetChanged();

       adapter.setBalloonContent(contents);
        listBalloon.setAdapter(adapter);

    }
}
