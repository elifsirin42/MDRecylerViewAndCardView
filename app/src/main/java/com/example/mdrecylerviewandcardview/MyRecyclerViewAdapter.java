package com.example.mdrecylerviewandcardview;

//We created this class to use RecyclerView in MainActivity.class

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

   private List<Person> persons;
   private Context context;

   public MyRecyclerViewAdapter(List<Person> persons,Context context){
       this.persons=persons;
       this.context=context;
   }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view= LayoutInflater.from(parent.getContext())
               .inflate(R.layout.recycler_list_item,parent,false);

       return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


       Person person = persons.get(position);

       holder.txtName.setText(person.getName());
       holder.txtJob.setText(person.getJob());

    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

       //We use define public that arguments in order that ViewHolder clas is inner class.
       public TextView txtName;
       public  TextView txtJob;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtPersonName);
            txtJob = itemView.findViewById(R.id.txtPersonJob);



        }
    }
}
