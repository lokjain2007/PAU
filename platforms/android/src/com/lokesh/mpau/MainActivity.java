package com.lokesh.mpau;

import org.apache.cordova.*;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.lokesh.mpau.R;

public class MainActivity extends CordovaActivity
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
        loadUrl(launchUrl);
    }


	  public boolean onOptionsItemSelected(MenuItem item) {
	       // Handle presses on the action bar items
	       switch (item.getItemId()) {
	       case R.id.action_settings:
	           	exitApp();
	           	return true;
	           default:
	               return onOptionsItemSelected(item);
	       }
	   }
	  
	 private void exitApp() {
		 AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

	    alertDialog.setPositiveButton("Yes", new OnClickListener() {

		        public void onClick(DialogInterface dialog, int which) {
		            finish();
		            System.exit(0);
		        }
		    });

		    alertDialog.setNegativeButton("No", null);
		    alertDialog.setMessage("Do you really want to quit?");
		    alertDialog.setTitle("Quit mobile PAU");
//		    alertDialog.setIcon(R.drawable.ic_launcher);
		    alertDialog.show();
//		 finish();
//	     System.exit(0);
	 }


	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mob_pau, menu);
		return true;
	}

}
