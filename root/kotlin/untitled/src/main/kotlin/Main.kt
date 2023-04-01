enum class Color(var data: String) {
    Blue("biru muda"), Green("hijau"), Red("merah")
}

fun main(args: Array<String>) {
    println(Color.Blue.data)
}