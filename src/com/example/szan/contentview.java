package com.example.szan;


import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class contentview extends Activity {
	@Override
	public void onCreate(Bundle save) {
		super.onCreate(save);
		//set the main content layout of the Activity
		setContentView(R.layout.contentview);
		
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
        
		Bundle bundle = getIntent().getExtras(); 
		if(bundle !=null) {
		    
			Bundle extras = bundle.getBundle("extras");
			String contents = extras.getString("contents");
			String format = extras.getString("format");
			TextView data1 = (TextView) findViewById(R.id.textView1);
			data1.setMovementMethod(new ScrollingMovementMethod());
			TextView data2 = (TextView) findViewById(R.id.textView2);
			data1.setText(contents);
			data1.setClickable(true);
			data2.setText(format);
			
		
		}
	}


}
