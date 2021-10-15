package com.company;

import java.util.*;

public class MyCollectionsUtil<T> {
    //    1. Write a Java program to get the number of elements in a hash set.
    public int numberOfElements(HashSet<T> obj) {
        return obj.size();
    }

    // 2. Write a Java program to test a hash set is empty or not.
    public boolean isEmpty(HashSet<T> obj) {
        return obj.size() == 0;
    }

    //3. Write a Java program to clone a hash set to another hash set.
    public HashSet<T> cloneSet(HashSet<T> obj) {
        HashSet<T> newHashSet = new HashSet<>();
        newHashSet = (HashSet<T>) obj.clone();
        return newHashSet;
        //  return newHashSet;;
    }

    //4. Write a Java program to convert a hash set to a tree set.
    public TreeSet<T> convertHashSetToTree(HashSet<T> obj) {
        TreeSet<T> treeSet = new TreeSet<>(obj);
        return treeSet;
    }

    //5. Write a Java program to convert a hash set to a List/ArrayList.
    public ArrayList<T> convertHashSetToArrayList(HashSet<T> obj) {
        ArrayList<T> array = new ArrayList<>(obj);
        return array;
    }

    //6. Write a Java program to compare two hash set.
    public boolean compareTwoSets(HashSet<T> obj1, HashSet<T> obj2) {
        return obj1.containsAll(obj2) && obj2.containsAll(obj1);
    }

    // 7. Write a Java program to remove all of the elements from a hash set.
    public void removeAll(HashSet<T> obj) {
        obj.removeAll(obj);
    }

    // 8. Write a Java program to iterate through all elements in a tree set.
    public void iterate(TreeSet<T> obj) {
        Iterator<T> i = obj.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    // 9. Write a Java program to get the first and last elements in a tree set.
    public TreeSet<T> firstLastElement(TreeSet<T> obj) {
        TreeSet<T> treeSet = new TreeSet<T>();
        treeSet.add(obj.last());
        treeSet.add(obj.first());
        return treeSet;
    }

    //10. Write a Java program to clone a tree set list to another tree set.
    public TreeSet<T> cloneSet(TreeSet<T> obj) {
        TreeSet<T> newTree = (TreeSet<T>) obj.clone();
        return newTree;
    }

    // 11. Write a Java program to get the number of elements in a tree set.
    public int numberOfElements(TreeSet<T> obj) {
        return obj.size();
    }

    // 12. Write a Java program to compare two tree sets.
    public boolean compareTwoSets(TreeSet<T> obj1, TreeSet<T> obj2) {
        return obj1.containsAll(obj2) && obj2.containsAll(obj1);
    }

    // 13. Write a Java program to find the numbers less than 7 in a tree set.
    public Integer lessThan7(TreeSet<Integer> obj) {
        return lessThan(obj, 7);
    }

    public Integer lessThan(TreeSet<Integer> obj, int number) {
        return obj.floor(number);
    }

    // 14. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
    public Integer greaterThan(TreeSet<Integer> obj, int number) {
        return obj.ceiling(number);
    }

    // 15. Write a Java program to remove a given element from a tree set.
    public void remove(TreeSet<Integer> obj, int number) {
        obj.remove(number);
    }

    public void remove(TreeSet<T> obj, T element) {
        obj.remove(element);
    }

    // 16. Write a Java program to iterate through all elements in priority queue.

    public void iterate(PriorityQueue<T> obj) {
        Iterator<T> i = obj.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }


    // 17. Write a Java program to compare two priority queues.
    public boolean compareTwoSets(PriorityQueue<T> obj1, PriorityQueue<T> obj2) {
        // System.out.println("PriorityQueue -compareTwoSets " );
        if (obj1.containsAll(obj2) && obj2.containsAll(obj1)) {
            System.out.println("PriorityQueue -compareTwoSets  true");
            return true;
        }
        System.out.println("PriorityQueue -compareTwoSets  false");
        return false;
    }

    //18.A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left.
//  Given an integer,d, rotate the array that many steps left and return the result.
    public void leftRotate(int[] obj, int n) {
        int temp;
        int i, j, s = obj.length;

        for (j = 0; j < n; j++) {
            temp = obj[0];
            for (i = 0; i < s - 1; i++)
                obj[i] = obj[i + 1];
            obj[s - 1] = temp;

        }
    }
}
