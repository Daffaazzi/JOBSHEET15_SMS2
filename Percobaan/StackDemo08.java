package Percobaan;

import java.util.Stack;

public class StackDemo08 {
    public static void main(String[] args) {

        // Langkah 2 & 3: Buat objek Book dan push ke Stack
        Book08 book1 = new Book08("1234", "Dasar Pemrograman");
        Book08 book2 = new Book08("7145", "Hafalah Shalat Delisa");
        Book08 book3 = new Book08("3562", "Muhammad Al-Fatih");

        Stack<Book08> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        // Langkah 4: peek()
        Book08 temp = books.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }

        // pop()
        Book08 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        // Langkah 6: Looping cetak stack
        for (Book08 book : books) {
            System.out.println(book.toString());
        }

        // Langkah 7: Print langsung
        System.out.println(books);

        // Langkah 8: search()
        int pos = books.search(book1);
        System.out.println("Posisi book1 di stack: " + pos);
    }
}