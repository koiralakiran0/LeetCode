import java.util.ArrayList;

public class MyHashSet {
    ArrayList<Integer> arrayList;
    /** Initialize your data structure here. */
    public MyHashSet() {
        arrayList = new ArrayList<>();
    }
    
    public void add(int key) {
        arrayList.add(key);
    }
    
    public void remove(int key) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == key) arrayList.remove(i);
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        for (int i : arrayList) {
            if (i == key) return true;
        }
        return false;
    }
}