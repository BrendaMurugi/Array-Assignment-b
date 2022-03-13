fun main() {
    var result = numbers(arrayOf(2, 5, 7, 9))
    println(result)

    var result2 = mixedTypes(arrayOf(45.7, "Brenda", 23.6, 5.6))
    println(result2)

    var result3 = characters(arrayOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u'))
    println(result3)
}

//Write a function that takes in an array of integers and returns the product of all the elements.

fun numbers(num:Array<Int>):Int {
    var product = 1
    num.forEach { prod->
        product*=prod
    }
        return product
}

//Write a function that takes in an array of mixed types and returns the sum of
//all the decimal elements.

fun mixedTypes(info:Array<Any>):Float {
    var sum = 0.0F
    info.forEach { add->
    if (add is Float || add is Double)
    sum+=add.toString().toFloat()
    }
    return sum
}

//Write a function that takes in an array of characters and returns the number of
//vowels in the array

fun characters(vowels:Array<Char>):Int {
    var num = 0
    vowels.forEach { vowel->
    if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
     num++
    }
    return num
}