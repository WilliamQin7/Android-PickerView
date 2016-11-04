package com.bigkoo.pickerview.adapter;

import java.util.ArrayList;

/**
 * Created by William on 16/11/4.
 */

public class ImageWheelAdapter<T> implements WheelAdapter{
    /** The default items length */
    public static final int DEFAULT_LENGTH = 4;

    // items
    private ArrayList<T> items;
    // length
    private int length;

    public ImageWheelAdapter(ArrayList<T> items, int length) {
        this.items = items;
        this.length = length;
    }

    @Override
    public int getItemsCount() {
        return items.size();
    }

    @Override
    public Object getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return "";
    }

    @Override
    public int indexOf(Object o) {
        return items.indexOf(o);
    }
}
