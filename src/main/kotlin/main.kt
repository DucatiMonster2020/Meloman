fun main() {
    val itemPrice: Int = 100
    val itemCount: Int = 150
    val discount: Int = 100
    val discountMax: Double = 0.95
    val discountRegular: Double = 0.01
    val discountStart: Int = 1_001
    val discountPremium: Int = 10_001
    var totalPrice = itemPrice * itemCount

    val monthlyPurchase: Int = 1 //количество минимальных ежемесячных покупок
    val regularCustomer: Int = 1 //количество совершенных покупок в предыдущем месяце
    val regular: Boolean = regularCustomer >= monthlyPurchase

    if (totalPrice < discountStart) totalPrice
    else if (totalPrice > discountStart && totalPrice < discountPremium) totalPrice = totalPrice - discount
    else if (totalPrice >= discountPremium) totalPrice = (totalPrice * discountMax).toInt()

    when (regular) {
    true -> totalPrice -= (totalPrice * discountRegular).toInt()
    false -> totalPrice
    }
    println("Итого: $totalPrice руб.")
}