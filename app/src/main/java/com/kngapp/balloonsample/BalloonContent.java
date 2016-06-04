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
    private long id;
    private String mText;
    private String mURL;
    private boolean isLeft;


    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }
    public BalloonContent(String str){
        //コンストラクタ
        isLeft = true;
        mText = str;
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

    public String getText(){
        return mText;
    }
    public boolean isLeft(){
        return isLeft;
    }
}
