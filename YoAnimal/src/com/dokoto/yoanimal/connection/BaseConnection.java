package com.dokoto.yoanimal.connection;

import android.content.Context;

public class BaseConnection
{
	private Context context;
	private ConnectionListener listener;
	private String url;
	
	public BaseConnection(Context context, ConnectionListener listener)
	{
		this.context = context;
		this.listener = listener;
	}

	public BaseConnection(Context context, ConnectionListener listener, String url)
	{
		this.context = context;
		this.listener = listener;
		this.url = url;

	}
	
	public void request()
	{
		listener.onConnectionComplete();
	}
	
	public void cancel()
	{
		
	}
	
}
