fun main(args:Array<String>){

    //Utilisation de FOR

    for (item in 1..10){
        println ("Bonjour L1IG")
    }

    for (item in 1..10){
        println ("Bonjour L1IG numero $item")
        if(item==3)
            println("Vous etes a l'index 3")
    }


    //Utilisation de WHEN

    var x=10
    var y:Int?
    y= readLine()!!.toInt()
    when (y){
        1,2-> {print ("la valeur est 1 ou 2")}
        55-> {print ("la vvaleur est 55")}
        in 3..10->{
            println("la valeur est entre 3 et 10")
        }
        !in 11..20->{
            println("la valeur " +
                    "est incorrecte")
        }
        else->{
            println ("ma valeur a moi est 10")
        }
    }

//Utilisation de iF...else ... else if
    println("Entrez votre aauditoire :")

    var auditoire:String= readLine()!!

    if(auditoire=="L1IG"){
        println("Vous etes adultes")
    }
    if(auditoire=="L2IG"){
        println("Vous etes grandement adultes")
    }

    println("Entrez votre age :")

    var monAge:Double= readLine()!!.toDouble()
    if(monAge==18.0){
        println("vous etes majeur")
    }else if (monAge>=18.0 && monAge<=45.0){
        println("vous etes toujoours majeur")
    }else if (monAge>=45.0 && monAge<=80.0){
        println("vous avez veilli")
    }else if (monAge>=80.0){
        println("vous etes un ancetre")
    }




}