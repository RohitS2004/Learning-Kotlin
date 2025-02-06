class Shape (val width: Int, val height: Int) {
    var color: String = "";

    fun printColor () {
        println(color);
    }

}

data class shapeData (val width: Int, val height: Int)

fun main () {
    val squareShape = Shape(10, 10);

    println(squareShape.width);

    squareShape.color = "red";

    squareShape.printColor();

    val squareShapeData = shapeData(10, 10);
    println(squareShapeData);

    println(squareShapeData.equals(squareShape))
    
}

// The properties defined in the () paranthesis are called as class headers
// Just like the function parameters, class properties can also have default values
// By default kotlin automatically generates the constructor of the class with the parameters in the () paranthesis
// Kotlin classes can have multiple constructors
// To access the properties of the instance of a class you have to specify the class property or the variable that you want to access with a . 
// You can declare the properties of a class without using the val keyword, but the properties will not be accessible after the instance of the class is created
// we can even change the value of the properties of the class using the assignment operator


// * Data class in Kotlin
// Data classes are particularly useful for storing data. Data classes have same functionality as normal class
// But they come with some additional member functions
// These member function allows you toeasily print the instance of the class, compare instances, copy instances and many more
