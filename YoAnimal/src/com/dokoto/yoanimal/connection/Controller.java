package com.dokoto.yoanimal.connection;

import android.app.Activity;
import android.app.Fragment;

public class Controller implements ConnectionListener
{
	Fragment fragment;

	public Controller(Fragment fragment)
	{
		this.fragment = fragment;
	}

	public Activity getActivity()
	{
		return fragment.getActivity();
	}
	
	public void onConnectionStart()
	{
	}

	public void onConnectionComplete()
	{
	}

	public void onConnectionError()
	{
	}

	public Object getDatas()
	{
		return new Object();
	}
}
