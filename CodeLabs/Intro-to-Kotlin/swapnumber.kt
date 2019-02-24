
fun main(Args:Array<String>){
    //permet de faire le swap de deux nombres
    print("Entrez le nombre 1 : ")
    var nb1:Int= readLine()!!.toInt()
    print("Entrez le nombre 2 : ")
    var nb2:Int= readLine()!!.toInt()
    //valeur tempon de swap
    var nbX:Int?
    println("Nombre 1 est : $nb1" )
    println("Nombre 2 est : $nb2" )
    //swap des nombres
    nbX=nb1
    nb1=nb2
    //resultats
    println("apres swap on a le nombre 1 qui est : $nb1 et le nombre 2 qui est $nbX" )

}
