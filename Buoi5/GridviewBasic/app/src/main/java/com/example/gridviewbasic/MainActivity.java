package com.example.gridviewbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView grdSanPham;
    String [] SanPham ={"Máy ảnh", "Laptop", "Điện thoại", "Sạc dự phòng", "Ổ cứng di động"};
    ArrayList<String> dsSP=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linkviews();
        loadData();
    }

    private void linkviews() {
        grdSanPham = findViewById(R.id.gvSanPham);
    }

    private void loadData() {
        //tao ket noi du lieu với gridview
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,SanPham);
        //đẩy dữ liệu lên gridview
        grdSanPham.setAdapter(adapter);
    }
}