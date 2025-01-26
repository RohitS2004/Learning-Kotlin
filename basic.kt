val PI = 3.14;

fun sum (a: Int, b: Int): Int {
    return a+b;
}

fun sub (a: Int, b: Int): Int {
    return a-b;
}

fun double (a: Int): Int = a*2;

fun main () {
    println("Hello World"); // To print the value from a new line

    val name = readln(); // Used to read the user input from the terminal

    println(sum(2, 3));

    println(double(5));

    println("My name is $name");
    println("One plus Two is ${1+2}");
}

// Kotlin does Type Inference, automatically detects the type of the variable

// In Kotlin 'fun' is used to define a function
// main() is the entry point for the kotlin program
// print() and println() prints the arguments to the standard output
// 'val' is used to store the read-only data
// 'var' is used to store the mutable type of data (data whose value can be changed in the future
// you can declare the variables outside the main() function, these types of variables are called 'top level'
// Recommended: use read-only variables: val, use mutable variables only when necessary
// Just like in Javascript we have Template Literals to print out some variable data inside of a string, we have String Template in Kotlin to print the data stored in a variable, use curly braces if not doing any calculation, and user curly braces {} when you want to do any calculation inside.


