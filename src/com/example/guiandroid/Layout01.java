package com.example.guiandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Layout01 extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout05);
		_init();
	}

	private void _init() {
		((Button) findViewById(R.id.btnResult)).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.btnResult) {
			Toast.makeText(getBaseContext(), "Le gusta el queso",
					Toast.LENGTH_LONG).show();
		}
	}

}
