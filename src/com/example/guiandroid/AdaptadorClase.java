package com.example.guiandroid;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorClase extends ArrayAdapter<ListaClase> {

	private int ResourceId;
	private List<ListaClase> datos;
	private Context mContext;

	public AdaptadorClase(Context context, List<ListaClase> datos) {
		super(context, R.layout.list_gdg, datos);
		this.ResourceId = R.layout.list_gdg;
		this.mContext = context;
		this.datos = datos;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (datos.get(position) != null) {
			LayoutInflater inflate = (LayoutInflater) this.mContext
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View item = inflate.inflate(this.ResourceId, null);

			ImageView imgProfile = (ImageView) item
					.findViewById(R.id.imgProfile);

			TextView txtNombre = (TextView) item.findViewById(R.id.txtNombre);

			imgProfile.setImageResource(datos.get(position).drawable);
			txtNombre.setText(datos.get(position).nombre);

			return (item);
		}
		return null;
	}
}