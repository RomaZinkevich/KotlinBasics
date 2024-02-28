data class ToDoItem(var id: Int, var userId: Int, var title: String, var isCompleted: Boolean)
data class PhotoItem(var id: Int, var albumId: Int, var title: String, var url: String, var thumbnailUrl: String)
data class GeoItem(var lat: String, var lng: String)
data class AddressItem(var street: String, var suite: String, var city: String, var zipcode: String, var geo: GeoItem)
data class CompanyItem(var name: String, var catchPhrase: String, var bs: String)
data class UserItem(var id: Int, var name: String, var username: String, var email: String, var address: AddressItem, var phone: String, var website: String, var company: CompanyItem )

fun main(){
    println("Hello World")
}