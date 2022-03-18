fun main(){

var f = arrayInt(arrayOf(1,2,3,4))
    println(f)
    var mixtures = types(arrayOf("church",17,0.2,0.4,"kelsey",false,6,10.5))
    println(mixtures)
    var vowels= arrayChar(arrayOf('d', 'e', 'y', 'o'))
    print(vowels)
}
//a function that takes in an array of integers and returns the product of
//all the elements
fun arrayInt(products:Array<Int>):Int{
    var product = 1
    products.forEach{num->
        product= num
    }
    return product
}
//function that takes in an array of mixed types and returns the sum of
//all the decimal elements(3pts)
fun types(mixed:Array<Any>):Double{
    var num=0.0
    mixed.forEach{number ->
        if(number is Double)
            num+=number
    }
    return num

}
//Write a function that takes in an array of characters and returns the number of

fun arrayChar(arr:Array<Char>):Int{
    var sum = 0
    arr.forEach{l->
        if (l=='e' || l=='o')
            sum++
    }
    return sum


}
