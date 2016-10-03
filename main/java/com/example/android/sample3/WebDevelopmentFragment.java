package com.example.android.sample3;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class WebDevelopmentFragment extends Fragment {

    public WebDevelopmentFragment() {
        // Required empty public constructor
    }
    DatabaseHelper myDb;




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Database to Store Names
        myDb = new DatabaseHelper(getContext());



        MainActivity activity = (MainActivity) getActivity();
        String dept="";
        Bundle extras;

        /*Get name and dept from EnterDetails()*/
        extras= activity.getIntent().getExtras();
        dept=extras.getString("Dept");


        View v = inflater.inflate(R.layout.fragment_web_development, container, false);
        // Find the root view so we can add child views to it
        ScrollView rootView = (ScrollView) v.findViewById(R.id.web);
        LinearLayout linearLayout = new LinearLayout(getActivity());
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
        linearLayout.setLayoutParams(params);
        linearLayout.setGravity(Gravity.CENTER);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        rootView.addView(linearLayout);


        // Create a new TextView
        TextView wordView = new TextView(getActivity());

        Log.e("Dept in Web Dev", dept);


        //res traverses info acquired from database
        Cursor res = myDb.getAllData();
        if(res.getCount() == 0) {
            // show no found message
            Toast.makeText(getActivity(), "Nothing found",Toast.LENGTH_LONG).show();
        }

        //Buffer stores text acquired from database
        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()) {
            if(res.getString(3)!=null)
                buffer.append(res.getString(3)+"\n");

        }
        Log.e("Text in Web Dev",buffer.toString());

        wordView.setText(buffer);
        wordView.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
        wordView.setTextSize(24);
        wordView.setTextColor(getResources().getColor(R.color.black));
        // Add this TextView as another child to the root view of this layout
        linearLayout.addView(wordView);



        // Inflate the layout for this fragment
        return v;
    }
}
