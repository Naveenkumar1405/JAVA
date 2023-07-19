import java.util.HashMap;

HashMap<String, Integer> hashMap = new HashMap<>();

// Adding key-value pairs to the hash table
hashMap.put("John", 25);
hashMap.put("Alice", 30);
hashMap.put("Bob", 35);

// Retrieving values using keys
int age = hashMap.get("Alice");
System.out.println(age); // Output: 30

// Checking if a key exists
boolean containsKey = hashMap.containsKey("John");
System.out.println(containsKey); // Output: true

import java.util.HashMap;
import java.util.Map;

class HashTable {
    private Map<String, Integer> hashMap;

    HashTable() {
        hashMap = new HashMap<>();
    }

    public void put(String key, int value) {
        hashMap.put(key, value);
    }

    public int get(String key) {
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        }
        throw new IllegalArgumentException("Key not found");
    }

    public boolean containsKey(String key) {
        return hashMap.containsKey(key);
    }
}
