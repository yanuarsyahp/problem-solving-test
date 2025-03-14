fun main(){
    print("Masukan jumlah pemain: ")
    val players = readLine()?.toIntOrNull() ?: return println("Input tidak valid")
    print("Masukan skor pemain (pisahkan dengan spasi): ")
    val scores = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return println("Input tidak valid")
    print("Masukan jumlah permainan GITS: ")
    val games = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return println("Input tidak valid")
    print("Masukan skor GITS (pisahkan dengan spasi)")
    val gitsScores = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return println("Input tidak valid")

    val results = denceRanking(scores, gitsScores)
    println("Output: ${results.joinToString(" ")}")
}

private fun denceRanking (scores: List<Int>, gitsScores: List<Int>): List<Int>{
    val uniqueRanks = scores.distinct().sortedDescending()
    return gitsScores.map { score ->
        val rank = uniqueRanks.indexOfFirst { it <= score } + 1
        if (rank == 0) uniqueRanks.size + 1 else rank
    }
}