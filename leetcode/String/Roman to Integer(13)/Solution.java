class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int prevSymbol = -1;
        for (int i = s.length()-1; i >= 0; i--) {
            int symbol = symbolToInt(s.charAt(i));
            if(prevSymbol>symbol) {
                result-=symbol;
                prevSymbol = -1;
                continue;
            }else {
                result+=symbol;
            }
            prevSymbol = symbol;
        }
        return result;
    }

    public static int symbolToInt(char c) {
        switch (c) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
        }
        return -1;
    }
}
