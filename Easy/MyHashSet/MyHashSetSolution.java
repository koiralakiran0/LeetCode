import java.util.HashSet;

public class MyHashSetSolution {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        boolean x = myHashSet.contains(1); // return True
        x = myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        x = myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        x = myHashSet.contains(2); // return False, (already removed)
    }
}
