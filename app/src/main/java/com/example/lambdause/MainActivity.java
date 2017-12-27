package com.example.lambdause;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.btn_click);
        btnClick.setOnClickListener(v -> {

        });

        btnClick.setOnClickListener(v -> Toast.makeText(getApplicationContext(),"点击了",Toast.LENGTH_SHORT).show());

        new Thread(() -> Log.d("TAG","lambda")).start();

        //定义比较器进行排序
        List<String> names = Arrays.asList("lilei", "hanmeimei", "tom", "jack");
        Collections.sort(names, (a, b) -> b.compareTo(a));
    }

}
