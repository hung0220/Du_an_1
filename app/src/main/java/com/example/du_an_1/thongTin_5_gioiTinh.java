package com.example.du_an_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class thongTin_5_gioiTinh extends AppCompatActivity {
    Button tiepTuc5;
    ImageView troVe5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thong_tin_5_gioi_tinh);

        //         tiếp tục
        tiepTuc5 = findViewById(R.id.btnTT5);
        tiepTuc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongTin_5_gioiTinh.this, thongTin_6_moTa.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

//        Trờ về
        troVe5 = findViewById(R.id.imgAfter5);
        troVe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongTin_5_gioiTinh.this, thongTin_4_ngaySinh.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }
}