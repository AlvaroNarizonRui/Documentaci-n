abstract class Persona(nombre:String,edad:Int) {
    var nombre=nombre
        get(){
            return field
        }
        set(value){
            field=value
        }
    var edad=edad
        get(){
            return field
        }
        set(value){
            if(value>=16){
                field=value
            }else println("No tienes la edad para entrar al gimnasio")
        }

    abstract fun balanceMensual():Int

    override fun toString(): String {
        return("Datos: \n " +
                "nombre: $nombre \n" +
                "edad : $edad")
    }



}