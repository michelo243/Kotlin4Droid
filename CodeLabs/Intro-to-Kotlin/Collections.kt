fun main(args:Array<String>) {

    /* ***************************************
        Tableau simple
     */
    var arrayInt = Array<Int>(5) { 0 }
    arrayInt[3] = 55
    println("valeur Array[3] est de :" + arrayInt[3])

    for (element in arrayInt) {
        println("le Array contient :" + element)
    }

    // tableau des caracteres avec valeurs saisies par l'utilisateur
    println("********** Entrez une valeur du tableau *************")
    var arrTab = Array<String>(5) { "" }
    for (index in 0..4) {
        arrTab[index] = readLine()!!
    }

    /* ***************************************
        les ArrayList
     */
    var arraylist1 = ArrayList<String>()
    arraylist1.add("Moise")
    arraylist1.add("Josue")
    arraylist1.add("Maltazar")
    //recupere un element de l'arraylist
    println(
        "le premier nom de la liste " +
                "est :" + arraylist1.get(0)
    )
    //imprime l'ensemble des elements de la liste
    for (item in arraylist1) {
        println(item)
    }

    //set une valeur dans l'arrayList
    arraylist1.set(1, "Saddam Hussein")

    //Test dans une arrayList
    if (arraylist1.contains("Saddam Hussein")) {
        println("C'est OK")
    } else {
        println("Cette valeur n'existe pas")
    }

    //Boucle dans un arraylist
    for (index in 0..arraylist1.size-1){
        println(arraylist1.get(index))
    }

    /* ***************************************
       HaspMap
    */

    var hmap = HashMap<Int,String>()
    hmap.put(1,"Saddam")
    hmap.put(2,"hussein")
    hmap.put(3,"donald")
    hmap.put(4,"trump")
    hmap.put(5,"Shadary")
    hmap.put(1,"Kabila")

    println(hmap.get(5)) //recupere la valeur dont la cle est 5

    for(k in hmap.keys){
        println(hmap.get(k))
    }

}




