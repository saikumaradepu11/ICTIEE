package com.example.saikumar.ictiee;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Homepage extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        webView=findViewById(R.id.webview);
        WebSettings webSettings=webView.getSettings();
        webView.loadUrl("http://ictiee.org/ictiee2019/");
        webSettings.setJavaScriptEnabled(true);

    }

    public class webclient extends WebViewClient
    {
        @Override
        public void onPageStarted (WebView view,String url,Bitmap fevicon)
        {
            super.onPageStarted(view,url,fevicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url)
        {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack())
        {
            webView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
