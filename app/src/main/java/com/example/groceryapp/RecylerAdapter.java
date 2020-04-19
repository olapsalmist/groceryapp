package com.example.groceryapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class RecylerAdapter extends RecyclerView.Adapter<RecylerAdapter.ViewHolder>{

    String data1[], data2[];
    int images[];
    Context context;

   public RecylerAdapter (Context ct, String s1[], String s2 [], int img[]){
       context = ct;
       data1 = s1;
       data2 = s2;
       images = img;
   }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.row_items, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.text.setText(data1[position]);
        holder.text2.setText(data2[position]);
        holder.imageView2.setImageResource(images[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("data1", data1[position]);
                intent.putExtra("data2", data2[position]);
                intent.putExtra("imageView2", images[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return images.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

       ImageView imageView2;
       TextView text, text2;
       ConstraintLayout mainLayout;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);

            text = itemView.findViewById(R.id.text);
            text2 = itemView.findViewById(R.id.text2);
            imageView2 = itemView.findViewById(R.id.imageView2);
            mainLayout = itemView.findViewById(R.id.mainLayout);

            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {

        }
    }
}
