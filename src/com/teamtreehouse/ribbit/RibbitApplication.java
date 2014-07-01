package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application{
	@Override
	public void onCreate() {
		super.onCreate();
		  Parse.initialize(this, "QQEF9HPoiva9jHWxTg1tJPUWXUsSoOq4ElJjKYUL", "6j8tmOWqt86zlHlFQc2cvgkA4ycpqhbwJ1aVBGim");

		}
}
