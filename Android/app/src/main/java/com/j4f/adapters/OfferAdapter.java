package com.j4f.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.j4f.R;
import com.j4f.cores.CoreActivity;
import com.j4f.models.Offer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by nvg58 on 11/21/15.
 * Project Android
 */
public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.DataObjectHolder> implements View.OnClickListener {
    private ArrayList<Offer> dataSet;
    private CoreActivity context;

    public OfferAdapter(ArrayList<Offer> myDataSet, CoreActivity context) {
        this.context = context;
        this.dataSet = myDataSet;
    }

    @Override
    public OfferAdapter.DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_offer, parent, false);
        return new DataObjectHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(OfferAdapter.DataObjectHolder holder, int position) {
        final Offer c = dataSet.get(position);
        holder.title.setText(c.getTitle());
        holder.content.setText(c.getContent());

        holder.number_bids.setText("0 bid");
        if (c.getBid_list() != null) {
            int nBids = c.getBid_list().length;
            if (nBids > 1) {
                holder.number_bids.setText(nBids + " bids");
            } else {
                holder.number_bids.setText(nBids + " bid");
            }
        }

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d = df.parse(c.getCreated_at());
            long time_past = (Calendar.getInstance().getTimeInMillis() - d.getTime()) / 3600 / 1000;
            if (time_past > 1) {
                holder.time_past.setText(time_past + " hours");
            } else {
                holder.time_past.setText(time_past + " hour");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    @Override
    public void onClick(View view) {

    }

    public static class DataObjectHolder extends RecyclerView.ViewHolder {
        public TextView title, content, number_bids, time_past;

        public DataObjectHolder(View itemView, int type) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            content = (TextView) itemView.findViewById(R.id.content);
            number_bids = (TextView) itemView.findViewById(R.id.number_bids);
            time_past = (TextView) itemView.findViewById(R.id.time_past);
        }
    }
}
