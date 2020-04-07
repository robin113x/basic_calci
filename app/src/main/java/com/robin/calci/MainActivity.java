package com.robin.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edt1, edt2;

    TextView tv;
    Button bt1, bt2, bt3, bt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText) findViewById(R.id.ed1);
        edt2 = (EditText) findViewById(R.id.ed2);

        tv = (TextView) findViewById(R.id.res);

        bt1 = (Button) findViewById(R.id.b1);
        bt2 = (Button) findViewById(R.id.b2);
        bt3 = (Button) findViewById(R.id.b3);
        bt4 = (Button) findViewById(R.id.b4);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b1:

                int a = Integer.parseInt(edt1.getText().toString());
                int y = Integer.valueOf(edt2.getText().toString());
                int z = a + y;
                tv.setText(""+ z);

                break;

            case R.id.b2:

                int zx = Integer.valueOf(edt1.getText().toString());
                int yd = Integer.valueOf(edt2.getText().toString());
                int zd = zx - yd;
                tv.setText("" + zd);

                break;

            case R.id.b3:

                int aa = Integer.valueOf(edt1.getText().toString());
                int yy = Integer.valueOf(edt2.getText().toString());
                int zz = aa * yy;
                tv.setText("" + zz);

                break;
            case R.id.b4:


                double xa = Integer.valueOf(edt1.getText().toString());
                double ya = Integer.valueOf(edt2.getText().toString());
                double za = xa / ya;
                tv.setText("" + za);
                break;


        }


    }
}
