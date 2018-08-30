package deemark.inkoperated.com.smartbusmobile4;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by G640 on 2/4/2018.
 */
//public class Trackbus_fragment extends Fragment {
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//
//        View v = inflater.inflate(R.layout.track_bus_fragment,container,false);
//
//        /* Define Your Functionality Here
//           Find any view  => v.findViewById()
//          Specifying Application Context in Fragment => getActivity() */
//
//        return v;
//    }
//}

public class Trackbus_fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.track_bus_fragment,container,false);

        Button button = v.findViewById(R.id.track_bus);
        final EditText EditText = v.findViewById(R.id.track_bus_input);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Webview.class);
                i.putExtra("Bus_Track_Number", EditText.getText().toString());
                startActivity(i);

            }
        });

        return v;
    }
}