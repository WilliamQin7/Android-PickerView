package com.bigkoo.pickerview.model;

/**
 * Created by William on 16/11/5.
 */

public class ImageTestModel implements ImagePickerViewData {
    private int mImageId;

    public ImageTestModel(int id) {
        this.mImageId = id;
    }

    @Override
    public int getImageId() {
        return mImageId;
    }
}
