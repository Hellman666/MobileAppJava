package com.example.onoff;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView txt;
    Boolean change = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        txt = (TextView) findViewById(R.id.textView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(change){
                    btn.setText("Zapnout");
                    txt.setText("OFF");
                    btn.setBackgroundColor(Color.RED);
                    change=false;
                }
                else{
                    btn.setText("Vypnout");
                    txt.setText("ON");
                    btn.setBackgroundColor(Color.GREEN);
                    change=true;
                }
            }
        });
    }
}