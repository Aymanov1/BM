package com.example.hamada.beautyMeasure;

import android.content.Context;
import android.webkit.WebView;

/**
 * Created by Hamada on 12/3/2015.
 */
public class GifWebView extends WebView {

    public GifWebView(Context context, String path) {
        super(context);

        loadUrl(path);
    }
}