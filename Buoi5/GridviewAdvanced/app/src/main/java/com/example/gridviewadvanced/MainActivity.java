package com.example.gridviewadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.adapter.ProductAdapter;
import com.example.model.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gvProduct;
    ProductAdapter adapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linkviews();
        loadData();
        addEvent();
    }

    private void linkviews() {
        gvProduct =findViewById(R.id.grvProduct);
    }

    private void loadData() {
        gvProduct =findViewById(R.id.grvProduct);
//init data
        products =new ArrayList<Product>();
        products.add(new Product(R.drawable.beer333, "Beer 333"));
        products.add(new Product(R.drawable.hanoi, "Beer Hanoi"));
        products.add(new Product(R.drawable.heineken, "Beer Heineken"));
        products.add(new Product(R.drawable.larue, "Beer Larue"));
        products.add(new Product(R.drawable.saigon, "Beer Saigon"));
        products.add(new Product(R.drawable.sapporo, "Beer Sapporo"));
        products.add(new Product(R.drawable.tiger, "Beer Tiger"));
        //init adapter
        adapter = new ProductAdapter(MainActivity.this,R.layout.item_list,products);
        gvProduct.setAdapter(adapter);
    }

    private void addEvent() {
        
    }
}