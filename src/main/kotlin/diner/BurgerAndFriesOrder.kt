package diner

class BurgerAndFriesOrder(private var cook: Cook) : Order {
    override fun orderUp() {
        cook.makeBurger()
        cook.makeFries()
    }
}

