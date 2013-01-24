package com.example.guiandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RelativeAct extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout06);
		_init();
	}

	private void _init() {
		((Button) findViewById(R.id.btnClick))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						EditText txtNombre = (EditText) findViewById(R.id.txtNombre);
						String nombre = txtNombre.getText().toString().trim();

						String msg = "LLENA TU NOMBRE MASON!!!!";

						if (nombre.length() > 0) {
							msg = "El nombre 'colocado' es: " + nombre;
						}
						Toast.makeText(getBaseContext(), msg, Toast.LENGTH_LONG)
								.show();
					}
				});
	}

}
