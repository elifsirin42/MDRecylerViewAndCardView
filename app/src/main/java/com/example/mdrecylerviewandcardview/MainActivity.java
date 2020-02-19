package com.example.mdrecylerviewandcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

/*We have to add Adapter to use RecyclerView.What is the Adapter?
   Android's Adapter is described in the API documantation, as "a bridge between an AdapterView
   and the underlying data for that view" */
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;
    private List<Person> personList;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        //Let's initialize are List<Person> personList here.
        personList = new ArrayList<>();

        for(int index = 0; index<20; index++){

            Person myPerson = new Person("MR. A","Programmer");
            personList.add(myPerson);
            Person myName = new Person("Elif","Computer Engineering");
            personList.add(myName);
        }

        //We need to initialize adapter here that we declerad 14'th code.
        recyclerViewAdapter = new MyRecyclerViewAdapter(personList,MainActivity.this);
        recyclerView.setAdapter(recyclerViewAdapter);


    }
}
