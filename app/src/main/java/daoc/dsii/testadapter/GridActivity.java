package daoc.dsii.testadapter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class GridActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid);

		Button b = (Button) findViewById(R.id.b);
		b.setText("Ir a SpinnerView");

		GridView gv = (GridView) findViewById(R.id.gv);
		
		Drawable[] elementos = new Drawable[] {
				getResources().getDrawable(R.drawable.apple),
				getResources().getDrawable(R.drawable.banana),
				getResources().getDrawable(R.drawable.apple),
				getResources().getDrawable(R.drawable.banana),
				getResources().getDrawable(R.drawable.apple),
				getResources().getDrawable(R.drawable.banana)};
		
		AdaptadorDatos adapter = new AdaptadorDatos(this, R.layout.imgview_adaptador, elementos);

		gv.setAdapter(adapter);
		
		gv.setOnItemClickListener(gridItemClick); 
	}
	
	private OnItemClickListener gridItemClick = new OnItemClickListener() {
	    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	        Toast.makeText(GridActivity.this, "Click: " + position, Toast.LENGTH_SHORT).show();
	    }
	};	
	
	public void buttonClick(View v) {
		Intent intent = new Intent(this, SpinnerActivity.class);
		startActivity(intent);
	}
	
}
