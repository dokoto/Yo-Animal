package com.dokoto.yoanimal.lastanimalslosed;

import android.app.Fragment;

import com.dokoto.yoanimal.R;
import com.dokoto.yoanimal.common.IBackEndProccess;
import com.dokoto.yoanimal.connection.Controller;
import com.dokoto.yoanimal.model.Animal;

public class FragmentControllerLastAnimalsLosed extends Controller
{
	private IBackEndProccess backEndProccess;
	private Animal[] animals;

	public FragmentControllerLastAnimalsLosed(Fragment fragment)
	{
		super(fragment);
		backEndProccess = (IBackEndProccess) fragment;
	}

	public void downLoadDatas()
	{
		
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
			animals = fakeHttpGET();
			backEndProccess.downLoadComplete();

		} catch (Exception ex)
		{
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
	
	private Animal[] fakeHttpGET()
	{
		animals = new Animal[6];
		
		animals[0].name = "Jeronimo";
		animals[0].fake_photo = R.drawable.fake_cat_1;

		animals[1].name = "Rigoberto";
		animals[1].fake_photo = R.drawable.fake_cat_2;

		animals[2].name = "Rocky";
		animals[2].fake_photo = R.drawable.fake_dog_1;

		animals[3].name = "Yambo";
		animals[3].fake_photo = R.drawable.fake_dog_2;

		animals[4].name = "Macumba";
		animals[4].fake_photo = R.drawable.fake_parrot_1;
		
		animals[5].name = "Piolin";
		animals[5].fake_photo = R.drawable.fake_parrot_2;
		
		return animals;
	}

}
