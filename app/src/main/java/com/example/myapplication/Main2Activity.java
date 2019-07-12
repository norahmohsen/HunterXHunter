package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class Main2Activity extends Activity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView text1 = findViewById(R.id.Bylaws_1);
        text1.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);

        TextView text2 = findViewById(R.id.Bylaws_2);
        text2.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);

        TextView text3 = findViewById(R.id.Bylaws_3);
        text3.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);

        TextView text4 = findViewById(R.id.Bylaws_4);
        text4.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);


    }
}
