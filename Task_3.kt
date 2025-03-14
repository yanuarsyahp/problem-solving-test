fun main(){
    print("Masukkan string bracket: ")
    val input = readLine()?.replace(" ","")?: return println("Input tidak valid")
    println(isBalancedBracket(input))
}

private fun isBalancedBracket(s: String): String{
    val stack = mutableListOf<Char>()
    val bracketPairs = mapOf(')' to '(', '}' to '{', ']' to '[')

    for (char in s) {
        if (char in bracketPairs.values) {
            stack.add(char)
        } else if (char in bracketPairs.keys) {
            if (stack.isEmpty() || stack.removeAt(stack.size - 1) != bracketPairs[char]) {
                return "NO"
            }
        }
    }
    return if (stack.isEmpty()) "YES" else "NO"
}