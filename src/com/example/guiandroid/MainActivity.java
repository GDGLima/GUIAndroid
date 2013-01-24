package com.example.guiandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		_init();
	}

	private void _init() {
		((Button) findViewById(R.id.button1)).setOnClickListener(this);
		((Button) findViewById(R.id.button2)).setOnClickListener(this);
		((Button) findViewById(R.id.button3)).setOnClickListener(this);
		((Button) findViewById(R.id.button4)).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;
		if (v.getId() == R.id.button1) {
			intent = new Intent(getBaseContext(), Layout01.class);
		} else if (v.getId() == R.id.button2) {
			intent = new Intent(getBaseContext(), Layout02.class);
		} else if (v.getId() == R.id.button3) {
			intent = new Intent(getBaseContext(), Layout03.class);
		} else if (v.getId() == R.id.button4) {
			intent = new Intent(getBaseContext(), RelativeAct.class);
		}

		if (intent != null) {
			startActivity(intent);
		}
	}

}
