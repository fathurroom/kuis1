package com.example.windows.imagegallery;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.Objects;

/**
 * Created by WINDOWS on 02/10/2018.
 */

public class ImageAdapter extends BaseAdapter
{
    private Context context;
    public Integer [] images =
            {
                    R.drawable.masjid, R.drawable.parkir, R.drawable.restroom, R.drawable.rumahsakit, R.drawable.tempatmakan, R.drawable.temple, R.drawable.toilet
            };

    public ImageAdapter (Context c)
    {
        context = c;
    }

    @Override
    public int getCount()
    {
        return images.length;
    }

    @Override
    public Object getItem(int position)
    {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View confertView, ViewGroup parent)
    {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new GridView.LayoutParams(300,300));
        return imageView;
    }
}
