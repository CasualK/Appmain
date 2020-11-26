package com.example.appmain1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnAlert).setOnClickListener(this);
    }


public void onClick(View v){
    switch(v.getId()) {
        case R.id.btnAlert:
            new AlertDialog.Builder(this)
                    .setTitle("직원 호출")
                    .setMessage("잠시만 기다려 주세요")
                    .setNeutralButton("닫기", new DialogInterface.OnClickListener(){
                        public void onClick(DialogInterface dlg, int sumthin){}
                    })
                    .show();
            break;
    }
    }
}