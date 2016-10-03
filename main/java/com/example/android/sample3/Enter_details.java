package com.example.android.sample3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Enter_details extends AppCompatActivity {

    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_details);

        myDb = new DatabaseHelper(this);


        //Dropdown //
        final Spinner dropdown = (Spinner) findViewById(R.id.spinner1);
        String[] items = new String[]{"Business Developers", "Content Writers", "App Developers", "Web Developers", "Graphic Designers", "Social Media Managers"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        Button submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the submit button is clicked on.
            @Override
            public void onClick(View view) {
                final EditText n = (EditText) findViewById(R.id.name);

                String name = n.getText().toString();
                Log.e("Name", name);
                // dept stores Department selected in Spinner //
                final String dept = dropdown.getSelectedItem().toString();


                Log.e("Dept", dept);

                //Transfer data from this to a fragment//
                Intent main = new Intent(Enter_details.this, MainActivity.class);
                Bundle extras = new Bundle();
                //extras.putString("Name", name);
                extras.putString("Dept", dept);
                main.putExtras(extras);

                if (name != null&&dept.equals("Business Developers"))
                {
                    boolean isInserted = myDb.insertData("Business_Dev",name);
                    if(isInserted == true)
                        Toast.makeText(Enter_details.this,"Data Inserted in Business",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(Enter_details.this,"Data not Inserted in Business",Toast.LENGTH_LONG).show();
                }
                else
                if (name != null&&dept.equals("Content Writers"))
                {
                    boolean isInserted = myDb.insertData("Content",name);
                    if(isInserted == true)
                        Toast.makeText(Enter_details.this,"Data Inserted in Content",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(Enter_details.this,"Data not Inserted in Content",Toast.LENGTH_LONG).show();
                }
                else
                if (name != null&&dept.equals("App Developers"))
                {
                    boolean isInserted = myDb.insertData("App_Dev",name);
                    if(isInserted == true)
                        Toast.makeText(Enter_details.this,"Data Inserted in App",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(Enter_details.this,"Data not Inserted in App",Toast.LENGTH_LONG).show();
                }
                else
                if (name != null&&dept.equals("Web Developers"))
                {
                    boolean isInserted = myDb.insertData("Web_Dev",name);
                    if(isInserted == true)
                        Toast.makeText(Enter_details.this,"Data Inserted in Web_Dev",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(Enter_details.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                }
                else
                if (name != null&&dept.equals("Graphic Designers"))
                {
                    boolean isInserted = myDb.insertData("Graphics",name);
                    if(isInserted == true)
                        Toast.makeText(Enter_details.this,"Data Inserted in Graphic",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(Enter_details.this,"Data not Inserted in Graphic",Toast.LENGTH_LONG).show();
                }
                else
                if (name != null&&dept.equals("Social Media Managers"))
                {
                    boolean isInserted = myDb.insertData("Social",name);
                    if(isInserted == true)
                        Toast.makeText(Enter_details.this,"Data Inserted in Social",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(Enter_details.this,"Data not Inserted in Social",Toast.LENGTH_LONG).show();
                }


                startActivity(main);
            }
        });
    }
}