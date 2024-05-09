fun main() {
    val time = agoToText(660)
    println("был(а) $time ")
}

fun agoToText(time: Int) = when (time) {
    in 0..60 -> "только что"
    in 61..3_600 -> "${time / 60} минут${timerMin(time / 60)} назад"
    in 3_601..86_400 -> "${time / 3600} час${timerHour(time / 3600)} назад"
    in 86_401..172_800 -> "вчера"
    in 172_801..259_200 -> "позавчера"
    else -> "давно"
}

fun timerMin(min: Int) = when (min) {
    if (min == 11 || min == 12 || min == 13 || min == 14) "" else
        1 -> "у"

    2, 3, 4 -> "ы"
    in 10..20 -> ""
    else -> ""
}

fun timerHour(hour: Int) = when (hour % 10) {
    1 -> ""
    2, 3, 4 -> "а"
    else -> "ов"
}