class Person(var name: String, var age: Int)

fun main(){
    var person = Person("Roman", 19)
    println("${person.name} - ${person.age}")
}