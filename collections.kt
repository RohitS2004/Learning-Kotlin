fun main () {
    // Read only list
    val readOnlyNames = listOf("Rohit", "Rohan", "Ayush", "Devansh");
    println(readOnlyNames);

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("square", "circle", "rectangle");
    println(shapes);

    // To prevent any unwanted modification to the mutable list we can create a read-only view for that list by assigning it to a List. This is also called as 'casting'
    val readOnlyShapes: List<String> = shapes;
    // List are ordered so we cxan use the index to access the elements
    print(readOnlyShapes[0]);
    print(readOnlyShapes.first());
    print(readOnlyShapes.last());
    print(readOnlyShapes.count()); // to get the size of the list
    print("triangle" in readOnlyShapes); // to check if the "triangle" exists in the readOnlyShapes list
    shapes.add("pentagon") // to add item to the list
    shapes.remove("pentagon") // remove item from the list



    // Read-only set 
    val readOnlyFruit = setOf("lemon", "apple", "mango", "banana");
    
    // Mutable with explicit type declaration
    val fruits: MutableSet<String> = mutableSetOf("peach", "strawberry");

    val fruitsLocked: Set<String> = fruits;
    println(fruits.count());
    fruits.add("kiwi");
    fruits.remove("kiwi");



    // Read-only map  
    val readOnlyJuiceMenu = mapOf("apple" to 100, "banana" to 5, "kiwi" to 200, "peach" to 80);
    println(readOnlyJuiceMenu);

    // Mutable and explicity type decalration map
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "banana" to 50);
    println(juiceMenu["apple"]);
    juiceMenu["Dragon Fruit"] = 500;
    juiceMenu.remove("Dragon Fruit") // To remove value from a map
    println(juiceMenu.count());
    juiceMenu.containsKey("apple") // To check if the key exists in the map or not
    print(juiceMenu.keys) // To get the List of all the keys
    print(juiceMenu.values) // To get the List of all the values
    print("apple" in juiceMenu.keys) // To check if the key "apple" exists in the map
    print(100 in juiceMenu.values) // To check if the value 100 exists in the map

}

// In programming sometimes we are required to group some piece of informartion together like store all the postive even integers from 1 to 100
// So for these purposes we have collections in Kotlin

// ? List: Ordered collection of items
/*
Lists stores the items in a ordered fashion and allows for duplicate items
To Create a read-only list use listOf() function
To Create a mutable list use mutableListOf() function

* When creating lists, kotlin can automatically infer the type of the data stored and to declare the type explicitly add the type within angled brackets after the list declaration

To get the first and the last element of a list you can use first() and last() function
These first() and last() are known as extension function or methods which are associated with every object which you can use with the object name and a period after it
*/


// ? Sets: Unique unordered collection of items
/*
Sets are unordered and allows only unique items
To Create a read-only set use setOf() function
To Create a mutable set use mutableSetOf() function

* As sets are unordered you can't access the elements using the index

To get the length of the set you can use count() function
*/


// ? Maps: Set of key-value pairs where keys are unique and map to only one value
/*
Map uses key-value pairs, each value is uniquely indentified by its key, In the map you cna have only one unique key for a value but you can have muktiple same values for different different keys

To Create a read-only map you can use mapOf() function
To Crete a mutable map you can use muatbleMapOf() function

To access a value in a map, use the indexed access operator [] with the key
* If you try to access a key, value pair that does not exists you will see a null value
* You can use indexed access operator to add new values inside the map
*/

// Each collection type can be mutable or read-only

