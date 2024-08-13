package week5;

public class HMaps {
    public static void main(String[] args) {
        // Create a HashMap
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        System.out.println("The value of 'one' is " + map.get("one"));
        
        // You can also check if a key is in the HashMap
        if (map.containsKey("two")) {
            System.out.println("'two' is in the HashMap");
        } else {
            System.out.println("'two' is not in the HashMap");
        }
        
        // You can remove a key-value pair from the HashMap
        map.remove("four");
        if (!map.containsKey("four")) {
            System.out.println("'four' has been removed from the HashMap");
        }

        // iterate in maps
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            }
            //using for loop to iterate an array and give key to form a map and at end print the map
            String[] keys = {"one", "two", "three", "four", "five"};
            Integer[] values = {1, 2, 3, 4, 5};
            java.util.HashMap<String, Integer> map1 = new java.util.HashMap<>();
            for (int i = 0; i < keys.length; i++) {
                map1.put(keys[i], values[i]);
                }
                System.out.println(map1);
                
                
                
                
                
            
                
                }

                
    
            }
            
    


        
        
