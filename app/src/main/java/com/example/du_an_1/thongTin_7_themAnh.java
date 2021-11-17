package com.example.du_an_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class thongTin_7_themAnh extends AppCompatActivity {
    Button tiepTuc7;
    ImageView troVe7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thong_tin_7_them_anh);

//         tiếp tục
        tiepTuc7 = findViewById(R.id.btnTT7);
        tiepTuc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(thongTin_7_themAnh.this, thongTin_7_themAnh.class);
//                startActivity(intent);
//                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

//        Trờ về
        troVe7 = findViewById(R.id.imgAfter7);
        troVe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongTin_7_themAnh.this, thongTin_6_moTa.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }
}