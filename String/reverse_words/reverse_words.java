class Solution {
    public String reverseWords(String s) {
        int l = s.length();
        int i = 0;
        String res = new String();
        while (i < l) {
            while (i < l && s.charAt(i) == ' ')
                i++;
            if (i >= l)
                break;
            int j = i + 1;
            while (j < l && s.charAt(j) != ' ')
                j++;
            String sub = s.substring(i, j);
            if (res.length() == 0)
                res = sub;
            else
                res = sub + " " + res;
            i = j + 1;
        }
        return res;

    }

}