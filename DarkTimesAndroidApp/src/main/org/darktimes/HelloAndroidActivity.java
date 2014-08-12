package org.darktimes;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class HelloAndroidActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.main(new String[]{""});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	    getMenuInflater().inflate(org.darktimes.R.menu.main, menu);
	    return true;
    }
}