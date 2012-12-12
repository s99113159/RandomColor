package Stanley.Chen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RandomColorActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		findViewById();
		randomColor();
	}

	public void go(View v) {
		randomColor();
	}

	private void randomColor() {
		for (int i = 0; i < textView.length; i++) {
			boolean isDifferent = false;
			do {
				int rString = (int) ((Math.random() * 8) + 0);
				int rColor = (int) ((Math.random() * 8) + 0);
				if (rString != rColor) {
					textView[i].setText(textString[rString]);
					textView[i].setTextColor(this.getResources().getColor(textColor[rColor]));
					isDifferent = false;
				} else {
					isDifferent = true;
				}
			} while (isDifferent);
		}
	}

	private int[] textString = { R.string.red, R.string.orange,
			R.string.yellow, R.string.green, R.string.blue, R.string.purple,
			R.string.black, R.string.white };

	private int[] textColor = { R.color.red, R.color.orange, R.color.yellow,
			R.color.green, R.color.blue, R.color.purple, R.color.black,
			R.color.white };

	//
	private void findViewById() {
		textView[0] = (TextView) findViewById(R.id.textView_0);
		textView[1] = (TextView) findViewById(R.id.textView_1);
		textView[2] = (TextView) findViewById(R.id.textView_2);
		textView[3] = (TextView) findViewById(R.id.textView_3);
		textView[4] = (TextView) findViewById(R.id.textView_4);
		textView[5] = (TextView) findViewById(R.id.textView_5);
		textView[6] = (TextView) findViewById(R.id.textView_6);
		textView[7] = (TextView) findViewById(R.id.textView_7);
		textView[8] = (TextView) findViewById(R.id.textView_8);
		textView[9] = (TextView) findViewById(R.id.textView_9);
	}

	private TextView[] textView = new TextView[10];

}