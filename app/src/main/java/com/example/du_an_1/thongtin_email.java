package com.example.du_an_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class thongtin_email extends AppCompatActivity {
    Button tiepTuc1;
    ImageView troVe1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtin_email);

//        Tiếp tục
        tiepTuc1 = findViewById(R.id.btnTT1);
        tiepTuc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtin_email.this, thongtin_sothich.class);
                Toast.makeText(thongtin_email.this, "chuyển thành công", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

//        Trở về
        troVe1 = findViewById(R.id.imgAfter1);
        troVe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(thongTin_1_email.this, thongTin_1_email.class);
//                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
//                startActivity(intent);
            }
        });
    }
}