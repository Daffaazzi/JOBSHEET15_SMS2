package Percobaan;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList08 {
    public static void main(String[] args) {

        // Langkah 2 & 3: Buat ArrayList dan tambahkan customer
        ArrayList<Customer08> customers = new ArrayList<>(2);

        Customer08 customer1 = new Customer08(1, "Zakia");
        Customer08 customer2 = new Customer08(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        for (Customer08 cust : customers) {
            System.out.println(cust.toString());
        }

        // Langkah 4 & 5: Tambah object baru melebihi kapasitas
        customers.add(new Customer08(4, "Cica"));

        for (Customer08 cust : customers) {
            System.out.println(cust.toString());
        }

        // Langkah 6 & 7: Tambah object pada index tertentu
        customers.add(2, new Customer08(100, "Rosa"));

        for (Customer08 cust : customers) {
            System.out.println(cust.toString());
        }

        // Langkah 8: indexOf()
        System.out.println(customers.indexOf(customer2));

        for (Customer08 cust : customers) {
            System.out.println(cust.toString());
        }

        // Langkah 9: get()
        Customer08 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        for (Customer08 cust : customers) {
            System.out.println(cust.toString());
        }

       // Sorting String/primitive
ArrayList<String> daftarSiswa = new ArrayList<>();
daftarSiswa.add("Zainab");
daftarSiswa.add("Andi");
daftarSiswa.add("Rara");
Collections.sort(daftarSiswa);
System.out.println(daftarSiswa);

// Sorting object berdasarkan name
customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
System.out.println(customers);
    }
}