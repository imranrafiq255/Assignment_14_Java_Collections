import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(30);
        ArrayList<Object> arrayList1 = new ArrayList<>();
        arrayList1.add("Imran");
        arrayList1.add("ABC");
        arrayList1.add(10.00);
        arrayList1.add(true);
        arrayList1.remove("Imran");
        arrayList1.set(2,500);
        Iterator arrayListIterator = arrayList1.listIterator();
        System.out.println("Array List");
        while(arrayListIterator.hasNext()){
            System.out.println(arrayListIterator.next());
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(400);
        linkedList.add(20);
        linkedList.add(500);
        linkedList.remove();
        linkedList.set(2, 0);
        System.out.println("Linked List");
        for (Integer i : linkedList){
            System.out.println(i);
        }
        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("Hashset");
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");
        ArrayList<String> hashArrayList = new ArrayList<String>();
        hashArrayList.add("A");
        hashArrayList.add("B");
        hashSet.removeAll(hashArrayList);
        for (String i : hashSet){
            System.out.println(i);
        }
        // Tree Set
        System.out.println("Tree set");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Imran");
        treeSet.add("1");
        treeSet.add("A");
        treeSet.add("B");
        for (String i : treeSet){
            System.out.println(i); // prints in sorting order
        }
        // Hashmap
        System.out.println("Hashmap");
        HashMap<Integer, String> hashMap= new HashMap<>();
        hashMap.put(1, "Imran Malik");
        hashMap.put(2, "John Smith");
        hashMap.put(3, "John Kennedy");
        hashMap.put(4, "Adolf Hitler");
        hashMap.put(5, "Winston Churchill");
        hashMap.remove(3);
        hashMap.replace(2, "Imran Khan");
        hashMap.forEach((Integer a, String b) ->{
            System.out.println(b);
        });
        // HashTable
        System.out.println("Hashtable");
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        hashtable.put("Four", 4);
        hashtable.forEach((String a, Integer b) -> {
            System.out.println(b);
        });
        // another way to print
        System.out.println(hashtable);
        // Tree map
        System.out.println("Tree map");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "X");
        treeMap.put(2, "A");
        treeMap.put(3, "p");
        treeMap.put(4,"1");
        treeMap.put(5, "!");
        treeMap.forEach((Integer key, String value) -> {
            System.out.println("Key : " + key + " and Value is: " + value);
        });
        // Stack
        System.out.println("Stack");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Value at peak: " + stack.peek());
        stack.pop();
        for (Integer i : stack){
            System.out.println(i);
        }
        // Queue
        System.out.println("Queue");
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println(queue.peek());
        queue.remove();
        for (Integer i : queue){
            System.out.println(i);
        }
        //Vector
        System.out.println("Vector");
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.forEach((Integer i) -> {
            System.out.println(i);
        });
        // Set
        System.out.println("Set");
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        for (Integer i : set){
            System.out.println(i);
        }
    }
}
