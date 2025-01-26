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

*/

// Each collection type can be mutable or read-only

