package com.example.testingfor;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final int tamanho = 10;
		final TextView[] arrayTeste = new TextView[tamanho];
		final ImageView[] ImgProfs = new ImageView[tamanho];
		LinearLayout layout = (LinearLayout)findViewById(R.id.layout);
		for (int i = 0; i < tamanho; i++) {
			System.out.println(i);
			final TextView onTheMaking = new TextView(this);
			final ImageView cara = new ImageView(this);
			onTheMaking.setPadding(10, 0, 10, 10);
			onTheMaking.setText("tamos na:"+i);
			cara.setImageResource(getResources().getIdentifier("/TestingFor/res/drawable-mdpi/happy_white.png", null, null));
			layout.addView(onTheMaking);
			layout.addView(cara);
			arrayTeste[i] = onTheMaking;
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
