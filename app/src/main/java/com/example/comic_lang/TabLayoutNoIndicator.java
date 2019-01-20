package com.example.comic_lang;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class TabLayoutNoIndicator extends TabLayout {

    public TabLayoutNoIndicator(Context context) {
        this(context, null);
    }

    public TabLayoutNoIndicator(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TabLayoutNoIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected BaseSlidingTabStrip createTabStrip() {
        return new NoIndicatorSlidingTabStrip(getContext());
    }

    private class NoIndicatorSlidingTabStrip extends BaseSlidingTabStrip {
        NoIndicatorSlidingTabStrip(Context context) {
            super(context);
        }

        @Override
        public void draw(Canvas canvas) {
            super.draw(canvas);
        }
    }
}

