import java.util.*;

public class Exercise12
{
    public static void main(String[] args)
    {
        //arraylist and filling of list with elements
        List<String> list = new ArrayList<>();
        list.add("Me");
        list.add("Him");
        list.add("Her");
        list.add("Me");
        list.add("Him");
        list.add("Him");
        list.add("me");
        list.add("me");

        //initialized class and print of method call
        Exercise12 exercise12 = new Exercise12();
        System.out.println(exercise12.contains3(list));
    }

    //method signature. takes list of strings as parameter
    public boolean contains3(List<String> list)
    {
        //map to store elements of list in
        Map<Integer, String> map = new TreeMap<>();

        //for loop to fill map with integer keys and string values
        for(int i = 0; i < list.size(); i++)
        {
            map.put(i, list.get(i));
        }

        //for loop for testing each specific value of the map
        for(int i = 0; i < map.size(); i++)
        {
            //count variable to store amount of times a value appears in map
            int count = 0;

            //variable used store value associated with key i in map
            String test = map.get(i);

            //for loop for testing whether test variable is equal to index a of list
            for(int a = 0; a < map.size(); a++)
            {
                //if true, increment count to show that value of map appears in list
                if(test.equalsIgnoreCase(list.get(a)))
                {
                    count++;

                    //if count ever reaches 3 or above, return true
                    if(count >= 3)
                    {
                        System.out.println("The string: '" + test + "', occurs " + count + " or more times in the map");
                        return true;
                    }
                }


            }
        }

        //if count never reaches 3 or above, return false
        return false;

    }
}
