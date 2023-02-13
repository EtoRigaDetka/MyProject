



fun main() {
var arr: Int = 0
fun factorial(number:Int):Int{
     arr=number
    var accumulator=1
     for (result in 1..number){
        accumulator=accumulator*result
    }
return accumulator
}

println("${factorial(6)} - is a fractal of $arr!")

}