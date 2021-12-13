
import java.util.ArrayList;
import java.util.List;

//import java.util.Stack;

public class AlternatingSeries {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();

        for (int i = 1; i <= 24; i++) {
            ls.add(String.valueOf(i));
        }
        String x = "";

        while (!ls.isEmpty()) {
            //put the top to the bottom
            x = ls.remove(0);
            ls.add(x);

            System.out.println(ls.remove(0));
        }
    }
}
