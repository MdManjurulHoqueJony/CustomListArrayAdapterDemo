package com.wordpress.jonyonandroidcraftsmanship.customlistarrayadapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class CustomArrayAdapter extends ArrayAdapter<String> {

    private Context context=null;
    private String[] titles=null;
    private String[] descriptions=null;
    private int[] images=null;

    public CustomArrayAdapter(Context context, String[] titles,String[] descriptions,int[] images) {
        super(context, R.layout.single_row, R.id.tvTitle, titles);
        this.context = context;
        this.titles=titles;
        this.descriptions=descriptions;
        this.images=images;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
        ViewHolder viewHolder=null;

        if (convertView==null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.single_row, parent, false);
            viewHolder=new ViewHolder(view);
            view.setTag(viewHolder);
            Logger.log(context.getString(R.string.msg_new_row));
        }else{
            viewHolder= (ViewHolder) view.getTag();
            Logger.log(context.getString(R.string.msg_recycling));
        }

        viewHolder.getIvImage().setImageResource(images[position]);
        viewHolder.getTvTitle().setText(titles[position]);
        viewHolder.getTvDescription().setText(descriptions[position]);

        return view;
    }
}
