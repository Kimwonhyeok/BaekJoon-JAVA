class Solution {
    fun romanToInt(s: String): Int {
        var result = 0
        var prevSymbol = -1
        for (i in s.length -1 downTo 0) {
            val symbol = symbolToINt(s[i])
            if (prevSymbol>symbol) {
                result -= symbol
                prevSymbol = -1
            }else {
                result += symbol
                prevSymbol = symbol
            }
        }

        return result
    }

     fun symbolToINt(c: Char): Int {
        when(c) {
            'I' -> return 1
            'V' -> return 5
            'X' -> return 10
            'L' -> return 50
            'C' -> return 100
            'D' -> return 500
            'M' -> return 1000
        }
        return 0
    }
}
