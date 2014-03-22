package com.dokoto.yoanimal.lastanimalslosed;

import android.app.Fragment;
import android.widget.Toast;

import com.dokoto.yoanimal.R;
import com.dokoto.yoanimal.common.IBackEndProccess;
import com.dokoto.yoanimal.connection.Controller;
import com.dokoto.yoanimal.lastanimalslosed.connection.LastAnimalsLosedConnection;
import com.dokoto.yoanimal.model.Animal;

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
			animals = fakeHttpGET();
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
	
	private Animal[] fakeHttpGET()
	{
		animals = new Animal[6];
		
		animals[0] = new Animal();
		animals[0].name = "Jeronimo";
		animals[0].last_place = "Visto hace 10 min";
		animals[0].last_time = "en Avda. Portugal 71";					
		animals[0].fake_photo = R.drawable.fake_cat_1;

		animals[1] = new Animal();
		animals[1].name = "Rigoberto";
		animals[1].last_place = "Visto hace 2 horas";
		animals[1].last_time = "en Parque Atenas";							
		animals[1].fake_photo = R.drawable.fake_cat_2;

		animals[2] = new Animal();
		animals[2].name = "Rocky";
		animals[2].last_place = "Visto hace 6 horas";
		animals[2].last_time = "en Lago Casa Campo";								
		animals[2].fake_photo = R.drawable.fake_dog_1;

		animals[3] = new Animal();
		animals[3].name = "Yambo";
		animals[3].last_place = "Visto hace 2 dias";
		animals[3].last_time = "en C\\ Caramuel 12";							
		animals[3].fake_photo = R.drawable.fake_dog_2;

		animals[4] = new Animal();
		animals[4].name = "Macumba";
		animals[4].last_place = "Visto hace 4 dias";
		animals[4].last_time = "en Metro Oporto";									
		animals[4].fake_photo = R.drawable.fake_parrot_1;
		
		animals[5] = new Animal();
		animals[5].name = "Piolin";
		animals[5].last_place = "Visto hace 15 dias";
		animals[5].last_time = "en Plaza España";								
		animals[5].fake_photo = R.drawable.fake_parrot_2;
		
		return animals;
	}

}
