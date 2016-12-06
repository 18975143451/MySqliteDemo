package com.example.root.mysqlitedemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 显示结果
 * @author bixiaopeng 2013-2-16 下午3:06:36
 */
public class DisplayActivity extends Activity {
    private String result = null;
    private TextView display = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Bundle extras = getIntent().getExtras();
       result = extras.getString("searchResult");
       display = (TextView)findViewById(R.id.display_txt);
       display.setText(result);
    }
}
