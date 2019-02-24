
fun main(args:Array<String>){

    println ("Bonjour L1ig")
    println("nous sommes en classe")

    var x=10
    var y=12
    var name="toto"

    println("mon nom est $name " )

    var age:Int=28
    var personne:String="Hussein"

    println("mon nom est $personne et mon age est $age " )

    var personne2:String?
    personne2=null

    val personne3:String="Amadou"

    var etudiant= readLine()
    println("mon nom est $etudiant et mon age est $age " )

    print("Entrez votre nom complet : ")
    var nomComplet:String?
    nomComplet= readLine()
    println("mon nom est $nomComplet et je suis Happy" )


    var monAge:Int= readLine()!!.toInt()

    var personne5:String?
    personne5=null
    println(personne5!!)


}