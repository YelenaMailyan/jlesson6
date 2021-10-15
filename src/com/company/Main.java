package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashSet<String> hSet1 = new HashSet<String>();
        HashSet<String> hSet2 = new HashSet<String>();
        TreeSet<String> tree = new TreeSet<>();
        TreeSet<String> newTree = new TreeSet<>();
        TreeSet<Integer> intTree = new TreeSet<>();
        PriorityQueue<String> pQueue = new PriorityQueue<>();
        PriorityQueue<String> pQueue2 = new PriorityQueue<>();
        MyCollectionsUtil<String> obj = new MyCollectionsUtil<String>();

        System.out.println("-----------1 and 2--------");
        System.out.println(obj.numberOfElements(hSet1));
        System.out.println(obj.isEmpty(hSet1));
        hSet1.add("Anna");
        System.out.println(obj.numberOfElements(hSet1));
        System.out.println(obj.isEmpty(hSet1));

        System.out.println("-----------3----------");
        hSet2 = obj.cloneSet(hSet1);
        System.out.println(hSet2);

        System.out.println("-----------4----------");
        hSet1.add("Merry");
        hSet1.add("Anna2");
        System.out.println(hSet1);

        System.out.println(hSet1);

        System.out.println("-----------5----------");
        hSet2.add("Mika");
        hSet2.add("Eva");

        ArrayList<String> array = new ArrayList<>();
        array = obj.convertHashSetToArrayList(hSet2);
        array.add("Mika");
        System.out.println(array);

        System.out.println("-----------6----------");
        System.out.println(obj.compareTwoSets(hSet1, hSet2));
        System.out.println(obj.compareTwoSets(hSet2, hSet2));

        System.out.println("-----------7----------");
        obj.removeAll(hSet2);
        System.out.println(hSet2);

        System.out.println("-----------9----------");
        tree.add("Levon");
        tree.add("Aram");
        tree.add("Adam");
        tree.add("Arame");
        tree.add("Ada");
        System.out.println(obj.firstLastElement(tree));

        System.out.println("-----------8----------");
        obj.iterate(tree);

        System.out.println("-----------10----------");
        newTree = obj.cloneSet(tree);
        System.out.println(newTree);

        System.out.println("-----------11----------");
        System.out.println(obj.numberOfElements(newTree));

        System.out.println("-----------12----------");
        System.out.println(obj.compareTwoSets(tree, newTree));
        tree.add("Adana");
        System.out.println(obj.compareTwoSets(tree, newTree));

        System.out.println("-----------13----------");
        System.out.println(obj.lessThan7(intTree));
        intTree.add(4);
        intTree.add(17);
        intTree.add(6);
        intTree.add(9);
        System.out.println(obj.lessThan7(intTree));

        System.out.println("-----------14----------");
        System.out.println(obj.greaterThan(intTree, 7));

        System.out.println("-----------15----------");
        System.out.println(tree);
        System.out.println(intTree);
        obj.remove(tree, "Levon");
        obj.remove(intTree, 6);
        System.out.println(tree);
        System.out.println(intTree);


        System.out.println("-----------17----------");
        pQueue.add("Lena");
        pQueue.add("Ani");
        pQueue.add("Inna");
        pQueue2.add("Levon");
        pQueue2.add("Aram");
        pQueue2.add("Adam");
        System.out.println(obj.compareTwoSets(pQueue, pQueue2));
        System.out.println(obj.compareTwoSets(pQueue, pQueue));

        System.out.println("-----------16----------");
        obj.iterate(pQueue);
        obj.iterate(pQueue2);

        System.out.println("-----------18----------");
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        obj.leftRotate(arr, 4);
        System.out.println(Arrays.toString(arr));
        obj.leftRotate(arr, 1);
        System.out.println(Arrays.toString(arr));

    }
}
