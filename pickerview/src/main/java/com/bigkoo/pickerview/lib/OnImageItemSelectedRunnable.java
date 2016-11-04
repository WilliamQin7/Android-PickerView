package com.bigkoo.pickerview.lib;

/**
 * Created by William on 16/11/4.
 */

class OnImageItemSelectedRunnable implements Runnable {
    final WheelImageView loopView;

    OnImageItemSelectedRunnable(WheelImageView loopview) {
        loopView = loopview;
    }

    @Override
    public final void run() {
        loopView.onItemSelectedListener.onItemSelected(loopView.getCurrentItem());
    }
}
