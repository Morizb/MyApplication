package com.example.asus.myapplication.adapater;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.myapplication.R;
import com.example.asus.myapplication.bean.Animal;


public class AnimalHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;

    public AnimalHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image_view);
        textView = itemView.findViewById(R.id.test_view);
    }

    public void bindView(Animal animal) {
        imageView.setImageResource(animal.getImage());
        textView.setText(animal.getTitle());
    }
}
