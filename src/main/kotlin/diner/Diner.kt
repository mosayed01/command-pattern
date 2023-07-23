package diner

fun main() {
    val cook = Cook()
    val waitress = Waitress()
    val customer = Customer(waitress)
    customer.createOrder(BurgerAndFriesOrder(cook))
    customer.hungry()
}