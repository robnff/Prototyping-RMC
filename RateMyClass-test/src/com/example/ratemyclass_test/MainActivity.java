package com.example.ratemyclass_test;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	int cont = 0;
	Button button1, button2, button3;
	String[][] perguntas = new String[7][2];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Bundle extras = getIntent().getExtras();
		perguntas[0][0]="eae, ta mudando?";
		perguntas[1][0] ="mudou!!";
		if (extras != null){
			cont = extras.getInt("contador");
		}
		super.onCreate(savedInstanceState);
		String pergunta = perguntas[cont][0];
		setContentView(R.layout.activity_main);
		//carregando a pergunta
		TextView shownQ = (TextView)findViewById(R.id.pergunta);
		shownQ.setText(pergunta);

		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);

		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick (View v) {
				cont++;
				Intent intent = new Intent(MainActivity.this, MainActivity.class);
				intent.putExtra("contador", cont);
				intent.putExtra("resposta", 1);
				startActivity(intent);
				finish();
			}
		});

		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick (View v) {
				cont++;
				Intent intent = new Intent(MainActivity.this, MainActivity.class);
				intent.putExtra("contador", cont);
				intent.putExtra("resposta", 2);
				startActivity(intent);
				finish();
			}
		});

		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick (View v) {
				cont++;
				Intent intent = new Intent(MainActivity.this, MainActivity.class);
				intent.putExtra("contador", cont);
				intent.putExtra("resposta", 3);
				startActivity(intent);
				finish();
			}
		});
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
