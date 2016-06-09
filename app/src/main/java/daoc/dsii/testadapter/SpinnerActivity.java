package daoc.dsii.testadapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);

		Button b = (Button) findViewById(R.id.b);
		b.setText("Nada más");	

		String[] elementos = new String[] {"Pedro", "Pablo", "Anita", "Vero"};		
		
		Spinner sv = (Spinner) findViewById(R.id.sv);
		
		//https://github.com/android/platform_frameworks_base/blob/master/core/res/res/layout/simple_list_item_1.xml
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, elementos);	
		
		sv.setAdapter(adapter);
		
		sv.setOnItemSelectedListener(spinnerItemClick);	
	
	}
	
	private OnItemSelectedListener spinnerItemClick = new OnItemSelectedListener() {
		public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
	    	TextView t = (TextView) v;
	        Toast.makeText(SpinnerActivity.this, "Click: " + t.getText(), Toast.LENGTH_SHORT).show();
		}
		public void onNothingSelected(AdapterView parent) {
		}
	};		
	
	public void buttonClick(View v) {
	}
	
}
