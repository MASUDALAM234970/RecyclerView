package com.error41.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    // 4 - Handling the Clicklistener:
    public ItemClickListener click123;

    private  VaccineModel [] listData;

    // 1 - Data Source

    public MyAdapter(VaccineModel[] listData) {
        this.listData = listData;
    }



    // 2 - View Holder Class

    public   class   MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView textView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.imageView=itemView.findViewById(R.id.imageView);
            this.textView=itemView.findViewById(R.id.textView);
        }

        public  void onClick(View view){

            if (click123 != null)
            {

                click123.onClick(view,getAdapterPosition());
            }


       }



    }

    // 3- implement the methods

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View listTtem =inflater.inflate(R.layout.recyvlerview_iem,parent,false);
        MyViewHolder viewHolder= new MyViewHolder(listTtem);
        return  viewHolder;



    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        final  VaccineModel myListData= listData[position];
        holder.textView.setText(listData[position].getTittle());
        holder.imageView.setImageResource(listData[position].getImage());
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }




}
