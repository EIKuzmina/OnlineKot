fun main() {
    val time = agoToText(75600)
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

fun timerMin(min: Int) = when {
    min in 10..20 ->  ""
    min % 10 == 1 -> "у"
    min % 10 in 2..4 -> "ы"
    else -> ""
}

fun timerHour(hour: Int) = when {
    hour in 10..20 -> "ов"
    hour % 10 == 1 -> ""
    hour % 10 in 2..4 -> "а"
    else -> "ов"
}