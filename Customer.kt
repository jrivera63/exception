/**
 * @author Josiah Rivera
 * Date 10/07/2022
 * @param
 * customerName is the name of the customer
 * customerAddress is the address of the customer
 * customerPhone is the phone number of the customer
 * squareFootage is how large the property is in square feet
 */
open class Customer(customerName: String,
               customerPhone: String,
               customerAddress: String,
               squareFootage: Double
               ) {
    var customerName: String = ""
        get() = field
        set(value) {
            field = value
        }

    var customerPhone: String = ""
        get() = field
        set(value) {
            field = value
        }

    var customerAddress: String = ""
        get() = field
        set(value) {
            field = value
        }

    var squareFootage: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    init{
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
    }
}