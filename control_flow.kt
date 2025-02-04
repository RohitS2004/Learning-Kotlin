import kotlin.random.Random; // importing the random package 

fun main () {
    val age = 18;
    if (age >= 18) {
        println("Adult");
    }
    else {
        println("Not Adult");
    }

    when (age) {
        18 -> println("Adult");
        else -> println("Not Adult");
    }

    val result = when (age) {
        18 -> "Adult";
        else -> "Not adult";
    }

    println(result);

    val trafficLightState = "green";

    val trafficStatus = when {
        trafficLightState == "green" -> "You can go";
        trafficLightState == "red" -> "you are not allowed to go";
        trafficLightState == "yellow" -> "please wait here";
        else -> "Invalid color";
    }

    println(trafficStatus);

    val firstNumber = Random.nextInt(6); // generate random number from 0 to 6
    val secondNumber = Random.nextInt(6);

    println(firstNumber);
    println(secondNumber);

    val result2 = when {
        firstNumber == secondNumber -> "You win :)";
        else -> "You lose :(";
    }
    
    println(result2);

    val option = "A";

    println(
        when (option) {
            "A" -> "Yes";
            "B" -> "No";
            "X" -> "Menu";
            "Y" -> "Nothing";
            else -> "There is no such button";
        }
    )
}

// Conditionals in Kotlin 
// If and When 
// When is preferred, makes the code easire, makes it easier to add another branch, leads to fewer mistakes in code
