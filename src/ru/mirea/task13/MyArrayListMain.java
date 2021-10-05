package ru.mirea.task13;

public class MyArrayListMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        Object[] array = list.toArray();
        for (Object elem: array) {
            System.out.println((int) elem);
        }
        list.remove(new Integer(1));
        System.out.println(list.contains(1));
        for (int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i));
        }
    }
}
