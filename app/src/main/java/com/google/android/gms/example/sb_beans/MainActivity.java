package com.google.android.gms.example.sb_beans;

import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();

        // PersonBean
        // call the bean and set values into it
        PersonBean aPerson = new PersonBean();
        aPerson.setAge(19);
        aPerson.setFirstName("Bob");
        aPerson.setLastName("Newhart");

        // print out results to the logs
        System.out.println("Name " + aPerson.getFirstName() + " " + aPerson.getLastName());
        System.out.println("Age " + aPerson.getAge());

        // get the values from the bean now
        String output = ("Auto seeded bean: " + aPerson.getFirstName() + " " + aPerson.getLastName() + " Age " + aPerson.getAge()) + "\n";

        // display these values to the TextView on the page

        // find the ID of the TextView
        TextView tOutput = (TextView) findViewById(R.id.TextViewOutput);

        // set the text values from the variable
        tOutput.setText(output);


        //demonstrate a java collection
        // create a list, use is ArrayList as concrete type
        // ArrayList<> infers the String type from the left side
        List<String> var = new ArrayList<>();

        // add a few Strings to the list
        var.add("Stephen");
        var.add("Jodi");
        var.add("Alexis");
        var.add("Mason");
        var.add("Lily");
        var.add("Olivia");
        var.add("Joshua");

        // Loop over it and print the result to the console
        for (String s : var) {
            System.out.println(s);
        }

        //demonstrate a java collection and use these values for the bean
        //create a list for each var FirstName, LastName, Age
        List<String> varPersonFirstName = new ArrayList<>();

        // add a few Strings to the list
        varPersonFirstName.add("Stephen");
        varPersonFirstName.add("Jodi");
        varPersonFirstName.add("Alexis");
        varPersonFirstName.add("Mason");
        varPersonFirstName.add("Lily");
        varPersonFirstName.add("Olivia");
        varPersonFirstName.add("Joshua");

        List<String> varPersonLastName = new ArrayList<>();

        // add a few Strings to the list
        varPersonLastName.add("Parker");
        varPersonLastName.add("Baldwin");
        varPersonLastName.add("Andrews");
        varPersonLastName.add("Parker");
        varPersonLastName.add("Puzey");
        varPersonLastName.add("Rhoton");
        varPersonLastName.add("Parker");

        List<Integer> varPersonAge = new ArrayList<>();

        // add a few Strings to the list
        varPersonAge.add(41);
        varPersonAge.add(39);
        varPersonAge.add(17);
        varPersonAge.add(15);
        varPersonAge.add(13);
        varPersonAge.add(9);
        varPersonAge.add(6);

        PersonBean aPersonList = new PersonBean();
        String collectionOutput = "Bean seeded from Arraylist:\n";

        // Loop over it and save the results to the bean then get them back out
        for (int i = 0; i < varPersonAge.size(); i++) {

            for (String firstName : varPersonFirstName) {
                // Loop over it and save the results to the bean then get them back out
                for (String lastName : varPersonLastName) {

                    // Loop over it and save the results to the bean then get them back out
                    for (Integer age : varPersonAge) {

                        aPersonList.setFirstName(varPersonFirstName.get(i));
                        aPersonList.setLastName(varPersonLastName.get(i));
                        aPersonList.setAge(varPersonAge.get(i));

                    }
                }

            }

            collectionOutput += aPersonList.getFirstName() + " " + aPersonList.getLastName() + " Age " + Integer.toString(aPersonList.getAge()) + "\n";

        }
        // post the output to the TextView

        // find the ID of the TextView
        TextView tOutputBeans = (TextView) findViewById(R.id.textViewCollectionBean);

        // set the text values from the variable
        tOutputBeans.setText(collectionOutput);

    }

    public void addListenerOnButton() {

        //Select a specific button to bundle it with the action you want
        button = (Button) findViewById(R.id.buttonCar);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                //Intent openBrowser =  new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.javacodegeeks.com"));
                //startActivity(openBrowser);

                // CarsBean
                // create a new instance of the bean
                CarsBean addCar = new CarsBean();
                // grab values from the input fields and pass them to the output text

                EditText editMake = (EditText) findViewById(R.id.editMake);
                String eMake = editMake.getText().toString();

                EditText editModel = (EditText) findViewById(R.id.editModel);
                String eModel = editModel.getText().toString();

                EditText editColor = (EditText) findViewById(R.id.editColor);
                String eColor = editColor.getText().toString();


                EditText editYear = (EditText) findViewById(R.id.editYear);
                int eYear = Integer.parseInt(editYear.getText().toString());

                addCar.setMake(eMake);
                addCar.setModel(eModel);
                addCar.setColor(eColor);
                addCar.setYear(eYear);


                // get the values from the bean now

                String output = "Car seeded from your input...\n";
                output += (addCar.getYear()) + " " + addCar.getColor() + " " + addCar.getMake() + " " + addCar.getModel();

                // display these values to the TextView on the page

                // find the ID of the TextView
                TextView tOutput = (TextView) findViewById(R.id.textViewCar);

                // set the text values from the variable
                tOutput.setText(output);
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}