import Gimnasio
fun main(args: Array<String>) {
 var gimnasio1=Gimnasio("Supera","Calle Trebol", mutableListOf())
   var trabajador1=Trabajador("Jorge",21,1500,100)
    gimnasio1.añadirpersona(trabajador1)
    println(trabajador1.balanceMensual())
    println(trabajador1.toString())
    var trabajador2=Trabajador("Pepe",25,1600,500)
 gimnasio1.añadirpersona(trabajador2)
    println(trabajador2.balanceMensual())
    println(trabajador2.toString())
    var socio1=Socio("Luismi",19,1331)
 gimnasio1.añadirpersona(socio1)
    println(socio1.balanceMensual())
    println(socio1.toString())
    var socioact1=SocioPlus("Ismael",30,1442)
 gimnasio1.añadirpersona(socioact1)
    println(socioact1.balanceMensual())
    println(socioact1.toString())
    var socioact2=SocioconActividades(mutableListOf(1,2,3),"Eloy",18,1992)
 gimnasio1.añadirpersona(socioact2)
    println(socioact2.balanceMensual())
    println(socioact2.toString())


}