// https://leetcode.com/problems/excel-sheet-column-title/
// easy (25 mins)

class Solution {
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        while (n > 0)
        {
            int digit = (n%26 == 0) ? 26 : n%26;
            str.append(getStringForNumber(digit));
            
            n -= digit;
            n = n / 26;
        }
        
        return str.reverse().toString();
    }
    
    String getStringForNumber(int n)
    {
        String res="";
        switch (n)
        {
            case 1:
                res = "A";
                break;
            case 2:
                res = "B";
                break;
            case 3:
                res = "C";
                break;
            case 4:
                res = "D";
                break;
            case 5:
                res = "E";
                break;
            case 6:
                res = "F";
                break;
            case 7:
                res = "G";
                break;
            case 8:
                res = "H";
                break;
            case 9:
                res = "I";
                break;
            case 10:
                res = "J";
                break;
            case 11:
                res = "K";
                break;
            case 12:
                res = "L";
                break;
            case 13:
                res = "M";
                break;
            case 14:
                res = "N";
                break;
            case 15:
                res = "O";
                break;
            case 16:
                res = "P";
                break;
            case 17:
                res = "Q";
                break;
            case 18:
                res = "R";
                break;
            case 19:
                res = "S";
                break;
            case 20:
                res = "T";
                break;
            case 21:
                res = "U";
                break;
            case 22:
                res = "V";
                break;
            case 23:
                res = "W";
                break;
            case 24:
                res = "X";
                break;
            case 25:
                res = "Y";
                break;
            case 26 :
                res = "Z";
                break;
        }
        
        return res;
    }
}
