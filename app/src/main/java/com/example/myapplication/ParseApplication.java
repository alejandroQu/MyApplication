package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6XWEHWktPbb5ehBfGuFUY7hhO5JUgiSP2wp81Kf4")
                .clientKey("T3FiwGV0N7lxnpcxtuQA8sG2aiso1bVZEsF0NsB9")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
