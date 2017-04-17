package com.anestesiologiaunb.protocolos;

import android.app.*;
import android.os.*;
import android.view.View;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void clickvpa1(View view){
		
		setContentView(R.layout.avaliacao1);
	}
}
