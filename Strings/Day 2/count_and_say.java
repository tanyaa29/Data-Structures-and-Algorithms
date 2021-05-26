public class Solution {
    public String countAndSay(int n) {

        if (n <= 0) {
            return "";
        }

        String ans = "1";

        while (n > 1) {

            StringBuilder sb = new StringBuilder();

            int count = 0;

            for (int i = 0; i < ans.length(); i++) {
                if (i + 1 == ans.length() || ans.charAt(i) != ans.charAt(i + 1)) {
                    sb.append(++count).append(ans.charAt(i));
                    count = 0;
                } else {
                    count++;
                }
            }
            ans = sb.toString();

            n--;

        }
        return ans;

    }
}class count_and_say {
    
}
