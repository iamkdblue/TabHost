package kdblue.com.tabhost;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost =(TabHost)findViewById(android.R.id.tabhost);

        //create tab menu

        TabHost.TabSpec menu1 = tabHost.newTabSpec("First Tab");
        TabHost.TabSpec menu2 = tabHost.newTabSpec("Second Tab");
        TabHost.TabSpec menu3 = tabHost.newTabSpec("Third Tab");

        //setting tab1 name
        menu1.setIndicator("Calculate");
        //setting activity
       menu1.setContent(new Intent(this,MainActivity.class));

        menu2.setIndicator("Set Target");
        menu1.setContent(new Intent(this,MainActivity.class));

        menu3.setIndicator("About");
        menu1.setContent(new Intent(this,MainActivity.class));

        tabHost.addTab(menu1);
        tabHost.addTab(menu2);
        tabHost.addTab(menu3);
    }
}
