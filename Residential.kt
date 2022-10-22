/**
 * @author Josiah Rivera
 * Date 10/07/2022
 * @param
 * rate is the money per 1000 square feet
 * isSenior is the boolean that checks if they are a senior for a discount
 *
 */
class Residential(rate: Int,
                 isSenior: Boolean,
                 customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: Double
): Customer(customerName, customerPhone, customerAddress, squareFootage) {

    var rate = 6
        get() = field
        set(value) {
            field = value
        }

    var isSenior = false
        get() = field
        set(value) {
            field = value
        }

    init {
        this.rate = rate
        this.isSenior = isSenior
    }

    fun weeklyCharge(){
        var squareNum = squareFootage / 1000
        var weeklyAmount = squareNum * rate
        if (isSenior){
            var discountTrue = weeklyAmount * .15
            weeklyAmount = weeklyAmount - discountTrue
        }

        println("Customer Name: $customerName\nCustomer Phone Number: $customerPhone\nCustomer Address: $customerAddress\nProperty square footage: $squareFootage square feet\nThe property rate is $$rate per 1000 square yards\nThe weekly charge is $$weeklyAmount per week")
    }
}
