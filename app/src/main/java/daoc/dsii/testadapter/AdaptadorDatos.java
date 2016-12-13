package daoc.dsii.testadapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorDatos extends ArrayAdapter<Drawable> {

	private int resource;
	private Drawable[] objects;
	
	public AdaptadorDatos(Context context, int resource, Drawable[] objects) {
		super(context, resource, objects);
		
		this.resource = resource;
		this.objects = objects;
		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView == null) {
			LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(resource, null);			
		}
		ImageView iv = (ImageView) convertView;
		iv.setImageDrawable(objects[position]);
		return convertView;
	}
	
}
