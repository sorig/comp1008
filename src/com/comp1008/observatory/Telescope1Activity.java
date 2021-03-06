package com.comp1008.observatory;

import android.os.Build; 
import android.os.Bundle;
import android.annotation.TargetApi;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class Telescope1Activity extends Activity {

	@Override
	@TargetApi(11)
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_telescope1);
		
		// Show the Up button in the action bar.
		if (Build.VERSION.SDK_INT >= 11) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_telescope1, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
            // This is called when the Home (Up) button is pressed
            // in the Action Bar.
            Intent telescopesActivityIntent = new Intent(this, TelescopesActivity.class);
            telescopesActivityIntent.addFlags(
                    Intent.FLAG_ACTIVITY_CLEAR_TOP |
                    Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(telescopesActivityIntent);
            finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}