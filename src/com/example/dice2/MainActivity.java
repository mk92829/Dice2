package com.example.dice2;

import java.util.Random;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	int i,j;
	Button btn;
	ImageView img, img2;
	Random ran = new Random();
	TextView text,text2,text3;
	int z,x,c;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button1);
        text = (TextView)findViewById(R.id.textView4);
        text2 = (TextView)findViewById(R.id.textView5);
        text3 = (TextView)findViewById(R.id.textView6);
        img = (ImageView)findViewById(R.id.imageView1);
        img2 = (ImageView)findViewById(R.id.imageView2);
        btn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		c++;
		text3.setText("클릭 수 = " + c);
		i = ran.nextInt(6);
		j = ran.nextInt(6);
		img.setImageResource(R.drawable.dice21+i);
		img2.setImageResource(R.drawable.dice21+j);
		if(i>j){
			text.setText("컴퓨터가 이겼습니다.");
			z++;
			text2.setText(z + " : " + x);
		}
		else if(i<j){
			text.setText("사용자가 이겼습니다.");
			x++;
			text2.setText(z + " : " + x);
		}
		else
			text.setText("비겼습니다.");
	}
}
