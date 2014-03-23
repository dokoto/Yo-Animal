package com.dokoto.yoanimal.lastanimalslosed;

import android.app.Fragment;
import android.widget.Toast;

import com.dokoto.yoanimal.common.IBackEndProccess;
import com.dokoto.yoanimal.connection.Controller;
import com.dokoto.yoanimal.lastanimalslosed.connection.LastAnimalsLosedConnection;
import com.dokoto.yoanimal.model.Animal;
import com.dokoto.yonimal.mocks.LastAnimalsLosed;

public class LastAnimalsLosedFragmentController extends Controller
{
	private IBackEndProccess backEndProccess;
	private Animal[] animals;
	private LastAnimalsLosedConnection connection;

	public LastAnimalsLosedFragmentController(Fragment fragment)
	{
		super(fragment);		
		backEndProccess = (IBackEndProccess) fragment;
	}

	public void downLoadDatas()
	{
		if (connection != null)
			connection.cancel();
		
		connection = new LastAnimalsLosedConnection(this.getActivity(), this);
		connection.request();
	}

	@Override
	public void onConnectionStart()
	{
		backEndProccess.loading();
	}

	@Override
	public void onConnectionComplete()
	{
		try
		{
			animals = LastAnimalsLosed.fakeHttpGET();
			backEndProccess.downLoadComplete();

		} catch (Exception ex)
		{
			Toast.makeText(this.getActivity(), ex.toString(), Toast.LENGTH_SHORT).show();
			ex.printStackTrace();
			backEndProccess.downLoadError();
		}
	}

	@Override
	public void onConnectionError()
	{
		try
		{
			backEndProccess.downLoadError();

		} catch (Exception ex)
		{
			backEndProccess.downLoadError();
		}
	}
	
	@Override
	public Object getDatas()
	{
		return animals; 
	}

}
