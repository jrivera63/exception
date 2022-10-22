/**
 * @author Josiah Rivera
 * Date 10/07/2022
 * @param
 * propertyName is the name of the property
 * commercialRate is the amount of money per 1000 square feet (not changed by user)
 * multiProperty is a boolean for if the user owns multiple properties
 *
 */
class Commercial(propertyName: String,
                 commercialRate: Int,
                 multiProperty: Boolean,
                 customerName: String,
                 customerPhone: String,
                 customerAddress: String,
                 squareFootage: Double
                 ): Customer(customerName, customerPhone, customerAddress, squareFootage) {

                var propertyName = ""
                    get() = field
                    set(value) {
                        field = value
                    }

                var commercialRate = 5
                    get() = field
                    set(value) {
                        field = value
                    }

                var multiProperty = false
                    get() = field
                    set(value) {
                        field = value
                    }

    init{
        this.propertyName = propertyName
        this.commercialRate = commercialRate
        this.multiProperty = multiProperty
    }

    fun weeklyCharge(){
        var squareNum = squareFootage / 1000
        var weeklyAmount = squareNum * commercialRate
        if (multiProperty){
            var discountTrue = weeklyAmount * .10
            weeklyAmount = weeklyAmount - discountTrue
        }

        println("Customer Name: $customerName\nCustomer Phone Number: $customerPhone\nCustomer Address: $customerAddress\nProperty square footage: $squareFootage square feet\nThe property rate is $$commercialRate per 1000 square yards\nThe weekly charge is $$weeklyAmount per week")
    }
}