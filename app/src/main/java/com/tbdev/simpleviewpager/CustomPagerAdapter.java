package com.tbdev.simpleviewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tolgahan on 09/10/17.
 */

class CustomPagerAdapter extends PagerAdapter {

    private List<DataModel> itemList;
    private Context context;
    private LayoutInflater inflater;

    public CustomPagerAdapter(Context c, List<DataModel> data) {
        this.context = c;
        this.itemList = data;
        this.inflater = (LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        Log.e("TOLGAHAN", "isViewFromObject FUNCTION");
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        Log.e("TOLGAHAN", "instantiateItem position :" + position + " resim no:" + (position + 1));

        View view = inflater.inflate(R.layout.tek_satir, container, false);

        ImageView imageView = view.findViewById(R.id.image_item);
        TextView textView = view.findViewById(R.id.tvBaslik);

        DataModel gecici = itemList.get(position);
        imageView.setImageResource(gecici.getImageId());
        textView.setText(gecici.getBaslik());

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        Log.e("TOLGAHAN", "silinen position :" + position + " resim no:" + (position + 1));

        // container=viewpager, object ise tek_satir.xml'in root elementi olan FrameLayout
        container.removeView((FrameLayout) object);
    }
}
