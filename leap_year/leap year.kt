import java.util.*
 
fun main(args: Array<String>) {
    println(leapyear(2000)) // true
	println(leapyear(1209)) // false
	println(leapyear(1980)) // true
	println(leapyear(1790)) // false
	println(leapyear(1993)) // false
}

fun leapyear(year: Int): Boolean{
	val yesleapyear: Boolean = true
	val notleapyear: Boolean = false
	
if (year%4 == 0 && year%100 != 0 || year%400 == 0)
	return yesleapyear
return notleapyear
}
	