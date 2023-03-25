open class Parents() {
    open var hairColor = "Blue"
    open var heightCategory = "Tall"
}

class Child(): Parents() {

}

fun main(args: Array<String>) {
    println(Child().hairColor)
}