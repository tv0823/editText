package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
    TextView num1,num2,num3,num4,num5,num6;
    EditText eT1,eT2,eT3;
    Button btn_eT1,btn_eT2,btn_eT3;
    ImageView iV1,iV2,iV3;
    Random rnd = new Random();
    int rnd1,rnd2,rnd3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);

        eT1 = findViewById(R.id.eT1);
        eT2 = findViewById(R.id.eT2);
        eT3 = findViewById(R.id.eT3);

        btn_eT1 = findViewById(R.id.btn_eT1);
        btn_eT2 = findViewById(R.id.btn_eT2);
        btn_eT3 = findViewById(R.id.btn_eT3);

        iV1 = findViewById(R.id.iV1);
        iV2 = findViewById(R.id.iV2);
        iV3 = findViewById(R.id.iV3);

        rnd1 = rnd.nextInt(89)+10;
        num1.setText(""+rnd1);
        rnd2 = rnd.nextInt(89)+10;
        num2.setText(""+rnd2);
        rnd3 = rnd.nextInt(89)+10;

    }

    public void pressed1(View view) {
        String ans = eT1.getText().toString();
        int ans1 = Integer.parseInt(ans);
        if(rnd1 + rnd2 == ans1)
            iV1.setImageResource(R.drawable.goodmark);
        else
            iV1.setImageResource(R.drawable.badmark);
        num3.setText(rnd1 + rnd2);
        num4.setText(rnd3);
    }

    public void pressed2(View view) {


    }
}