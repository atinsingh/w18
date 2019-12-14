import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kaushik");
        list.add("Swati");
        list.add("Gauthami");
        list.add("Vivek");
        list.add("Swati");

        Set<String>  names =  new HashSet<>();

        names.add("Kaushik");
        names.add("Swati");
        names.add("Gauthami");
        names.add("Vivek");
        names.add("Swati");
        System.out.println(list);
        System.out.println(names);
        for (String name: names){
            System.out.println(name);
        }

    }
}
