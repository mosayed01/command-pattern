package diner

class BurgerAndFriesOrder(private val cook: Cook) : Order {
    override fun orderUp() {
        cook.makeBurger()
        cook.makeFries()
    }
}

