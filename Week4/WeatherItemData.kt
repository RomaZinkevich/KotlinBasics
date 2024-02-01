data class WeatherItem(var temperature: Double, var description: String, var humidity: Int)

fun main(){
    var wi = WeatherItem(22.5, "Sunny", 2)
    println(wi)
    var wi2 = wi.copy(temperature=11.6)
    println(wi2)
}