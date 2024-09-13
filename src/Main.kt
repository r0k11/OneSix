fun main()
{
    println("Введите первую цифру:")
    val firstDigit = readLine()?.trim()
    println("Введите вторую цифру:")
    val secondDigit = readLine()?.trim()
    if (firstDigit != null && secondDigit != null &&
        firstDigit.length == 1 && secondDigit.length == 1 &&
        firstDigit != secondDigit &&
        firstDigit.all { it.isDigit() } &&
        secondDigit.all { it.isDigit() })
    {
        val oddDigits = listOf(firstDigit, secondDigit).filter { it.toInt() % 2 != 0 }
        if (oddDigits.isNotEmpty())
        {
            val oddNumber = if (oddDigits.size == 1)
            {
                oddDigits[0] + (if (firstDigit == oddDigits[0]) secondDigit else firstDigit)
            }
            else
            {
                oddDigits[0] + oddDigits[1]
            }
            println("Созданное нечетное число: $oddNumber")
        }
        else
        {
            println("Создать нечетное число невозможно")
        }
    }
    else
    {
        println("Ошибка: введите две различные цифры.")
    }
}
