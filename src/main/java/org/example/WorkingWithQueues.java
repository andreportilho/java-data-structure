package org.example;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.stream.Collectors;

public class WorkingWithQueues {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        linkedList.addFirst(new Person("Ali", 18));

        for (Person person : linkedList) {
            System.out.println(person);
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        ListIterator<Person> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println();
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    private static void queue() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    record Person(String nome, int age) {}
}
