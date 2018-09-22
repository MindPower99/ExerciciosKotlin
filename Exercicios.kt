fun main(args: Array<String>) {
    println (sla (1,8))
   val x = 6
    
when (x) {
   1,2,3 -> print("valor ruim")
   4,5,6,7 -> print("valor aceito")
    7,8,9,10 -> print ("valor ótimo")
   else -> { // Note the block
       print("valor não encontrado")
   }
}

    
}

fun sla(a: Int, b: Int): Int =
	(a + b) * 3
