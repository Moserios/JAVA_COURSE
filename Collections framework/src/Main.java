import java.util.*;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // ARRAY LIST
        System.out.println("ArrayList");
        ArrayList<String> myArrayList = new ArrayList<>(3); //create Array with 3 elements
        myArrayList.add("Value10");// add element with value
        myArrayList.add("Value21");
        myArrayList.add("Value03");
        myArrayList.add("Value14");
        myArrayList.remove(1); // remove element by index
        myArrayList.add("Value49");
        myArrayList.add("Value19");
        System.out.println(myArrayList.get(1)); // get element by index
        System.out.println(myArrayList);
        Collections.sort(myArrayList); //sort list

        System.out.println(myArrayList);
        for (String name: myArrayList){
            System.out.println(name);
        }

        // LINKED LIST
        System.out.println("LinkedList");
        System.out.println("Advantages: Dynamic size, Quick insertion and deletion");
        System.out.println("Disadvantages: High space complexity, Slow access to elements");
        System.out.println("Contains a sequence of nodes wher eeach node contains data and reference to the next node");
        System.out.println("Doesn't requre continuous memory allocation like Arrays!!! That's why this data structure is faster then ArrayList.");
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(2);
        myLinkedList.add(4);
        myLinkedList.add(-6);
        myLinkedList.add(16);
        myLinkedList.add(-32);
        myLinkedList.add(132);
        myLinkedList.add(-1132);
        myLinkedList.add(8132);
        myLinkedList.add(-58132);
        myLinkedList.add(358132);
        System.out.println(myLinkedList.get(1));
        myLinkedList.remove(1);

        System.out.println("\nUnsorted");
        for (Integer i: myLinkedList){
            System.out.println(i);
        }

        System.out.println("\nSorted");
        Collections.sort(myLinkedList);
        for (Integer i: myLinkedList){
            System.out.println(i);
        }


        // STACK CLASS
        System.out.println("\n\nSTACK CLASS - subclass of the vector class, LIFO - last in - first out");
        System.out.println("Methods for manipulation of the stack elements: " +
                "\npush - add to stack, " +
                "\npop - return top element value and remove it from stack, " +
                "\npeek - return top element value without removing it from stack, " +
                "\nisEmpty - return true/false if the stack is empty");
        Stack<Integer> myStack = new Stack<>();

        myStack.push(10);
        myStack.push(12);
        myStack.push(13);
        myStack.push(16);
        myStack.push(19);
        System.out.println("\nMY STACK: " + myStack);
        Integer poppedElement = myStack.pop();
        System.out.printf("\nPopping MY STACK element: %d", poppedElement);
        System.out.println("\nMY STACK: " + myStack);
        System.out.println("MY STACK peek element: " + myStack.peek());
        System.out.println("Is MY STACK is empty? " + myStack.isEmpty());


        // QUEUE
        System.out.println("\n\nQUEUE  - linear data structure with structure FIFO (first in first out)");
        System.out.println("Main operations: \nInqueue - add element to the end, \nDequeue - remove element from the front," +
                "\nPeek - returns first element in hte queue without removing it");
        System.out.println("Two ways of queue implementation in Java: LinkedList and PriorityQueue");
        System.out.println("\nLinkedList");
        LinkedList lQueue = new LinkedList();
        lQueue.add(10);
        lQueue.add(20);
        lQueue.add(30);
        System.out.println("LinkedList queue content: " + lQueue);
        System.out.println("Removing element from LinkedList queue: " + lQueue.remove());
        System.out.println("LinkedList queue content: " + lQueue);


        //PriorityQueue
        System.out.println("\nPriorityQueue");
        System.out.println("By adding elements with OFFER() method places a few smallest elements in the front of the queue");
        PriorityQueue pQueue = new PriorityQueue<>();
        pQueue.offer(110);
        pQueue.offer(120);
        pQueue.offer(140);
        pQueue.offer(130);
        pQueue.offer(900);
        pQueue.offer(100);
        System.out.println("PriorityList queue content: " + pQueue);
        System.out.println("Removing element from PriorityQueue: " + pQueue.poll());
        System.out.println("PriorityList queue content: " + pQueue);
        System.out.println("Removing element from PriorityQueue: " + pQueue.poll());
        System.out.println("PriorityList queue content: " + pQueue);
        System.out.println("Removing element from PriorityQueue: " + pQueue.poll());
        System.out.println("PriorityList queue content: " + pQueue);
        System.out.println("Removing element from PriorityQueue: " + pQueue.poll());
        System.out.println("PriorityList queue content: " + pQueue);
        System.out.println("Removing element from PriorityQueue: " + pQueue.poll());
        System.out.println("PriorityList queue content: " + pQueue);


        //SET Interface
        System.out.println("\n\nSET Interface");
        System.out.println("SET Interface - is used to store a collection of unique elements. " +
                "\nDuplicates are ignored. " +
                "\nNo order. " +
                "\nCould contain only one NULL value. " +
                "\nIteration via elements");

        //HASH SET
        System.out.println("\n\nHASH SET");
        System.out.println("HASH SET - implementation of the SET interface to store unique elements. Duplicates ignored.");
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("10");
        myHashSet.add("10"); // adding a duplicate is ignored
        myHashSet.add("30");
        myHashSet.add("50");
        myHashSet.add("35");
        myHashSet.add("25");
        myHashSet.add("25");
        System.out.println("myHASHSET elements: " + myHashSet);
        System.out.println("Check if myHASHSET contains element '20': " + myHashSet.contains("20"));
        System.out.println("Check if myHASHSET contains element '10': " + myHashSet.contains("10"));
        System.out.println("Remove element from myHASHSET '10': " + myHashSet.remove("10"));
        System.out.println("Check if myHASHSET contains element '10': " + myHashSet.contains("10"));
        System.out.println("myHASHSET elements: " + myHashSet);
        System.out.println("Iterate through the elements of the HashSet:");
        for (String string: myHashSet){
            System.out.println(string);
        }

        //MAP Interface
        System.out.println("\n\nMAP Interface");
        System.out.println("MAP Interface - to store key:value pair collections.");
        System.out.println("Stores key:value pairs collections where each key maps to a unique value.");
        System.out.println("Keys and Values could be any object type.");
        System.out.println("Each Key must be unique or if the same key is used the old key value will be replaced.");

        //HASHMAP Interface
        System.out.println("\n\nHASHMAP Data structure");
        System.out.println("HASHMAP Interface - to store key:value pairs, keys are always unique and values could be of any object type.");
        System.out.println("Key is used to calculate the HASH, HASH is an index of the bucket where key:value is stored. Each Bucket could contain a few key:value pairs");
        System.out.println("Methods: put(key, value), get(key), remove(key), size(), containsKey()");

        HashMap<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(10,"Ten");
        myHashMap.put(20,"Twenty");
        myHashMap.put(30,"Thirty");
        myHashMap.put(40,"Forty");
        myHashMap.put(50,"Fifty");
        myHashMap.put(60,"Sixty");
        myHashMap.put(70,"Seventy");
        myHashMap.put(80,"Eighty");
        myHashMap.put(90,"Ninety");
        myHashMap.put(99,"Ninety Nine");
        myHashMap.put(100,"Hundred");

        System.out.println("Size of the HashMap: " + myHashMap.size());
        System.out.println("Get Hash with key 30: " + myHashMap.get(30));
        System.out.println("Check is Hash contains key 99: " + myHashMap.containsKey(99));
        System.out.println("Remove the element with key 99: " + myHashMap.remove(99));
        System.out.println("Check is Hash contains key 99: " + myHashMap.containsKey(99));
        System.out.println("Size of the HashMap: " + myHashMap.size());
        System.out.println("Iterate through the hashmap:");
        for (Map.Entry<Integer, String> entry: myHashMap.entrySet()){
            //System.out.println(entry);
            System.out.println("Value for key " + entry.getKey() +  " is: " + entry.getValue());
        }



        //Iterators interface
        System.out.println("\n\nIterator interface");
        System.out.println("Used to traverse a collection of objects (LIST, SET, MAP) and check if there are more elements in collections");
        System.out.println("To use Iterator interface first get instance of it from a collection using interator() method");
        System.out.println("Methods: hasNext(), next(), remove() , etc...");
        System.out.println("Create an ArrayList with elements");
        ArrayList<String> myArrayList2 = new ArrayList<>();
        myArrayList2.add("101");
        myArrayList2.add("01");
        myArrayList2.add("201");
        myArrayList2.add("111");
        myArrayList2.add("102");
        System.out.println("String Elements in myArrayList: " + myArrayList2);
        System.out.println("Creating a new instance of the iterator interface: ");
        Iterator<String> myIterator = myArrayList2.iterator();
        System.out.println("Iterate through the values till the end with hasNext() method: ");
        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

        //Comparator interface
        System.out.println("\n\nComparator interface");
        System.out.println("Comperes two objects with methods: compare(Object obj1, Object obj2) or equals(Object element).");
        System.out.println("Provides multiple sorting sequences");

        ArrayList<Student> myArrayList3 = new ArrayList();
        myArrayList3.add(new Student("Sergey", 44));
        myArrayList3.add(new Student("Andrey", 34));
        myArrayList3.add(new Student("Matvey", 24));
        myArrayList3.add(new Student("Nikita", 18));

        System.out.println("Sorting by name:");
        Collections.sort(myArrayList3, new NameComparator());
        for (Student s: myArrayList3){
            System.out.println("Student name: " + s.name + " , age: " + s.age);
        }

        System.out.println("\nSorting by age:");
        Collections.sort(myArrayList3, new AgeComparator());
        for (Student s: myArrayList3){
            System.out.println("Student name: " + s.name + " , age: " + s.age);
        }

    }
}

class NameComparator implements Comparator{
    public int compare(Object o1, Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        int k = s1.name.compareTo(s2.name);
        System.out.println(((Student) o1).name + " " + k + " " + ((Student) o2).name);
        return s1.name.compareTo(s2.name);
    }
}

class AgeComparator implements Comparator{
    public int compare(Object o1, Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        System.out.println(((Student) o1).age + " || " + ((Student) o2).age);
        if (s1.age == s2.age) return 0;
        else if (s1.age > s2.age) return 1;
        else return -1;
    }
}

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
