package com.dokoto.yoanimal.lastanimalslosed.connection;

import com.dokoto.yoanimal.connection.BaseConnection;
import com.dokoto.yoanimal.connection.ConnectionListener;

import android.content.Context;

public class LastAnimalsLosedConnection extends BaseConnection
{
	public LastAnimalsLosedConnection(Context context, ConnectionListener listener)
	{
		super(context, listener);
	}

	public LastAnimalsLosedConnection(Context context, ConnectionListener listener, String url)
	{
		super(context, listener, url);
		init();
	}

	@SuppressWarnings("unchecked")
	private void init()
	{

	}
	

}
