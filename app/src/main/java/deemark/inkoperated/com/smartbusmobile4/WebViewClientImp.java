package deemark.inkoperated.com.smartbusmobile4;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebViewClientImp extends WebViewClient {
    ProgressDialog progressDialog;
    private Activity activity = null;

    public WebViewClientImp(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        webView.loadUrl(url);
        return true;
    }
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon){

        super.onPageStarted(view,url,favicon);
        progressDialog = new ProgressDialog(activity);
        progressDialog.setMessage("Please wait while we set everything up for you." +
                " Ensure that your internet connection is active");
        progressDialog.show();

    }
    @Override
    public void onPageFinished(WebView view, String url){
        super.onPageFinished(view,url);
        progressDialog.dismiss();
    }
}