package jp.ac.st.asojuku.original2014001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DaikyouActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daikyou);


		//渡ってきたintentを取得
		Intent intent = getIntent();
		//intentに混入していたExtraから、キーワードを元に値を取得
		String name = intent.getStringExtra("name");

		TextView tv = (TextView)findViewById(R.id.txvMsg3);
		tv.setText(name + "さんの今日の運命は・・・");


	}

}
