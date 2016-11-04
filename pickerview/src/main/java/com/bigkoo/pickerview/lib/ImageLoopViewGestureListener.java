package com.bigkoo.pickerview.lib;

import android.view.MotionEvent;

/**
 * Created by William on 16/11/4.
 */

class ImageLoopViewGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {

    final WheelImageView loopView;

    ImageLoopViewGestureListener(WheelImageView loopview) {
        loopView = loopview;
    }

    @Override
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        loopView.scrollBy(velocityY);
        return true;
    }
}
