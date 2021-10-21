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
               .applicationId("U4lKz8zfiukpo7l8rHOIzRwTharn9DVTa6XPuAW0")
               .clientKey("4RcCqGk5YLDNCXgmeJiUZKsKSYfMPoF6591u9mMt")
               .server("https://parseapi.back4app.com")
               .build()
       );
    }
}
