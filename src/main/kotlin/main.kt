fun main() {
    val amount = 10_000
    val commission = if (amount*0.0075>3500) {amount * 0.0075}
    else 3500.00
    println(commission)
}