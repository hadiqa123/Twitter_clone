package com.example.twitter_clone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("0l5A46gfoRSUjMaErlBKPJEP3ZbO53XnQDkkwso7")
                .clientKey("iGfVQoVsouZsY3ktn6BZNyYR1HhlRfpVrnhpderc")
                .server("https://parseapi.back4app.com")
                .build());
        createObject();
    }

    public void createObject() {
        String myCustomKey1Value = "foo";
        Integer myCustomKey2Value = 999;

        ParseObject myNewObject = new ParseObject("MyCustomClassName");
        myNewObject.put("myCustomKey1Name", myCustomKey1Value);
        myNewObject.put("myCustomKey2Name", myCustomKey2Value);

        // Saves the new object.
        // Notice that the SaveCallback is totally optional!
        myNewObject.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {

            }
        });
    }
}

