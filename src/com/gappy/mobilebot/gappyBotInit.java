package com.gappy.mobilebot;

import android.os.Bundle;
import org.apache.cordova.*;

public class gappyBotInit extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}