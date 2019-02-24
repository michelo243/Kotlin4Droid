
//creation d'une classe
class Person(){
    init{
        println("je suis la personne")
    }
}

class Person2(var nom:String,var adresse:String,var age:Int){
    init{
        println("1. Nom : $nom")
        println("2. adresse : $adresse")
        println("3. age : $age")


    }

    fun getPersonAge():Int{
        return this.age
    }


}

class Person3(){
    var nom:String?=null
    var adresse:String?=null
    var age:Int?=null

    constructor(name:String,myage:Int):this(){
        this.nom=name
        this.age=myage
        println("constructeur 1")
    }
    constructor(myadress:String):this(){
        this.adresse=myadress
        println("constructeur 2")
    }

    init{
    }
}


fun main(args:Array<String>){

    val personne3=Person3("Mutinga")
    val personne4=Person3("Michel",18)

    var r=sum(12.0,15.0)
    var xy=display(15.0,15.0) //pas besoin de ceci car pas de retour
    display(16.0,24.0)
    println("la somme est de : $r" )
    println("la somme est de : $xy" ) // pas besoin de ceci car pas de retour

    //function polymorphe
    show(12)
    show("Matata")

    //manipulation des classes
    val oneperson=Person()
    val secondPerson=Person2("Maltazar","Kilijiwe",19)
    //ceci va recuperer seulement le contenu de la propriete Nom de la classe Person2
    println("Le nom defini est : " + secondPerson.nom)
    println("Le nom est : " + secondPerson.nom)
}

fun sum(n1:Double,n2:Double):Double{
    var somme=n1+n2
    return somme
}

fun display(n1:Double,n2:Double):Unit{
    var somme=n1+n2
    println("la reponse est de : $somme" )
}

//polymorphisme
fun show(name:String):Unit{
    println("name is $name")
}

fun show(number:Int):Unit{
    println("the number is $number")
}


