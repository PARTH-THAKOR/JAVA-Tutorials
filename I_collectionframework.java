// COLLECTION FRAMEWORKS

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class I_collectionframework {
    public static void main(String[] args) {

        // ArrayList Object
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        // ArrayList Methods
        arrayList.add(26);
        arrayList2.add(66);
        arrayList.addAll(arrayList2);
        arrayList.remove(0);
        arrayList.add(0);

        // ArrayList Object Printing
        System.out.println(arrayList.toString());

        // LinkedList Object
        LinkedList<Integer> linkedList = new LinkedList<>();

        // LinkedList Methods
        linkedList.add(44);
        linkedList.add(55);
        linkedList.set(0, 66);
        linkedList.remove(0);

        // LinkedList Object Printing
        System.out.println(linkedList.toString());

        // ArrayDeque Object
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // ArrayDeque Methods
        arrayDeque.add(55555);
        arrayDeque.add(45454);
        arrayDeque.remove(0);
        arrayDeque.addFirst(34);

        // ArrayDeque Object Printing
        System.out.println(arrayDeque.toString());

        // HashSet Object
        HashSet<Integer> hashSet = new HashSet<>();

        // HashSet Methods
        hashSet.add(555);
        hashSet.add(5656);
        hashSet.remove(555);

        // HashSet Object Printing
        System.out.println(hashSet.toString());

    }
}
