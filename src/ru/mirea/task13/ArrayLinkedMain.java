package ru.mirea.task13;

import java.util.*;

public class ArrayLinkedMain {

    private static final int LIST_SIZE = 1_000_000;
    private static final int SEED = 47;

    public static void main(String[] args) {
        testPushback();
        testRandomInsert();
        testRandomRemove();
        testRemoveIterator();
    }

    private static void testPushback() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        fulfillList(arrayList, LIST_SIZE);
        long endTime = System.currentTimeMillis();
        System.out.println("Array list pushback 10^6 elements: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        fulfillList(linkedList, LIST_SIZE);
        endTime = System.currentTimeMillis();
        System.out.println("Linked list pushback 10^6 elements: " + (endTime - startTime));
    }

    private static void fulfillList(List<Integer> list, int size) {
        for (int i = 0; i < size; ++i) {
            list.add(i);
        }
    }

    private static void testRandomInsert() {
        Random random = new Random(SEED);
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < LIST_SIZE / 10; ++i) {
            arrayList.add(random.nextInt(arrayList.size()), i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Array list random insertion 10^5 elements: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 1; i < LIST_SIZE / 10; ++i) {
            linkedList.add(random.nextInt(linkedList.size()), i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Linked list random insertion 10^5 elements: " + (endTime - startTime));
    }

    private static void testRemoveIterator() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        fulfillList(arrayList, LIST_SIZE * 20);
        fulfillList(linkedList, LIST_SIZE * 20);
        Iterator<Integer> itArray = arrayList.listIterator();
        Iterator<Integer> itLinked = linkedList.listIterator();
        long startTime = System.currentTimeMillis();
        while (itArray.hasNext()) {
            if (itArray.next() == 1) {
                itArray.remove();
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Array list random remove first element: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        while (itLinked.hasNext()) {
            if (itLinked.next() == 1) {
                itLinked.remove();
                break;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Linked list remove first element: " + (endTime - startTime));
    }

    private static void testRandomRemove() {
        Random random = new Random(SEED);
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        fulfillList(arrayList, LIST_SIZE);
        fulfillList(linkedList, LIST_SIZE);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < LIST_SIZE / 100; ++i) {
            arrayList.remove(random.nextInt(arrayList.size() - 1));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Array list random remove 10^4 elements: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 1; i < LIST_SIZE / 100; ++i) {
            linkedList.remove(random.nextInt(linkedList.size() - 1));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Linked list random remove 10^4 elements: " + (endTime - startTime));
    }
}
