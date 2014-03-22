package com.dokoto.yoanimal;

import com.dokoto.yoanimal.lastanimalslosed.FragmentLastAnimalsLosed;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main_activity);
		fragmentSelector(0, 0);

	}

	private void fragmentSelector(final int groupPosition, final int childPosition)
	{
		Fragment fragment = null;

		switch (groupPosition)
		{
		case 0:
			fragment = new FragmentLastAnimalsLosed();
		default:
		}

		if (fragment != null)
		{
			updateContent(fragment, groupPosition, childPosition);
		}
	}

	private void updateContent(final Fragment fragment, final int groupPosition, final int childPosition)
	{
		new Handler().postDelayed(new Runnable()
		{

			@Override
			public void run()
			{
				Bundle args = new Bundle();
				args.putString("PARAM1", "VALUE_OF_PARAM1");
				fragment.setArguments(args);

				FragmentManager fragmentManager = getFragmentManager();
				fragmentManager.beginTransaction().replace(R.id.main_fragment_container, fragment).commit();
			}
		}, 300);

	}

}
