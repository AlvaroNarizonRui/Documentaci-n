open class Socio(nombre:String,edad:Int,numerosocio:Int):Persona(nombre,edad) {
    var numerosocio=numerosocio
        get(){
            return field
        }
        set(value){
            field=value
        }
    companion object{
    open val actividadesPosibles= mutableMapOf(1 to "karate",
                                                  2 to "spinning",
                                                  3 to "zumba",
                                                  4 to "otra")
    }

    fun añadirActividad(id:Int){
        if(id in actividadesPosibles.keys){
            println("Pasa a la sala a realizar la actividad ${actividadesPosibles[id]}")
        }
    }

    override fun balanceMensual(): Int {
        if(edad<18){
            return 20
        }
        else return 35
    }



}