package com.chatroom.chatroom;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by w23html on 11/4/15.
 */
public class ChatApplication extends Application {
    public static final String YOUR_APPLICATION_ID = "yHxoCHAnMEvt9nODhuKtbl19cJmvTxBIlurNqJLH";
    public static final String YOUR_CLIENT_KEY = "Qq9neZFOj6jubgRrxZdUZY0Wmdf4PAvYcBAZNLC5";
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(Message.class);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }
}
