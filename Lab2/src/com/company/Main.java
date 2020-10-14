package com.company;

public class Main {

    public static void main(String[] args) {
        HashTable table = new HashTable(128);
        table.put("ceva");
        table.put("ecva");
        table.put("0");
        table.put("29");
        table.put("76");
        table.put("ceva");
        table.put("altceva");
        table.put("valoare");
        table.put("valoare");
        table.put("0");
        System.out.println(table);
    }
}
