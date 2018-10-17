package com.vappsx.esst;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class AdvanceActivity extends AppCompatActivity {

	public void toastShort(String message){
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
	}
	public void toastLong(String message){
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
	}
}
