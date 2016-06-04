package com.kngapp.balloonsample;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by masashi on 16/06/01.
 */
public class BalloonAdapter extends BaseAdapter {
    ArrayList<BalloonContent> mContents;
    LayoutInflater layoutInflater = null;
    Context mContext;
    public BalloonAdapter(Context context){
        this.mContext = context;
        this.layoutInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount(){
        return mContents.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView balloonText;
        Log.d("debug",String.valueOf(convertView));
        Log.d("debug",mContents.get(position).getText());
        if(mContents.get(position).isLeft()){
            //左レイアウト
            convertView = layoutInflater.inflate(R.layout.left_balloon,parent,false);
            balloonText = (TextView)convertView.findViewById(R.id.balloonText_left);
            balloonText.setText(mContents.get(position).getText());
        }else{
            //右レイアウト
            convertView = layoutInflater.inflate(R.layout.right_balloon,parent,false);
            balloonText = (TextView)convertView.findViewById(R.id.balloonText_right);
            balloonText.setText(mContents.get(position).getText());
        }
        return convertView;
    }

    @Override
    public Object getItem(int position) {
        return mContents.get(position);
    }


    @Override
    public long getItemId(int position) {
        return mContents.get(position).getId();
    }

    public void setBalloonContent(ArrayList<BalloonContent> array){
        this.mContents = array;
    }

    public void clearBalloonContent(){
        this.mContents.clear();
    }
}
