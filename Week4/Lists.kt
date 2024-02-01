data class Person(var name: String, var age: Int)
data class WeatherItem(var temperature: Double, var description: String, var humidity: Int)

fun main(){
    var people = listOf(Person("Roman", 19), Person("Prabesh", 31), Person("Zhiyuan", 20), Person("Nguyen", 39), Person("Vasu", 21))

    for (person in people) {
        if (olderthan30(person)) {
            println(person)
        }
    }

    var weatherItems = mutableListOf(WeatherItem(11.5,"sunny",2), WeatherItem(1.5,"sunny",3), WeatherItem(0.0,"rainy",4))
    for (wi in weatherItems) {
        println(wi)
    }
    println("End of list")
    addItem(9.7, "sunny", 2, weatherItems)
    for (wi in weatherItems) {
        println(wi)
    }
    println("End of list")
    changeDesc("cold", 5.0, weatherItems[1])
    for (wi in weatherItems) {
        println(wi)
    }
    println("End of list")
}

fun changeDesc(desc: String, temp: Double, wi: WeatherItem) {
    if (wi.temperature<temp) {
        wi.description=desc
    }
}

fun addItem(temp: Double, desc: String, humidity: Int, list: MutableList<WeatherItem>) {
    list.add(WeatherItem(temp, desc, humidity))
}

fun olderthan30(p: Person): Boolean {
    if (p.age>30){
    	return true
    }
    return false
}