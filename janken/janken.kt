import java.util.*

enum class HandType(val id: Int){
	rock(0), scissors(1), paper(2),
}

fun janken(hand: HandType){
	val cp = (0..2).shuffled().first()
	val cpHand = HandType.values().filter{cp == it.id}
	
	if(hand.id == cp)
		println("cp : ${cpHand}. draw")
		
	else if((hand.id + 1) % 3 == cp)
		println("cp : ${cpHand}. you win!")
		
	else
		println("cp : ${cpHand}. you lose...")
}
 
fun main(args: Array<String>) {
	janken(HandType.rock)
	janken(HandType.scissors)
	janken(HandType.paper)
}
  