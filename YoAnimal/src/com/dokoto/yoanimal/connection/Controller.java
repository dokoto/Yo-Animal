package com.dokoto.yoanimal.connection;

import android.app.Fragment;

public class Controller
{
	Fragment fragment;
	
	public Controller(Fragment fragment){
		this.fragment = fragment;
	}
	
	public void onConnectionStart() {}
	public void onConnectionComplete() {}
	public void onConnectionError() {}
	public Object getDatas() { return new Object(); }
}
