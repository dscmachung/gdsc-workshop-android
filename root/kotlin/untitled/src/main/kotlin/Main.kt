import testing.Road

// Class = blueprint
class House {
    // properties
    var color:String = "merah"
    var windows: Int = 4
    var isSale: Boolean = false

    // method
    fun updateColor(color: String){
        this.color = color
    }
    fun putOnSale(isSale: Boolean) {
        this.isSale = isSale
    }
}

fun main(args: Array<String>) {
    val myHouse = House()
    println(myHouse.isSale)
}