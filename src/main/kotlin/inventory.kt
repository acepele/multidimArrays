fun main() {
    print("This is a list of some of the supplies needed for a coffee shop:\n")
    val coffeeShop = arrayOf("1-Espresso machine ", "2-Coffee grinder ", "3-Industrial blenders ", "4-Oven and toasters ", "5-Automatic drip coffee makers ", "6-Curbside pickup and supplies ")
    val nrpiece = arrayOf("1", "2", "1", "4", "5", "10")
    count = 0
    var differ: IntArray = intArrayOf(0,0,0,0,0,0)


    for (element in coffeeShop) {
        println(element)
    }

    var combArray = arrayof<Array<String>>()
    combArray += coffeeShop
    combArray += nrpiece

    val rcount = combArray[0].size - 1

    for (i in 0..rcount) {
        val item = combArray[0][i]
        val nrpiece = combArray[1][i]
        println("The item you searched is: $item and in our store there are $nrpiece pieces.")
    }

    fun difference(){
        var i = 0
        while (i < 6) {
            differ[i] = coffeeShop[i] - nrpiece[i]
            i = i + 1
            if (count -- ) {
                println("Error! Try again")
            }
        }
        for (i in 0..rcount) {
            val totalCount = nrpiece.count()
            val nameItem = nameItem.count()
            val price = price.count()
            println("The item you searched is: $nameItem and it cost $nrpiece. You have to pay this amount $price for $totalCount. ")
        }
    }