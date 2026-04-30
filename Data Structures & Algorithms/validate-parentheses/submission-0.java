class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
        for(char c: s.toCharArray()) {
            switch(c) {
                case '(', '{', '[' -> st.push(c);
                case ')', '}', ']' -> {
                    if(st.isEmpty()) {
                        return false;
                    } else {
                        if(st.pop() != map.get(c)) {
                            return false;
                        }
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
