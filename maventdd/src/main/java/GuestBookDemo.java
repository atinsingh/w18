/*

1 . Create a guestbook program,
2. run in intractive mode with following menu

    1. To add name
    2. to print all name
    3. to remove name
    4. exit
 */

import java.util.*;

public class GuestBookDemo {
    public static void main(String[] args) {
        List<String> names  = new ArrayList<>();
        names.add("Atin");
        names.add("Kaushik");
        names.add("Vivek");
        names.add("Mandeep");


        System.out.println(names);

        List<String> guests = Arrays.asList("John", "Jean", "Adam");

        names.addAll(2,guests);

        //names.removeAll(Arrays.asList("Atin", "Mandeep"));

        if(names.contains("Atin")){
            System.out.println("Atin is in the list");
        }

        System.out.println(names);

        names.sort(( a,  b )->  a.length()-b.length());
        System.out.println(names);
        //names.retainAll(Arrays.asList("Atin", "Mandeep"));

        // for each
        for ( String name : names    ){
            System.out.println(name);
        }

        List<Integer> goldenNumbers = new ArrayList<>();
        goldenNumbers.add(3);
        goldenNumbers.add(8);
        goldenNumbers.add(7);
        goldenNumbers.add(5);


//        for (Integer num : goldenNumbers ){
//            System.out.println(num);
//            // when foreach is running your list is immutable
//        }


        Iterator<Integer> iterator = goldenNumbers.iterator();

//        while (iterator.hasNext()){
//            Integer elm = iterator.next();
//            if(elm==7){
//                iterator.remove();
//            }
//
//
//        }
        System.out.println(goldenNumbers);
        goldenNumbers.sort(new IntCompare());

        System.out.println(goldenNumbers);

    }
}
