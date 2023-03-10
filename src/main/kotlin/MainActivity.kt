fun main() {

      lateinit var pok:Pokemon

    var num: Int
    var jota: Person = Person("Gerson","398938")
    var anonimo:Person = Person()
    println(jota.alive)
    println(jota.name)
    println(jota.passport)

    anonimo.Person()
    anonimo.name="Pablo"
    println(anonimo.alive)
    println(anonimo.name)
    println(anonimo.passport)

    jota.die()
    println(jota.alive)

    var pele:Atleta = Atleta("Pele","487484","futbol")
    println(pele.alive)
    println(pele.name)
    println(pele.passport)
    println(pele.sport)

    pele.die()
    println(pele.alive)


    var bicho:Pokemon = Pokemon()
    println(bicho.getName())
    println(bicho.getattackPower())
    bicho.setlife(30f)
    println(bicho.getlife())
}