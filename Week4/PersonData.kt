data class Person(var name: String, var age: Int)

fun main(){
    var list = listOf(Person("Roman", 19), Person("Prabesh", 21), Person("Zhiyuan", 20), Person("Nguyen", 19), Person("Vasu", 21))

    for (person in list) {
        println(person)
    }

    var person1 = Person("Roman", 19)
    var person2 = Person("Roman", 19)
    println(person1==person2)

}