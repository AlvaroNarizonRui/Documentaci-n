open class SocioPlus(nombre: String, edad: Int, numerosocio: Int) : Socio(nombre, edad, numerosocio) {

    // Sobrescribir el método toString para imprimir las actividades disponibles
    override fun toString(): String {
        println("nombre: $nombre")
        println("edad: $edad")
        println("numero de socio: $numerosocio")
        val sb = StringBuilder("Tus actividades:\n")
        for ((id, actividad) in actividadesPosibles) {
            sb.append("$id : $actividad\n")
        }
        return sb.toString()
    }

    // Sobrescribir el método balanceMensual para calcular y devolver el valor de la cuota mensual
    override fun balanceMensual(): Int {
        var cuotaBase = if (edad < 18) 20 else 30

        return cuotaBase
    }
}