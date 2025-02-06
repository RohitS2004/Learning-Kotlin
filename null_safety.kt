fun lengthOfString (maybeString: String?): Int? = maybeString?.length;
// Optionally accessing the length property of the maybeString since it can be null
// You can chain these null safe calls

fun main () {
    val name: String = "John";

    // Not allowed
    // name = null;

    var nullName: String? = "Riley";
    nullName = null;

    println(name.length);

    println(lengthOfString("hello"))
    println(lengthOfString(maybeString = null));

    val nullString: String? = null;
    println(nullString?.length ?: "Null String!")

}

// In kotlin it is possible to have null value.
// Null Safety detects potential problems with null values at compile time not in run time
// By default null values are not accepted
// Using Safe calls
// Elvis operator: you can define a default value to return when a null value is encountered 
// ?: Elvis Operator