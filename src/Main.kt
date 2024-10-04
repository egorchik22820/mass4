//все работает, но, если в меньшем массиве пересекающееся число повторяется больше,
//чем в большем массиве, то в пересечении отразиться именно это количество.
//если такая ситуация произойдет в большем массиве, то все будет правильно

fun main() {
    print("введите числа в 1 массив через пробел: ")
    var str = readln()
    val arr1 = mutableListOf<Int>()
    str.split(" ").forEach { num -> arr1.add(num.toInt()) }


    print("введите числа в 2 массив через пробел: ")
    str = readln()
    val arr2 = mutableListOf<Int>()
    str.split(" ").forEach { num -> arr2.add(num.toInt()) }

    var union = mutableListOf<Int>()
    if (arr1.size <= arr2.size) {
        for (i in 0 until arr1.size) {
            if (arr1[i] in arr2)
                union.add(arr1[i])
        }
    } else {
        for (i in 0 until arr2.size) {
            if (arr2[i] in arr1)
                union.add(arr2[i])
        }
    }


    print("$arr1\n$arr2\n${union.sorted()}")


}