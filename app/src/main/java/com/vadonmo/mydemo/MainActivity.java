package com.vadonmo.mydemo;

import android.app.Activity;
import android.graphics.Matrix;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
    //private ImageView imgXc;
    private ImageView imgTj;
    //private ImageView imgKg;
    //private RelativeLayout relCx;
    private RelativeLayout relRoot;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageView = new ImageView(this);
        imageView.setImageDrawable(getDrawable(R.mipmap.xc));
        imageView.setScaleType(ImageView.ScaleType.MATRIX);//??
        setContentView(R.layout.activity_main);
        initView();
        testTranslate();
    }

    private void initView() {
        //imgXc = findViewById(R.id.img_xc);
        //imgKg = findViewById(R.id.img_kg);
        imgTj = findViewById(R.id.img_tjc);
        //relCx = findViewById(R.id.rel_xc);
        relRoot = findViewById(R.id.rel_root);
        relRoot.addView(imageView);
    }

    //平移
    private void testTranslate() {
        Matrix matrix = new Matrix();
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        matrix.postTranslate(width * 10, height * 10);
        imageView.setImageMatrix(matrix);
    }
}
