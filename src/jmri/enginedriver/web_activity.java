/*Copyright (C) 2011 M. Steve Todd
  mstevetodd@enginedriver.rrclubs.org
  
This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package jmri.enginedriver;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class web_activity extends Activity {

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    WebView webview = new WebView(this);
     
    String url = "file:///android_asset/feature_not_available.html";
    threaded_application mainapp = (threaded_application) getApplication();
    if (mainapp.web_server_port != null && mainapp.web_server_port > 0) {
    	url = "http://" + mainapp.host_ip + ":" +  mainapp.web_server_port;
    }
    webview.loadUrl(url);
    setContentView(webview);
    
  };


}
