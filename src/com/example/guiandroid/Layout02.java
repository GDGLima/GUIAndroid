package com.example.guiandroid;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class Layout02 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout02);
		_init();
	}

	private void _init() {
		/*
		 * final String[] datos = new String[] { "Carlos", "Erick", "Juan",
		 * "Eduardo", "Mason" };
		 * 
		 * ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
		 * android.R.layout.simple_list_item_1, datos);
		 */

		List<ListaClase> datos = new ArrayList<ListaClase>();

		datos.add(new ListaClase(R.drawable.sample_6, "Freddy"));
		datos.add(new ListaClase(R.drawable.sample_7, "Eduardo"));
		datos.add(new ListaClase(R.drawable.sample_2, "Mason"));
		datos.add(new ListaClase(R.drawable.sample_3, "Charles"));
		datos.add(new ListaClase(R.drawable.sample_1, "Alevandine - Diego"));
		datos.add(new ListaClase(R.drawable.sample_4, "Roxana"));
		datos.add(new ListaClase(R.drawable.sample_5, "Franco"));

		AdaptadorClase adapter = new AdaptadorClase(getBaseContext(), datos);

		ListView listView1 = (ListView) findViewById(R.id.listView1);

		listView1.setAdapter(adapter);

		listView1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
					long arg3) {
				Toast.makeText(getBaseContext(), "Posici—n: " + pos,
						Toast.LENGTH_LONG).show();
			}
		});

	}

}
