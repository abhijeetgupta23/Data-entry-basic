package com.example.android.sample3;

import android.support.v4.app.Fragment;
/**
 * A simple {@link Fragment} subclass.
 */
public class Sample_Fragment extends Fragment {

    public Sample_Fragment() {
        // Required empty public constructor
    }
/*



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String name = "";
        String dept="";
        Bundle extras;

        MainActivity activity = (MainActivity) getActivity();

        //Get name and dept from EnterDetails()//
        extras= activity.getIntent().getExtras();
        name=extras.getString("Name");
        dept=extras.getString("Dept");

        Log.e("Name in App_dev=",name);



        View v = inflater.inflate(R.layout.fragment_app_development, container, false);

        // Find the root view so we can add child views to it
        FrameLayout rootView = (FrameLayout) v.findViewById(R.id.app_dev);
        LinearLayout linearLayout = new LinearLayout(getActivity());
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
        linearLayout.setLayoutParams(params);
        linearLayout.setGravity(Gravity.CENTER);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        rootView.addView(linearLayout);


        // Create a new TextView
        TextView wordView = new TextView(getActivity());
        // Set the text to be word at the current index
        Log.e("Dept in App",dept);

        //If true, text is added to FragmentLayout //

        if (name != null&&(dept.equals("App Developers")))
        {
            wordView.setText(name);
            wordView.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            linearLayout.setGravity(Gravity.CENTER);
            wordView.setTextSize(24);
            wordView.setTextColor(getResources().getColor(R.color.black));
            // Add this TextView as another child to the root view of this layout
            linearLayout.addView(wordView);
        }



        // Inflate the layout for this fragment
        return v;
    }
*/
}