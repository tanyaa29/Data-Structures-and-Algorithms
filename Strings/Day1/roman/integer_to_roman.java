class Solution {
    public String intToRoman(int num) {
        String thousand[] = { "", "M", "MM", "MMM" };
        String hundred[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String tens[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String units[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

        return thousand[(num / 1000)] + hundred[(num % 1000) / 100] + tens[(num % 100) / 10] + units[num % 10];

    }
}