class Gimnasio(nombregym:String,direccion:String,listapersonas:List<Persona>) {
    var nombregym=nombregym
        get(){
            return field
        }
        set(value){
            field=value
        }
    var direccion=direccion
    var listapersonas= mutableListOf<Persona>()
    fun añadirpersona(persona:Persona){
        listapersonas.add(persona)
        println("la persona ${persona.nombre} fue añadida al gimnasio ${nombregym}")
    }
    }


