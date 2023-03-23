class Trabajador(nombre:String,edad:Int,sueldo:Int,segurosSocial:Int):Persona(nombre,edad) {
    var sueldo=sueldo
        get(){
            return field
        }
        set(value){
            if(value>0){
                field=value
            }else println("No puedes cobrar en negativo")
        }
    var segurosSocial=segurosSocial
        get(){
            return field
        }
        set(value){
            if(value>0){
                field=value
            }else println("No puedes cobrar la seguridad social en negativo")
        }

    override fun balanceMensual(): Int {
        return -(sueldo+segurosSocial)
    }
    override fun toString():String{
        return("Datos del trabajador \n" +
                "------------------- \n" +
                "nombre: $nombre \n" +
                "edad: $edad \n" +
                "sueldo: $sueldo \n" +
                "ingreso de la seguridad social: $segurosSocial")
    }
}