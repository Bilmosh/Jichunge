package com.bill.jichunge;


import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class CustomListAdapter extends BaseAdapter {

    //generate getters and setters
    Context mContext;
    List<Item> originalItems;
    ArrayList<Item> searchItems;

    //generate constructor
    public CustomListAdapter(Context mContext,List<Item> originalItems) {
        this.mContext = mContext;
        this.originalItems=originalItems;
        searchItems=new ArrayList<>();
        searchItems.addAll(originalItems);

    }

    @Override
    public int getCount() {
        return originalItems.size();
    }

    @Override
    public Object getItem(int position) {
        return originalItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if ( convertView== null){
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) convertView. findViewById(R.id.imgIcon);
            viewHolder.textViewTitle= (TextView) convertView.findViewById(R.id.tvTitle);
            viewHolder.textViewMotto= (TextView) convertView.findViewById(R.id.tvMotto);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();

        }
        viewHolder.imageView.setImageResource(originalItems.get(position).getImage());
        viewHolder.textViewTitle.setText(originalItems.get(position).getTitle());
        viewHolder.textViewMotto.setText(originalItems.get(position).getMotto());
        Log.d("MYHEALTH",originalItems.get(position).getTitle());
        return convertView;
    }

    public  void filter(String searchText){
        searchText=searchText.toLowerCase();
        originalItems.clear();
        if (searchText.length()==0){
            originalItems.addAll(searchItems);
        }else {
            for (Item item:searchItems) {
                if (item.getTitle().toLowerCase().contains(searchText)){
                    originalItems.add(item);
                }
            }
        }
        notifyDataSetChanged();

    }
    static class ViewHolder {
        ImageView imageView;
        TextView textViewTitle;
        TextView textViewMotto;

    }
}
