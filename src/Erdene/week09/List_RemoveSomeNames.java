package Erdene.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveSomeNames {

    /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed
     */

    public static void List_RemoveNames(String... names) {

        //Creating List of String to store given series of names
        List<String> listOfName = new ArrayList<>();
        listOfName.addAll(Arrays.asList(names));

        System.out.println("listOfName = " + listOfName);

        //Checking if list of String is not empty and using removeIf method to remove ahmed
        if(listOfName != null) {
            listOfName.removeIf(p -> p.equalsIgnoreCase("ahmed"));
        }

        System.out.println("listOfName = " + listOfName);
    }



    public static void main(String[] args) {
        List_RemoveNames("Ahmed", "Larry", "AhMed", "George");
    }


}
