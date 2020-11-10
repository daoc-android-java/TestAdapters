package daoc.dsii.testadapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		
		Button b = (Button) findViewById(R.id.b);
		b.setText("Ir a GridView");

		ListView lv = (ListView) findViewById(R.id.lv);

		String[] elementos = new String[] {"Pedro", "Pablo", "Anita", "X", "Y", "Z", "1", "222"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.textview_adaptador, elementos);
		
		lv.setAdapter(adapter);
		
		lv.setOnItemClickListener(listItemClick);

	}

	private OnItemClickListener listItemClick = new OnItemClickListener() {
	    public void onItemClick(AdapterView parent, View v, int position, long id) {
	    	TextView t = (TextView) v;
	        Toast.makeText(ListActivity.this, "Click: " + t.getText(), Toast.LENGTH_SHORT).show();
	    }
	};
	
	public void buttonClick(View v) {
		Intent intent = new Intent(this, GridActivity.class);
		startActivity(intent);
	}

}
