package com.nalazoocare.progresst;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;

/**
 * Created by nalazoo.yeomeme@gmail.com on 2020-08-18
 */
public class ProgressBarAnimation extends Animation {
    private ProgressBar progressBar;
    private float from;
    private float to;

    public ProgressBarAnimation(ProgressBar progressBar, float from, float to) {
        this.progressBar = progressBar;
        this.from = from;
        this.to = to;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float value = from + (to - from) * interpolatedTime;
        progressBar.setProgress((int)value);
    }
}
