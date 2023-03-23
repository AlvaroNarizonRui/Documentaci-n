class SocioconActividades(
    listaactividades: List<Int>,
    nombre: String,
    edad: Int,
    numerosocio: Int
) : Socio(nombre, edad, numerosocio) {

    val listaactividades: List<Int> = listaactividades.toList()

    constructor(nombre1: String, edad1: Int, numerosocio1: Int) :
            this(emptyList(), nombre1, edad1, numerosocio1)

    fun añadiractividades(idactividad: Int) {
        if (idactividad in actividadesPosibles.keys) {
            listaactividades.toMutableList().add(idactividad)
        } else {
            throw IllegalArgumentException("Actividad no válida")
        }
    }

    override fun balanceMensual(): Int {
        var sumaactividades = listaactividades.size * 10
        return if (edad < 18) {
            if (sumaactividades <= 40) {
                20 + sumaactividades
            } else {
                20 + 40
            }
        } else {
            if (sumaactividades <= 60) {
                20 + sumaactividades
            } else {
                20 + 60
            }
        }
    }

    override fun toString(): String {
        println("nombre: $nombre")
        println("edad: $edad")
        println("numero de socio: $numerosocio")
        val sb = StringBuilder()
        for (i in listaactividades) {
            sb.append("$i : ${actividadesPosibles[i]}\n")
        }
        return sb.toString()
    }
}