package com.example.posorneg;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // 1. Link Java variables to the XML IDs
        final EditText input = (EditText) findViewById(R.id.myInput);
        Button btn = (Button) findViewById(R.id.myButton);
        final TextView result = (TextView) findViewById(R.id.myResult);

        // 2. Set the click action
        btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					String val = input.getText().toString();
					if (!val.isEmpty()) {
						int X = Integer.parseInt(val);

						// YOUR LOGIC
						if (X > 0) result.setText("Nombor Positif");
						else if (X < 0) result.setText("Nombor Negatif");
						else result.setText("Nombor Sifar");
					}
				}
			});
    }
}
