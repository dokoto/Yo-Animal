package com.dokoto.yoanimal.connection;

public interface ConnectionListener
{
	public void onConnectionComplete();
	public void onConnectionStart();
	public void onConnectionError();

}
