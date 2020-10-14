package com.company;

public class HashTable {

    private int length;
    private com.company.LinkedList[] array;

    public HashTable(int length) {
        this.length = length;
        this.array= new com.company.LinkedList[length];

        for (int i = 0; i < length; i++)
            array[i] = null;
    }

    /**
     * calculates the hashcode of the given string
     * it adds the ASCII value of each character, then we modulo it by the length of the array
     * @param s the string for which we will calculate the hashcode
     * @return the resulted hashcode
     */
    public int myHash(String s) {

        int sumOfAscii = 0;
        for (Character ch : s.toCharArray()) {
            sumOfAscii += ch;
        }
        return sumOfAscii % this.length;
    }

    /**
     * inserts the value into the hashtable
     * it calculates the hascode of the value, then it inserts it in the position given by the hashcode
     * if the value already exists, we won't add the value
     * @param val the value which we try to add
     */
    public void put(String val){

        int index = myHash(val);

        LinkedList items = this.array[index];

        if (items == null){
            items = new LinkedList();
            items.insert(val);
            array[index] = items;
        }
        else{
            if (items.find(val) != null)
                items.insert(val);
        }

    }

    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (array[i] != null)
                s.append(i).append(": ").append(array[i]).append("\n");
            else s.append(i).append(": ").append("\n");
        }
        return s.toString();
    }
}
