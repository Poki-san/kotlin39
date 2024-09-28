import java.util.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Задание 1")
    val z1 = setOf((1..9).random(),(1..9).random(),(1..9).random(),(1..9).random(),(1..9).random())
    val z1a = z1.filter { it%2==0 }
    val z1b = z1.filter { it%2!=0 }

    z1.forEach { el -> print("$el ") }
    println()
    z1a.forEach { el -> print("$el ") }
    println()
    z1b.forEach { el -> print("$el ") }

    println("\nЗадание 2")
    val z2 = setOf((1..19).random(),(1..19).random(),(1..19).random(),(1..19).random(),(1..19).random())

    val z2a = crFive(z2)
    z2.forEach { el -> print("$el ") }
    println()
    z2a.forEach { el -> print("$el ") }

    println("\nЗадание 3")
    val z3 = listOf((1..19).random(),(1..19).random(),(1..19).random(),(1..19).random(),(1..19).random())
    val z3a = removeDuplicates(z3)
    z3.forEach { el -> print("$el ") }
    println()
    z3a?.forEach { el -> print("$el ") }

    println("\nЗадание 4")
    val z4 = arrayOf(0,(0..9).random(),(0..9).random(),0,(0..9).random())
    z4.forEach { el -> print("$el ") }
    println()
    val z4a = moveZeros(z4)
    z4a.forEach { el -> print("$el ") }

}

fun crFive(arr:Set<Int>):Set<Int>{
    val result = TreeSet<Int>()
    arr.forEach { el ->
        if ((el * 2)%5==0) result.add(el * 2)
    }

    return result
}
fun <T> removeDuplicates (collection: Collection<T>?):List<T>?{
    val result = collection?.distinct()
    return result
}
fun moveZeros(arr:Array<Int>):Array<Int>{
    var count = 0
    for(el in arr){
        if( el != 0){
            arr[count++] = el
        }
    }
    for (i in count..arr.indices.last) arr[i] = 0

    return arr;
}