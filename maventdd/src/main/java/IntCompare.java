import java.util.Comparator;

public class IntCompare implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b-a ;
    }
}
