package com.dokoto.yoanimal.lastanimalslosed;

import com.dokoto.yoanimal.R;
import com.dokoto.yoanimal.model.Animal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentAdapterLastAnimalsLosed extends BaseAdapter
{
	private LayoutInflater inflater;
	private ViewHolder viewHolder;
	private Context context;
	private Animal[] animals;

	private static class ViewHolder
	{
		ImageView animal_photo;
		TextView animal_name;
	}

	public FragmentAdapterLastAnimalsLosed(LayoutInflater inflater, Animal[] datas, Context context)
	{
		this.inflater = inflater;
		this.context = context;
		this.animals = datas;
	}

	@Override
	public int getCount()
	{
		return animals.length;
	}

	@Override
	public Object getItem(int position)
	{
		return animals[position];
	}

	@Override
	public long getItemId(int position)
	{
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.fragment_row_animals_losed, null);

			viewHolder = new ViewHolder();
			
			viewHolder.animal_name = (TextView) convertView.findViewById(R.id.lose_animal_name);
			viewHolder.animal_photo = (ImageView) convertView.findViewById(R.id.lose_animal_photo);
			
			convertView.setTag(viewHolder);

		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		
		viewHolder.animal_name.setText(animals[position].name);
		viewHolder.animal_photo.setImageDrawable(parent.getResources().getDrawable(animals[position].fake_photo));		
		
		return convertView;
	}

}
