package com.kngapp.balloonsample;

/**
 * Created by masashi on 16/06/01.
 */
public class BalloonContent {
    /*
        type
            1: text only
            2: text + image
            3: URL link
     */

    private int mType;
    private String mText;
    private String mURL;
    private boolean isLeft;

    public BalloonContent(){
        isLeft = true;
    }

    public void setText(String text){
        mText = text;
    }

    public void setURL(String text){
        mURL = text;
    }

    public void setLeft(boolean bool){
        isLeft = bool;
    }
}
