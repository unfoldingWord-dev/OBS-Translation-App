package com.door43.obt.ata;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * custom adapter for a row in the menu
 */

public class RowAdapter extends BaseAdapter {

    Context context;
    String[] data;
    String[] imgsrc;
    private static LayoutInflater inflater = null;

    public RowAdapter(Context context, String[] data, String[] imgsrc) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
        this.imgsrc = imgsrc;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.menu_item, null);
        TextView text = (TextView) vi.findViewById(R.id.itemText);
        text.setText(data[position]);
        ImageView img = (ImageView) vi.findViewById(R.id.itemImage);
        //img.setImageResource(R.drawable.img1_thumbnail);
        img.setImageResource(context.getResources().getIdentifier(imgsrc[position], "drawable", context.getPackageName()));

        return vi;
    }
}
