package com.example.parsetagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KmRYbBteAH1fRI9ORV27jBQhn0EthwDwi9FbYREY")
                .clientKey("dQBKl1ST18N0Yi6mKFSP6VL4qTwYbfTey4gIzgdq")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
