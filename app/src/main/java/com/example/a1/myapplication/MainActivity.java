package com.example.a1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView container;

    ArrayList<ImageView> picturesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        container.setLayoutManager(layoutManager);


    }

    class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ImageViewHolder>{

        @Override
        public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ImageViewHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.custom_layout, parent, false));
        }

        @Override
        public void onBindViewHolder(ImageViewHolder holder, int position) {
            
        }

        @Override
        public int getItemCount() {
            return 0;
        }

        class ImageViewHolder extends RecyclerView.ViewHolder{
            public ImageView picture;

            public ImageViewHolder(View itemView) {
                super(itemView);

                picture = itemView.findViewById(R.id.picture);
            }
        }
    }
}