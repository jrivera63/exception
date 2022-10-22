/**
 * @author Josiah Rivera
 * Date 10/07/2022
 *
 */
fun main() {
    var userAnswer = 0

        // wasn't sure the best way to do the while loop. probably not efficient but works

    while(userAnswer != 3){
        println("Choose an option(type the number of the option)")
        println("1.Commercial Customer\n2.Residential Customer\n3.done")

        try {
            userAnswer = readLine()!!.toInt()
        } catch (e: NumberFormatException){
            print("Please Enter a number 1-3\n")
            break
        }

        if (userAnswer == 3){
            break
        }

        print("What is your name?: ")
        val name = readLine()!!.toString()

        println("\n")
        print("What is your phone number?: ")
        val number = readLine()!!.toString()
        println("\n")
        print("What is your address?: ")
        val address = readLine()!!.toString()
        println("\n")
        print("How many square feet is the property?: ")
        var squareFeet = 0.0
        try {
            squareFeet = readLine()!!.toDouble()
        } catch (e: NumberFormatException){
            print("Please enter a valid number(double)")
        }

        if (userAnswer == 1){
            println("\n")
            print("What is the name of the property?: ")
            val propName = readLine()!!.toString()
            println("\n")
            print("Do you own multiple properties(true or false)?: ")

                val multiProp = readLine()!!.toBooleanStrictOrNull()
            if (multiProp != true && multiProp != false){
                throw IllegalArgumentException("Please enter a Boolean(true or false)")
            }

            println("\n")
            val commercialCustomer = Commercial(propName, 5, multiProp, name, number, address, squareFeet)
            commercialCustomer.weeklyCharge()
        } else if (userAnswer == 2){
            println("\n")
            print("Are you a senior(true or false)?: ")
            val senior = readLine()!!.toBooleanStrictOrNull()
            if (senior != true && senior != false){
                throw IllegalArgumentException("Please enter a Boolean(true or false)")
            }
            println("\n")
            val residentialCustomer = Residential(6, senior ,name, number, address, squareFeet)
            residentialCustomer.weeklyCharge()
        }
    }

}