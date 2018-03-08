package com.example.pamir.recyclerviewfloatingbutton;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by pamir on 08-Mar-18.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.AdapterViewHolder> {

    private int mNumnerItems;
    private Context mContext;

    public DataAdapter(Context context, int numberOfItems){
        mContext = context;
        mNumnerItems = numberOfItems;
    }
    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        AdapterViewHolder adapterViewHolder = new AdapterViewHolder(view);


        return adapterViewHolder;
    }

    @Override
    public void onBindViewHolder(AdapterViewHolder holder, int position) {

        holder.bindData(position);

    }

    @Override
    public int getItemCount() {
        return mNumnerItems;
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder
    implements View.OnClickListener{

        TextView mTextView;
        public Button mButton;

        public AdapterViewHolder(View itemView) {
            super(itemView);

            mTextView = itemView.findViewById(R.id.tv_item);
            mButton = itemView.findViewById(R.id.btn_item);
            mButton.setOnClickListener(this);

        }

        public void bindData(int ListIndex){

            mTextView.setText(String.valueOf(ListIndex + 1) + " item of the List " );
        }

        @Override
        public void onClick(View v) {

            Toast.makeText(mContext,"You clicked " + mTextView.getText().toString(), Toast.LENGTH_LONG).show();
        }
    }
}
