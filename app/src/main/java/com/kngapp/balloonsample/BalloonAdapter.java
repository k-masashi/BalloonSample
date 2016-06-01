package com.kngapp.balloonsample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by masashi on 16/06/01.
 */
public class BalloonAdapter extends BaseAdapter {

    Context mContext;
    public BalloonAdapter(Context context){
        this.mContext = context;
    }

    @Override
    public int getCount(){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 199;
    }

}
