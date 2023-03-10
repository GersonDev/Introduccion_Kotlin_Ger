const val moneda = "EUR"
var saldo: Float = 330.54f
var sueldo: Float = 764.82f
var entero: Int = 62
fun main() {
    /*//OPERADORES DE COMPARACION!!!
     val a: Int = 10
    val b: Int = 12
    a == b //false
    a != b//true
    //a mayor que b
    a > b//false
    a >= b//false
    //a menor que b
    a < b//true
    a <= b//true*/
    /*//OPERADORES LOGICOS
   var a: Boolean = true
   var b: Boolean = true
   var c: Boolean = false
   var d: Boolean = false

   a && b //&& = Y AND
           //CONDICION && CONDICION
           //A == 5         3<=B
   a || b// || = O OR
           //CONDICION && CONDICION
           //A == 5         3<=B
   a && c
   a && c
   !d // != NEGACION O DIFERENTE DE  */
    /*//CONDICIONAL IF
    val nombre: String = "Gerson"
         val vip: Boolean = false
         if (vip == true) {
             println("$nombre eres vip te queremos mucho")
         } else {
             println("$nombre no eres vip no queremos")
         }*/
    /* //CONDICIONAL WHEN
    val fecha = "05/02/1990"
    //           0123456789 estos son los indices
    val mes = fecha.subSequence(3, 5).toString().toInt()
     when (mes) {
         1, 2, 3 -> println("Estan son ofertas de enero,febrero,marzo")
         4, 5, 6 -> println("Estan son ofertas de abril,mayo,junio")
         7, 8, 9 -> println("Estan son ofertas de julio,agosto,septiembre")
         10, 11, 12 -> println("Estan son ofertas de octubre,noviembre,diciembre")
         else -> println("Error de mes")
     }*/
    /*// BUCLE DO WHILE
    var pin: Int = 1234
    var intentos: Int = 0
    var claveIngresada: Int = 1233
    do {
        println("Ingrese su PIN:")
        println("Clave ingresada: ${++claveIngresada}")
        //BREAK ROMPE BUCLES
        if (claveIngresada == pin) break
        intentos++
    } while (intentos < 3 && claveIngresada != pin)
    if (intentos == 3) println("Trajeta Bloqueada")*/
    /* //LLAMAR FUNCIONES DE FUERA ADENTRO DE LA FUNCION MAIN(CON LLAMADO DE PARAMETROS Y RECEPTOR POR PARAMTEROS)
    ingresar_Sueldo()
    ingresarDinero(cantidadDeDinero = 50.5f)
    retirarDinero(cantidadDeDinero = 40f)

    retirarDinero(cantidadDeDinero = 50f)
    retirarDinero(cantidadDeDinero = 2000f)*/
    /*//ARRAYS,MATRICES,FOR,FOR ANIDADOS
    var recibos: Array<String> = arrayOf("Gerson", "Cornelio", "Vargas")
    recibos.set(2, "Guillermo")
    recorrer_array(recibos)
    var matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6, 7, 8, 9, 10),
        intArrayOf(11, 12, 13, 14)
    )
    for (i in (0 until matriz.size)) {
        println()
        for (j in (0 until matriz[i].size))
            println("Posicion[$i][$j]: ${matriz[i][j]}")
    }*/
    /*//SET INMUTABLES
    var clientesVIP: Set<Int> = setOf(1234, 5678, 4040)
    val setMezclado = setOf(2, 4.454, "casa", 'c')
    println("Clientes Vip $clientesVIP")
    println("Numeros de clientes VIP:${clientesVIP.size}")
    if (clientesVIP.contains(1234)) println("1234 es VIP")
    println("No es VIP")*/
    /*//SET MUTABLES FUNCIONES DE EXTENSION .ADD.REMOVE.CLEAR.SIZE
val clientes:MutableSet<Int> = mutableSetOf(1234,5678,4040,8970)
    println("Clientes:")
    //.add agrega elemnento
    clientes.add(3026)
    println(clientes)
    //.remove remueve elemento
    clientes.remove(5678)
    println(clientes)
    //.clear limpia todo
    clientes.clear()
    println(clientes)
    //.size da el tamaño del set
    println("Numero de clientes: ${clientes.size}")*/
    /*//LIST Y MUTABLE LIST FUNCIONES DE EXTENSION .ADD.REMOTEAT,.FIRST,LAST,ELEMENAT,NONE,FIRSTORNULL
    var divisas:List<String> = listOf("USD","EUR","YEN")
    println(divisas)
    var bolsa:MutableList<String> = mutableListOf("Coca-Cola","Adidas","Amazon","Pfizer")
    println(bolsa)
    //.ADD AGREGA A LA LISTA
    bolsa.add("Adobe")
    println(bolsa)
    bolsa.add("Nvidia")
    println(bolsa)
    //.REM0VEAT REMUEVE SEGUN SU INDICE
    bolsa.removeAt(2)
    println(bolsa)
    //.FIRST BUSCA EL PRIMERO
    println(bolsa.first())
    //.LAST BUSCA EL ULTIMO
    println(bolsa.last())
    //.ELEMENTAT ENCUENTRA SEGUN SU INDICE Y LO MUESTRA
    println(bolsa.elementAt(2))
    //.NONE PREGUNTA SI ESTA VACIO
    println(bolsa.none())
    println(bolsa.firstOrNull())
    //.CLEAR BORRA TODOS LOS ELEMENTOS
    bolsa.clear()
    println(bolsa)

    println(bolsa.none())
    println(bolsa.firstOrNull())*/
    /*//MAP Y MUTABLEMAP KEY = LLAVE V = VALOR
    var mapa: Map<Int, String> = mapOf(
        1 to "España",
        2 to "Mexico",
        3 to "Colombia"
    )
    println(mapa)
    var inversiones: MutableMap<String, Float> = mutableMapOf()
    inversiones.put("Coca-Cola", 50f)
    println(inversiones)*/
    /* //BUCLE WHILE
    var inversiones = mutableMapOf<String, Float>()
    val bolsa = mutableListOf("Coca-Cola", "Adidas", "Amazon", "Pfizer", "Nvidia", "Adobe")
    //35. Null Safety
    var empresa: String? = null
    mostrar_Saldo()
    var cantidad_a_invertir = 90f
    var index = 0
    while (saldo >= cantidad_a_invertir) {
        empresa = bolsa.elementAtOrNull(index)
        if (empresa != null) {
            saldo -= cantidad_a_invertir

            println("Se ha invertido $cantidad_a_invertir $moneda en $empresa")
            inversiones.put(empresa, cantidad_a_invertir)
        } else{
            break
        }
        index++
    }*/
}

