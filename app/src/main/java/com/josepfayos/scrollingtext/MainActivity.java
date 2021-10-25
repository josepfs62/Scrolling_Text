package com.josepfayos.scrollingtext;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View buttonEdit = (TextView)findViewById(R.id.buttonEdit);
        View article = (TextView)findViewById(R.id.article);

        buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (article.isEnabled() == false) {
                    article.setEnabled(true);
                } else {
                    article.setEnabled(false);
                }
            }

        });
    }
}