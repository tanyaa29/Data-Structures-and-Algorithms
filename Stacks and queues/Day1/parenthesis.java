class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.isEmpty()) {
                if (ch == ')' || ch == ']' || ch == '}')
                    return false;

            }
            // opening
            if (ch == '{' || ch == '[' || ch == '(')
                st.push(ch);
            // if matched
            else if ((ch == '}' && st.peek() == '{') || (ch == ']' && st.peek() == '[')
                    || (ch == ')' && st.peek() == '('))
                st.pop();
            // not matched
            else if ((ch == '}' && st.peek() != '{') || (ch == ']' && st.peek() != '[')
                    || (ch == ')' && st.peek() != '['))
                return false;

        }
        if (!st.isEmpty())
            return false;
        else
            return true;

    }
}