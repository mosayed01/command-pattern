package diner

class Customer(private var waitress: Waitress) {
    private var order: Order? = null
    fun createOrder(order: Order) {
        this.order = order
    }

    fun hungry() {
        order?.let { waitress.takeOrder(it) }
    }
}