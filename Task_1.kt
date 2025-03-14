fun main(){
    print("Masukan tiga angka: \n")
    print("Input 1: ")
    val input1 = readLine()?.toIntOrNull() ?: return println("Input tidak valid")
    print("Input 2: ")
    val input2 = readLine()?.toIntOrNull() ?: return println("Input tidak valid")
    print("Input 3: ")
    val input3 = readLine()?.toIntOrNull() ?: return println("Input tidak valid")

    val inputs = listOf(input1, input2, input3)
    inputs.forEach { n ->
        val result = sloaneA000124(n).joinToString("-")
        println("Input: $n -> Output: $result")
    }
}

private fun sloaneA000124(n: Int): List<Int>{
    val sequence = mutableListOf(1)
    for (i in 2..n){
        sequence.add(sequence.last() + i -1)
    }
    return sequence
}