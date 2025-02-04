fun main () {
    val names = listOf("rohit", "rohan", "devansh");

    for (name in names) {
        println("Name is: $name");
    }

    var cakesEaten = 0;

    while (cakesEaten < 3) {
        println("Eat cake");
        cakesEaten++;
    }


    // Create a Fizz Buzz 
    // If the number is divisible 3 and 5 then print fizzbuzz
    // If the number is only divisible by 3 then print fizz
    // If the number is onlye divisible by 5 then print buzz

    var num = 1;

    while (num <= 100) {
        when {
            num % 15 == 0 -> println("fizzbuzz");
            num % 3 == 0 -> println("fizz");
            num % 5 == 0 -> println("buzz");
        }
        num++;
    }

}

// Ranges: 1..4 (to range from 1 to 4, includes the end value also)
// 1..<4 (1,2, 3, does not include the end value)
// 4 downTo 1 (4, 3, 2, 1, from 4 to 1 all inclusive)
// 1..5 step 2 (ranges from 1 to 5 with a step of 2 at each step)
// we can also do the same with Char ranges a..z
// z downTo a step 2
// We can iterate over collections

// do-while loop will run at least once even if the condition is not true