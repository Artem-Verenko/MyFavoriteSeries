package com.darktower.myfavoriteseries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MViewItemLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_view_item_layout);

        TextView title = findViewById(R.id.titleTV);
        TextView text = findViewById(R.id.textTV);
        ImageView imageView = findViewById(R.id.imageV);


        Intent intent = getIntent();
        if(intent != null){
            title.setText(intent.getStringExtra("titleTV"));
            text.setText(intent.getStringExtra("textTV"));
            imageView.setImageResource(intent.getIntExtra("imageV", 0));
        }
    }

}