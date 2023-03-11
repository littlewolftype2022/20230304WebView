package com.example.a20230304webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.webview);

        mWebView.getSettings().setJavaScriptEnabled(true);

        mWebView.loadUrl("https://www.baidu.com");

//        mWebView.setWebViewClient(new WebViewClient(){
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
//
//                if(Uri.parse(String.valueOf(request)).getHost().equals("www.baidu.com")){
//                    return false;
//                }
//                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(String.valueOf(request)));
//                startActivities(intent);
//
//                return true;
//            }
//
//            private void startActivities(Intent intent) {
//            }
//        });

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()){
            mWebView.goBack();
            return true;
        }

        return false;
    }
}