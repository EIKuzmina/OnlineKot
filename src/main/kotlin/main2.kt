fun main() {
    val transfer = cardBank("Visa", 5000, 0)
    println(transfer)
}

val cardMast = "Mastercard"
val cardVisa = "Visa"
val cardMir = "Mir"
val percent = 100
val holdM = 0.6
val holdV = 0.75
val bet = 20
val minComission = 35
val limitd = 150_000
val limitm = 600_000
val limitMast = 75_000

fun cardBank(card: String, amountd: Int, amountm: Int): Any {
    when (card) {
        cardMast -> {
            if ((amountd >= limitd) || (amountm >= limitm))
                return "Превышен лимит, операция невозможна"
            if ((amountd + amountm) in (1..limitMast)) return amountd
            else return ((limitMast * holdM) / percent + bet).toInt()
        }

        cardVisa -> {
            if ((amountd >= limitd) || (amountm >= limitm))
                return "Превышен лимит, операция невозможна"
            if (((amountd * holdV) / percent) > minComission) return (amountd * holdV) / percent
            else return minComission
        }

        cardMir -> {
            if ((amountd >= limitd) || (amountm >= limitm))
                return "Превышен лимит, операция невозможна"
            return (amountd * 1)
        }
    }
    return "Такой карты не существует"
}