fun mostrar_Saldo() {
    println("Tienes $saldo $moneda")
}

fun ingresar_Sueldo() {
    saldo += sueldo
    println("Se ha ingresado tu sueldo de $sueldo $moneda")
    mostrar_Saldo()
}

fun ingresarDinero(cantidadDeDinero: Float) {
    saldo += cantidadDeDinero
    println("Se ha ingresado $cantidadDeDinero $moneda")
    mostrar_Saldo()
}

fun retirarDinero(cantidadDeDinero: Float) {
    if (verificarCantidad(cantidad_a_retirar = cantidadDeDinero)) {
        saldo -= cantidadDeDinero
        println("Se ha  retirado  $cantidadDeDinero $moneda")
        mostrar_Saldo()
    } else {
        println("Cantidad superior al saldo.Imposible realizar la operacion")
    }
}

fun verificarCantidad(cantidad_a_retirar: Float): Boolean {
    if (cantidad_a_retirar > saldo) return false
    else return true
}

fun recorrer_array(array: Array<String>) {
    //FOR PARA RECORRE CADA ELEMENTO I(ES UN ELEMNTO)
    for (i in array)
        println(i)
    //FOR RECORRE  INDICE POR INDICI Y EL I YA NO ES UN ELEMENTO SINO UN NUMERO
    for (i in array.indices)
        println(array.get(i))
    //FOR RECORRE CON INDICE DANDO MENOS UNO PORQUE EL INDICE COMIENZA DESDE 0
    for (i in 0..array.size - 1)
        println("${i + 1}: ${array.get(i)}")
}
