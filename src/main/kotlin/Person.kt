open class Person(var name: String = "anonimo", var passport: String? = null) {
    var alive: Boolean = true
    fun die() {
        alive = false
    }

    fun Person() {
        name = "Juan"
        passport = "54564946"
    }
}
class Atleta(name: String, passport: String?, var sport: String) : Person(name, passport) {
}