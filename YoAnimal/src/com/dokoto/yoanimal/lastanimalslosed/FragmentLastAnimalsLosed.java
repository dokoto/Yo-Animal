package com.dokoto.yoanimal.lastanimalslosed;


import com.dokoto.yoanimal.R;
import com.dokoto.yoanimal.common.IBackEndProccess;
import com.dokoto.yoanimal.model.Animal;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentLastAnimalsLosed extends Fragment implements IBackEndProccess
{
	private FragmentControllerLastAnimalsLosed controller;
	private FragmentAdapterLastAnimalsLosed mAdapter;
	private ListView animalLosedList;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{

		final View ViewLastAnimalsLosed = inflater.inflate(R.layout.fragment_last_animals_losed, container, false);
		animalLosedList = (ListView) ViewLastAnimalsLosed.findViewById(R.id.list);
		controller = new FragmentControllerLastAnimalsLosed(this);
		controller.downLoadDatas();
		
		return ViewLastAnimalsLosed;
	}

	@Override
	public void loading()
	{

	}

	@Override
	public void downLoadComplete()
	{
		if (mAdapter == null)
		{
			mAdapter = new FragmentAdapterLastAnimalsLosed(getActivity().getLayoutInflater(), (Animal[])controller.getDatas(), getActivity());
			animalLosedList.setAdapter(mAdapter);
		}
	}

	@Override
	public void downLoadError()
	{

	}

}
