package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gridviewadvanced.R;
import com.example.model.Product;

import java.util.List;

public class ProductAdapter extends BaseAdapter {

    Activity context;
    int item_layout;
    List<Product> productList;

    public ProductAdapter(Activity context, int item_layout, List<Product> productList) {
        this.context = context;
        this.item_layout = item_layout;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int i) {
        return productList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
        //link view
            holder =new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(item_layout,null);
            holder.imvPhoto = view.findViewById(R.id.imvthumb);
            holder.txtName = view.findViewById(R.id.txtname);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
//binding
        Product p = productList.get(i);
        holder.txtName.setText(p.getProductName());
        holder.imvPhoto.setImageResource(p.getProductThumb());
        return view;
    }
    public static class ViewHolder{
        ImageView imvPhoto;
        TextView txtName;
    }
}
