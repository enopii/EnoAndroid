package com.hoge;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main extends Activity {
    private String[] data = {"HT-03A", "Xperia", "NexusOne", "Droid"};

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView( R.layout.main );

        ListView list = (ListView)findViewById( R.id.listView1 );

        ArrayAdapter<String> arrayAdapter
            = new ArrayAdapter<String>(this, R.layout.rowitem, data);

        list.setAdapter(arrayAdapter);
    }

}
