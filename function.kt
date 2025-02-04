fun greetUser () {
    println("Hello User");
}

fun addValue (x: Int, y: Int): Int {
    println(x + y);
    return x + y;

}

fun printName (name: String, message: String) {
    println("$name, $message");

    return Unit;
}

fun printNameWithDefault (name: String, message: String = "Good morning") {
    println("$name, $message");
} 

fun smallAddValues (x: Int, y: Int) = x + y;

val registeredUsers = mutableListOf("rohit", "rohan", "devansh");
val registeredEmails = mutableListOf("rohit@gmail.com", "rohan@gmail.com", "devansh@gmail.com");

fun registerUser (name: String, email: String): String {
    if (name in registeredUsers) {
        return "Username already taken"
    }

    if (email in registeredEmails) {
        return "Email already taken"
    }

    registeredUsers.add(name);
    registeredEmails.add(email);

    return "User registered successfully!"

}

fun toSeconds (time: String): (Int) -> Int = when (time) {
    "seconds" -> { value -> value }
    "minutes" -> { value -> value * 60 }
    "hour" -> { value -> value * 60 * 60 }
    else -> { value -> value }
}


fun main () {
    greetUser();
    val result = addValue(10, 20);
    println(result);

    printName(message = "Good morning", name = "Rohit");
    printNameWithDefault(name = "Rohan"); 

    smallAddValues(10, 90)

    println(registerUser("rohit", "rohit@gmail.com"))
    println(registerUser("ayush", "ayush@gmail.com"));

    val upperCaseString: (String) -> String = { text: String -> text.uppercase() }
    // lambda Function type 

    println(upperCaseString("sigma"));


    val numList = listOf(1, 2, 3, 4, 5, 6, -1, -2, -3, -4);
    val positives = numList.filter({ num -> num > 0 })
    val isNegative = { num: Int -> num < 0 };
    val negatives = numList.filter(isNegative);

    println(positives);
    println(negatives);

    val timeInMinutes = listOf(2, 10, 20, 15);
    // 120 + 600 + 1200 + 900 => 2820
    val min2Sec = toSeconds("minutes")
    // what toSeconds is doing is that it is taking the time params which is of type String and then checking with when which of the condition matches the time and return a lambda expression based on that
    // the toSeconds function also has the function return type a function only which is taking a Int type param and return a Int type value
    val totalTimeInSeconds = timeInMinutes.map(min2Sec).sum();
    println(totalTimeInSeconds);

    
}

// * Functions without return value, if a function does not return anything then the return will be a Unit, you do not have to specifically define the Unit return type

// * Single expression function, you can remove the curly braces when you only have a single line of function body and use the '=' operator, the kotlin will automatically infer the function type

// * Lambda Expression, These are used to write even more concise functions than the single expression functions
// * If you define a lambda without a parameters then there is no need to write the ->