/*Implement Hash Table using java.*/

package Day085;

import java.util.ArrayList;

class Node {
    String key;
    int value;
    Node next;

    Node(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class HashTable {
	private int size = 7;
    private Node[] dataMap;

    //Constructor for initialize the array.
    public HashTable() {
        dataMap = new Node[size];
    }

    //Mehtod for print the hash table.
    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }
  
    //Method for hashing.
    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    //Method for set the nodes.
    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            if (temp.key == key) {
                temp.value += value;
                return;
            }
            while (temp.next != null) {
                temp = temp.next;
                if (temp.key == key) {
                    temp.value += value;
                    return;
                }
            }
            temp.next = newNode;
        }
    }

    //Method for get the nodes.
    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    //Mehtod to show the key values.
    public ArrayList<String> keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

	public static void main(String[] args) {

		HashTable HT = new HashTable();
		
		HT.set("paint", 20);
		HT.set("bolts", 40);
		HT.set("nails", 100);
		HT.set("title", 50);
		HT.set("lumber", 80);
		
		HT.printTable();
		
		System.out.println("\n" + HT.keys());
	}

}


//------------ Test Cases -----------
//TestCase1: 
/*0:
   {title= 50}
1:
2:
   {paint= 20}
3:
4:
   {bolts= 40}
5:
6:
   {nails= 100}
   {lumber= 80}

[title, paint, bolts, nails, lumber]
*/