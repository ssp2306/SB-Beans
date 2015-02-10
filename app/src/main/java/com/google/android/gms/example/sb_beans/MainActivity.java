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
import java.util.*;

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

        PersonBean bPerson = new PersonBean();
        bPerson.setAge(32);
        bPerson.setFirstName("Sam");
        bPerson.setLastName("Goody");

        HouseBean aHouse = new HouseBean();
        aHouse.setHouseName("Parker House");
        aHouse.setBedroom("Master");

        // add the aPerson we just created to the family bean
        // one to many bean example
        aHouse.addFamilyMember(aPerson);

        // one to one bean example
        String output = ("House Name, Full Name, and Bedroom:\n" + aHouse.getHouseName() + " " + aHouse.getFamily().get(0).getFullName() + " " + aHouse.getBedroom());

        // display these values to the TextView on the page
        // find the ID of the TextView
        TextView tOutput = (TextView) findViewById(R.id.TextViewOutput);

        // set the text values from the variable
        tOutput.setText(output);
//
//        //demonstrate a java collection
//        // create a list, use is ArrayList as concrete type
//        // ArrayList<> infers the String type from the left side
//        List<String> var = new ArrayList<>();
//
//        // add a few Strings to the list
//        var.add("Stephen");
//        var.add("Jodi");
//        var.add("Alexis");
//        var.add("Mason");
//        var.add("Lily");
//        var.add("Olivia");
//        var.add("Joshua");
//
//        // try to break it
//        var.add(null);
//
//        // Loop over it and print the result to the console
//        for (String s : var) {
//            System.out.println(s);
//        }
//
//        //demonstrate a java collection and use these values for the bean
//        //create a list for each var FirstName, LastName, Age
//        List<String> varPersonFirstName = new ArrayList<>();
//
//        // add a few Strings to the list
//        varPersonFirstName.add("Stephen");
//        varPersonFirstName.add("Jodi");
//        varPersonFirstName.add("Alexis");
//        varPersonFirstName.add("Mason");
//        varPersonFirstName.add("Lily");
//        varPersonFirstName.add("Olivia");
//        varPersonFirstName.add("Joshua");
//
//        List<String> varPersonLastName = new ArrayList<>();
//
//        // add a few Strings to the list
//        varPersonLastName.add("Parker");
//        varPersonLastName.add("Baldwin");
//        varPersonLastName.add("Andrews");
//        varPersonLastName.add("Parker");
//        varPersonLastName.add("Puzey");
//        varPersonLastName.add("Rhoton");
//        varPersonLastName.add("Parker");
//
//        List<Integer> varPersonAge = new ArrayList<>();
//
//        // add a few Strings to the list
//        varPersonAge.add(41);
//        varPersonAge.add(39);
//        varPersonAge.add(17);
//        varPersonAge.add(15);
//        varPersonAge.add(13);
//        varPersonAge.add(9);
//        varPersonAge.add(6);
//
//        // the map collection example
//        // pull the list and dump it into the map for fun
//        Map<String, List<String>> map = new HashMap<String, List<String>>();
//
//        // put values into map
//        map.put("First Name", varPersonFirstName);
//
//        // iterate and display values
//        System.out.println("Fetching Keys and corresponding [Multiple] Values n");
//        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
//            String key = entry.getKey();
//            List<String> values = entry.getValue();
//            System.out.println("Key = " + key);
//            System.out.println("Values = " + values + "n");
//
//            // display these values to the TextView on the page
//
//            // find the ID of the TextView
//            TextView mapOut = (TextView) findViewById(R.id.textViewMap);
//
//            // set the text values from the variable
//            mapOut.setText("Map Collection Output:" + "\n" + "Key = " + key + "\n"+ "Values = " + values);
//        }
//
//        // the set collection example
//        int count[] = {41,39,17,15,13,9,6};
//        Set<Integer> set = new HashSet<Integer>();
//        try{
//            for(int i = 0; i < count.length; i++){
//                set.add(count[i]);
//            }
//            // insert a null value into the HashSet allows it but then crashes the app
//            set.add(null);
//
//            System.out.println(set);
//
//            TreeSet sortedSet = new TreeSet<Integer>(set);
//            System.out.println("The sorted list is:");
//            System.out.println(sortedSet);
//
//            System.out.println("The First element of the set is: "+
//                    (Integer)sortedSet.first());
//            System.out.println("The last element of the set is: "+
//                    (Integer)sortedSet.last());
//
//            // display these values to the TextView on the page
//
//            // find the ID of the TextView
//            TextView SetOut = (TextView) findViewById(R.id.textViewSet);
//
//            // set the text values from the variable
//            SetOut.setText("\nSet List Collection Output:" + "\n" + set +
//                    "\n"+ "First Child Age: " + sortedSet.first() + "\n" +
//                    "Family Size: " + sortedSet.size() + "\n" +
//                    "Oldest: " + sortedSet.last());
//        }
//        catch(Exception e){}
//
//        PersonBean aPersonList = new PersonBean();
//        String collectionOutput = "Bean seeded from Collections list:\n";
//
//        // Loop over it and save the results to the bean then get them back out
//        for (int i = 0; i < varPersonAge.size(); i++) {
//
//            for (String firstName : varPersonFirstName) {
//                // Loop over it and save the results to the bean then get them back out
//                for (String lastName : varPersonLastName) {
//
//                    // Loop over it and save the results to the bean then get them back out
//                    for (Integer age : varPersonAge) {
//
//                        aPersonList.setFirstName(varPersonFirstName.get(i));
//                        aPersonList.setLastName(varPersonLastName.get(i));
//                        aPersonList.setAge(varPersonAge.get(i));
//
//                    }
//                }
//
//            }
//
//            collectionOutput += aPersonList.getFirstName() + " " + aPersonList.getLastName() + " Age " + Integer.toString(aPersonList.getAge()) + "\n";
//
//        }
//        // post the output to the TextView
//
//        // find the ID of the TextView
//        TextView tOutputBeans = (TextView) findViewById(R.id.textViewCollectionBean);
//
//        // set the text values from the variable
//        tOutputBeans.setText(collectionOutput);
//
    }

    public void addListenerOnButton() {

        //Select a specific button to bundle it with the action you want
        button = (Button) findViewById(R.id.buttonCar);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                // CarsBean
                // create a new instance of the beans

                GarageBean myGarage = new GarageBean();


                //output += (addCar.getYear()) + " " + addCar.getColor() + " " + addCar.getMake() + " " + addCar.getModel();
                //output += myGarage.getAllMyCars().get(0).getMake();
                String output = "Garage seeded from your input...\n";
                // loop through the bean and grab all the cars that we have added to the garage
                for (int i = 0; i < 2; i ++){

                    // grab values from the input fields and pass them to the output text
                    CarsBean addCar = new CarsBean();
                    EditText editMake = (EditText) findViewById(R.id.editMake);
                    String eMake = editMake.getText().toString();

                    EditText editModel = (EditText) findViewById(R.id.editModel);
                    String eModel = editModel.getText().toString();

                    EditText editColor = (EditText) findViewById(R.id.editColor);
                    String eColor = editColor.getText().toString();

                    EditText editYear = (EditText) findViewById(R.id.editYear);
                    int eYear = Integer.parseInt(editYear.getText().toString());

                    //create a car from the input then clone a car from you your
                    addCar.setMake(eMake);
                    addCar.setModel(eModel);
                    addCar.setColor(eColor);
                    addCar.setYear(eYear);

                    myGarage.setGarageLocation("Sugar City");
                    myGarage.setGarageBay(i);

                    myGarage.setAllMyCars(addCar);

                    output += "Location: " + myGarage.getGarageLocation() + " Bay: " + myGarage.getGarageBay() + " Car:" +
                            myGarage.getAllMyCars().get(i).getYear() + " " +
                            myGarage.getAllMyCars().get(i).getColor() + " " +
                            myGarage.getAllMyCars().get(i).getMake() + " " +
                            myGarage.getAllMyCars().get(i).getModel() + "\n";

                    i ++;

                    addCar.setMake(eMake + "tatios");
                    addCar.setModel(eModel + "tation");
                    addCar.setColor(eColor + "ish");
                    addCar.setYear(eYear + 10);

                    myGarage.setGarageLocation("Rexburg");
                    myGarage.setGarageBay(i);

                    myGarage.setAllMyCars(addCar);

                    // get the values from the beans now and place them in the var for later display

                    output += "Location: " + myGarage.getGarageLocation() + " Bay: " + myGarage.getGarageBay() + " Car: " +
                                myGarage.getAllMyCars().get(i).getYear() + " " +
                                myGarage.getAllMyCars().get(i).getColor() + " " +
                                myGarage.getAllMyCars().get(i).getMake() + " " +
                                myGarage.getAllMyCars().get(i).getModel() + "\n";

                }

                // Create and break a HashMap
                //
                Map<String, List<String>> map = new HashMap<String, List<String>>();

                // create a list of firstNames and store values
                List<String> varFirstName = new ArrayList<String>();
                varFirstName.add("Stephen");
                varFirstName.add("Jodi");

                // try and break it, this just prints out null
                varFirstName.add(null);

                // create list of lastNames and store values
                List<String> varLastName = new ArrayList<String>();
                varLastName.add("Parker");
                varLastName.add("Baldwin");

                // put values into map
                map.put("First Name", varFirstName);
                map.put("Last Name", varLastName);

                // iterate and display values

                System.out.println("Fetching Keys and corresponding [Multiple] Values \n");
                String outputmap = "Fetching Keys and corresponding [Multiple] Values \n";


                for (Map.Entry<String, List<String>> entry : map.entrySet()) {

                    String key = entry.getKey();

                    List<String> values = entry.getValue();

                    outputmap += ("Key = " + key);
                    outputmap += (" Values = " + values + "\n");

                }
                // display these values to the TextView on the page

                    // find the ID of the TextView
                    TextView tOutputMap = (TextView) findViewById(R.id.textViewMap);

                    // set the text values from the variable
                    tOutputMap.setText(outputmap);

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