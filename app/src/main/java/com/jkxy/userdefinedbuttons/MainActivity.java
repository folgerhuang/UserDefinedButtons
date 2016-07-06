package com.jkxy.userdefinedbuttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnMyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMyButton = (Button) findViewById(R.id.btnMyButton);

        btnMyButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnMyButton:
                break;
        }

    }
}
