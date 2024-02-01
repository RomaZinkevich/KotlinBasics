class Person(var name: String, var age: Int)

fun main(){
    var array = arrayOf(Person("Roman", 19), Person("Prabesh", 21), Person("Zhiyuan", 20), Person("Nguyen", 19), Person("Vasu", 21))

    for (person in array) {
        println("${person.name} - ${person.age}")
    }

}