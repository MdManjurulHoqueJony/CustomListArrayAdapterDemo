package com.wordpress.jonyonandroidcraftsmanship.customlistarrayadapterdemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {
    private ImageView ivImage=null;
    private TextView tvTitle=null;
    private TextView tvDescription=null;

    public ViewHolder(View view) {
        ivImage= (ImageView) view.findViewById(R.id.ivImage);
        tvTitle= (TextView) view.findViewById(R.id.tvTitle);
        tvDescription= (TextView) view.findViewById(R.id.tvDescription);
    }

    public ImageView getIvImage() {
        return ivImage;
    }

    public TextView getTvTitle() {
        return tvTitle;
    }

    public TextView getTvDescription() {
        return tvDescription;
    }

}
