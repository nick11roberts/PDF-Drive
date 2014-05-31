package io.github.nick11roberts.pdf_drive;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.os.Build;

public class PreviewActivity extends Activity {

	
    private static final int FLAG_ACTIVITY_CLEAR_TOP = 67108864;
    private static final int CAMERA_PIC_REQUEST = 1337;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        // FOR(place this in a for loop going from 0 to numberOfPages-1)
        camCall();  
        // END FOR

    }
	
	// Called by startActivityForResult method. 
	protected void onActivityResult(int requestCode, int resultCode, Intent data) { 
	    if (requestCode == CAMERA_PIC_REQUEST) {
	    	Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
	    }
	}
	
	// Called by the onCreate method. 
	protected void camCall(){
		
		
    	Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    	startActivityForResult(cameraIntent, CAMERA_PIC_REQUEST);
    			
    	
    	
	}
}