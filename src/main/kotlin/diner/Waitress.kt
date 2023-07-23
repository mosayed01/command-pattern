package diner


class Waitress {
    private var order: Order? = null
    fun takeOrder(order: Order) {
        this.order = order
        order.orderUp()
    }
}