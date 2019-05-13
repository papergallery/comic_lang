package com.example.comic_lang;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setContentView(R.layout.shop);
//                    mTextMessage.setText(R.string.app_name);
                    return true;
                case R.id.navigation_dashboard:
                    setContentView(R.layout.storymode);
//                    mTextMessage.setText(R.string.title_storymode);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_vocabulary);
                    return true;
                case R.id.navigation_profile:
                    mTextMessage.setText(R.string.title_profile);
                    return true;
            }
            return false;
        }
    };
    public void bannerFliper(int image){
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(image);
        imgBanner.addView(imageView);
        imgBanner.setFlipInterval(6000);
        imgBanner.setAutoStart(true);
        imgBanner.setInAnimation(this, android.R.anim.fade_in);
        imgBanner.setOutAnimation(this, android.R.anim.fade_out);


    }
    ViewFlipper imgBanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);
        imgBanner=findViewById(R.id.imgBanner);

        int sliders[]={
                R.drawable.shop_banner1, R.drawable.shop_banner2, R.drawable.shop_banner3
        };
        for(int slide:sliders){
            bannerFliper(slide);
        }

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        LinearLayout layout = (LinearLayout) findViewById(R.id.linear);
        for (int i = 0; i < 10; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setId(i);
            imageView.setPadding(2, 2, 2, 2);
            imageView.setImageBitmap(BitmapFactory.decodeResource(
                    getResources(), R.drawable.navigation_profile));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            TextView text = new TextView(this);
            text.setId(i);
            text.setPadding(2, 2, 2, 2);
            text.setText("qqqqqqqqqqq");
            TextView price = new TextView(this);
            price.setId(i);
            price.setText("19.99");
            layout.addView(text);
            layout.addView(imageView);
            layout.addView(price);
            layout.with;
        }

    }

}
