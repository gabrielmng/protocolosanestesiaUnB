package com.anestesiologiaunb.protocolos;

import android.app.*;
import android.os.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void cliquevpa(View view)
    {
    setContentView(R.layout.vpa1);
    }
    
    
}
