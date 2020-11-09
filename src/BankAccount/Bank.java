package BankAccount;

import java.util.*;


public class Bank {
    public static void main(String[] args) throws InsufficientbalanceException {
        BankAccount b;
        b = new BankAccount();
        b.deposit();
        b.withdraw();
        Customer c = new Customer("sushma", "chopra", 13);
        ArrayList<String> Customer = new ArrayList<>();
        Customer.add("Ritika");
        System.out.println(c.getFirstName());
        System.out.println(c.getLastName());
        System.out.println(c.getNumber());
        System.out.println("ArrayList: " + Customer);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sushma");
        List<String> list = new LinkedList<>();
        list.add("Harshini");
        System.out.println(map.get(1));
        Customer c1 = new Customer("sushma", "chopra", 1);
        Customer c2 = new Customer("Sushma", "chopra", 1);
        System.out.println("c1 hashcode is: " + c1.hashCode());
        System.out.println("c2 hashcode is: " + c2.hashCode());
        System.out.println("Checking between c1 and c2:=" + c1.equals(c2));
        HashSet< Integer> hs = new HashSet<Integer>();
        hs.add(3);
        hs.add(1);
        hs.add(0);
        hs.add(2);
        hs.add(4);
        if (hs.contains(4)) {
            System.out.println("4 was found in the list");
        } else {
            System.out.println("4 was not found in the list");

        }
        Customer costumer = new Customer("Raj", "Manohar",1);
        int hashCode = Customer.hashCode();
        System.out.println(hashCode);
    }
}

