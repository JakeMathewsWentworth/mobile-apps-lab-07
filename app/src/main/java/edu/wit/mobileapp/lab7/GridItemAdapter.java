package edu.wit.mobileapp.lab7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by mathewsj2 on 2/27/18.
 */

public class GridItemAdapter extends ArrayAdapter<GridItem> {
    private LayoutInflater mInflater;

    public GridItemAdapter(Context context, int rid, List<GridItem> list){
        super(context, rid, list);
        mInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Retrieve data
        GridItem item = (GridItem)getItem(position);

        // Use layout file to generate View
        View view = mInflater.inflate(R.layout.grid_item, null);

        // Set item image
        ImageView image;
        image = (ImageView)view.findViewById(R.id.image);
        image.setImageBitmap(item.image);

        // Set item name
        TextView name;
        name = (TextView)view.findViewById(R.id.name);
        name.setText(item.name);

        // Set item date
        TextView dateTextView = (TextView) view.findViewById(R.id.date);
        dateTextView.setText(item.date);

        return view;
    }
}
