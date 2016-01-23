package com.fusionjack.slimota;

import android.os.Bundle;
import android.webkit.WebView;
import android.app.Activity;
import android.view.MenuItem;

public class DownloadActivity extends Activity {
	
	private WebView webView;
	
		public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
	
		webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl(getResources().getString(R.string.download_url));
		getActionBar().setDisplayHomeAsUpEnabled(true);
}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
