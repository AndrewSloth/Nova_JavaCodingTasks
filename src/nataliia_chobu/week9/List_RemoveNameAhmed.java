package nataliia_chobu.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNameAhmed {
    //Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
    //Write a java operation to remove all the names named Ahmed
    public static void main(String[] args) {
        System.out.println("removeIf = "+removeName(new ArrayList<String>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron")),"Ahmed"));

        System.out.println("removeIf = "+removeName(new ArrayList<String>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron")),"John"));
        System.out.println("Loop = "+removeNameLoop(new ArrayList<String>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron","Ahmed","Ahmed")),"Ahmed"));
    }

    public static List<String> removeName(ArrayList<String>listOfNames,String name){
      listOfNames.removeIf(t->t.equals(name));

      return listOfNames;
    }

    public static List<String> removeNameLoop(ArrayList<String> listOfNames,String name){
       for(int i=listOfNames.size()-1;i>=0;i--){
          if( listOfNames.get(i).equals(name)){
              listOfNames.remove(i);
          }
       }
       return listOfNames;
    }

}
