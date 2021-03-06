package deemark.inkoperated.com.smartbusmobile4;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class ListofCity extends Activity {
    private ArrayList<String> list = new ArrayList<String>(); //Initialize ArrayList with String data type
    Intent mIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_listof_city);
        ListView mlistview = (ListView) findViewById(R.id.listView);
        list.add("Lusaka"); //Add one String into the ArrayList list
        list.add("Kitwe"); //Add another one String into the ArrayList list
        ArrayAdapter<String> mArrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list); //Use the build-in view list that provided by ArrayAdapter
        mlistview.setAdapter(mArrayAdapter);
        mlistview.setOnItemClickListener(new OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,long id) { //This is automatically generated by the OnItemClickListener, the parameters are shown as the default name says, so we can assign the "position" in the next progress.
                // TODO Auto-generated method stub

                Toast.makeText(getApplicationContext(),
                        "Click ListItem Number " + position, Toast.LENGTH_LONG)
                        .show();

                String post = list.get(position);
                Intent p = new Intent(ListofCity.this, bus_schedule.class);
                p.putExtra("route_id",post );
                startActivity(p);

//
////                }
            }

        });
    }

}