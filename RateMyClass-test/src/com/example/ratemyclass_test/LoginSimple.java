package com.example.ratemyclass_test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginSimple extends Activity {
	
		Button login;
		EditText username, password;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_login_simple);
			username = (EditText)findViewById(R.id.editText1);
			password = (EditText)findViewById(R.id.editText2);
			login = (Button)findViewById(R.id.log);

			login.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View v){
					String login = username.getText().toString().trim();
					String passw = password.getText().toString().trim();
					System.out.println(login);
					System.out.println(passw);
					if(login.equals("oioi") && passw.equals("oioi")){
						Toast toast = Toast.makeText(getApplicationContext(), "logou!!", Toast.LENGTH_SHORT);
						toast.show();
					} else{
						Toast toast = Toast.makeText(getApplicationContext(), "digitasse errado, fera...",Toast.LENGTH_SHORT);
						toast.show();
					}
				}
			});
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.login_simple, menu);
			return true;
		}

	}
