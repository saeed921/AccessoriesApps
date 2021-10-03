package com.example.myfirstbuildingapps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StagAdapter extends RecyclerView.Adapter<StagAdapter.ImageViewHolder> {

    Context context;
    List<Row>data;

    public StagAdapter(Context context, List<Row> data) {
        this.context = context;
        this.data = data;
    }
    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.staggeredrowitem,null);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ImageViewHolder holder, @SuppressLint("RecyclerView") final int i) {
        holder.imageView.setImageResource(data.get(i).getImage());
        //holder.imageView1.setImageResource(data.get(i).getImage1());
       // holder.textView.setText(data.get(i).getDetails());
        //holder.textView.setText(R.string.about);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,SecondActivity.class);
                intent.putExtra("image1",data.get(i).getImage1());
                intent.putExtra("details",data.get(i).getDetails());
                //intent.putExtra("others",data.get(i).getOthers());
                //intent.putExtra("image1",data.get(i).getOthers());
                context.startActivity(intent);
            }
        });
    };


    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView,imageView1;
        LinearLayout linearLayout;
        TextView textView;

        public ImageViewHolder(@NonNull final View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageID);
            imageView1=itemView.findViewById(R.id.secondimageID);
            linearLayout=itemView.findViewById(R.id.linearID);
            textView=itemView.findViewById(R.id.secondtextID);

            };


                }
            };










