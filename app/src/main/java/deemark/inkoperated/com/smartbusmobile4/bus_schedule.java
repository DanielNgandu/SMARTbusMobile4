package deemark.inkoperated.com.smartbusmobile4;


import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class bus_schedule extends AppCompatActivity {
    private String url;
    private WebView webView;
    private ProgressDialog progressBar;
    private float xCor;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        WebView webView = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);


        final WebViewClientImp webViewClient = new WebViewClientImp(this);
        webView.setWebViewClient(webViewClient);

        webView.loadUrl("http://kandsdigitalsolutions.com/smartbus/ViewData.php");

    }

}



