package com.example.pamir.recyclerviewfloatingbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecyclerViewActivity extends AppCompatActivity {

    public static final int NUM_LIST_ITEMS = 20;
    private DataAdapter mDataAdapter;
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        mRecyclerView = findViewById(R.id.recycler_view);

         LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
         mRecyclerView.setLayoutManager(linearLayoutManager);

         mRecyclerView.setHasFixedSize(true);

         mDataAdapter = new DataAdapter(this,NUM_LIST_ITEMS);

         mRecyclerView.setAdapter(mDataAdapter);
    }
}
