fun main() {
    val celcius = 26.4f
    println("Celcius: $celcius, Fahrenheit: ${convertToFahrenhiet(celcius)}")
    
    println("Perimeter of rectangle: ${calculatePerimeterOfRectangle(5, 10)}")
    
    println("Factorial of 6: ${calculateFactorial(6)}")
    
    val word = "Sia"
    println("Count of 'A' characters in $word: ${characterCounter(word, 'a')}")
    
    val angles = 4
    println("Sum of inner angles: ${calculateSumOfInnerAngles(angles)}")
    
    val days = 24
    println("Salary of working for $days days: ${calculateSalary(days)}")
    
    val usage = 10
    println("Fee of using $usage GB: ${calculateInternetFee(usage)}")
}

fun convertToFahrenhiet(celcius: Float) : Float {
    return (celcius * 1.8f) + 32
}

fun calculatePerimeterOfRectangle(left: Int, top: Int) : Int {
    return (left + top) * 2
}

fun calculateFactorial(number: Int) : Int {
    var counter = number
    var result = 1

    while(counter > 1) {
        result = result * counter
        counter--
    }
    
    return result
}

fun characterCounter(word: String, targetCharacter: Char) : Int {
    var counter = 0
    
    for(character in word) {
        if(character.uppercaseChar() == targetCharacter.uppercaseChar()) {
            counter++
        }
    }
    
    return counter
}

fun calculateSumOfInnerAngles(angles: Int) : Int {
    return (angles - 2) * 180
}

fun calculateSalary(days: Int) : Int {
    val limit = 160
    val normalHourly = 10
    val shiftHourly = 20
    
    val totalHour = days * 8
    
    var salary = 0
	
    if(totalHour <= limit) {
        salary = totalHour * normalHourly
    }else{
        salary = (normalHourly * limit) + (shiftHourly * (totalHour - limit))
    }
	
    return salary
}

fun calculateInternetFee(usage: Int) : Int {
    val limit = 50
    val normalFeePerGB = 2
    val extraFeePerGB = 4
    
    var fee = 0
    
    if(usage <= limit) {
        fee = limit * normalFeePerGB
    }else {
        fee = (limit * normalFeePerGB) + (extraFeePerGB * (usage - limit))
    }
    
    return fee
}