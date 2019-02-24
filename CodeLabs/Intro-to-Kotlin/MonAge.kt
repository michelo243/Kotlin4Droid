import java.util.*

fun main (args:Array<String>){

    //va nous permettre juste de calculer l'age d'une personne
    println ("Merci d'introduire votre Annee de naissance : ")
    var AnneeNaissance:Int= readLine()!!.toInt()
    var AnneeNaissance2:Double= readLine()!!.toDouble()

    //process
    var age=2018-AnneeNaissance

    var AnneeActuelle= Calendar.getInstance().get(Calendar.YEAR)

    var ageReel=AnneeActuelle-AnneeNaissance

    println("--> Votre age est de : $ageReel")


    var isOK:Boolean=false
    println(!isOK)
    //va noous renvoyer => true
}