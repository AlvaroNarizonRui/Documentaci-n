/**
 * FUNCIÓN DE LA PERSONA:
 * @property Persona servirá como plantilla
 * para todos los miembros del gimnasio que creemos.
 *
 *
 *  ATRIBUTOS DE CLASE:
 *  @param nombre será el nombre de la persona
 *  @param edad será la edad de la persona
 */
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
    //Es una función abstracta que dependiendo que persona calculará el balance
    //mensual (lo que tenga que pagar cada persona o en caso del trabajador lo que cobrará.
    abstract fun balanceMensual():Int

    //En esta función se mostrará los datos de cada persona
    override fun toString(): String {
        return("Datos: \n " +
                "nombre: $nombre \n" +
                "edad : $edad")
    }



}