class Solution {
    public int longestValidParentheses(String s) {
        int ans=0,last = s.length();
        Stack<Pair<Character,Integer>> stk = new Stack();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==')'&&stk.size()!=0&&stk.peek().getKey()=='(')
                stk.pop();
            else
                stk.push(new Pair(s.charAt(i),i));
        }
        if(stk.size()==0)
            return s.length();
        while(!stk.isEmpty()){
            ans= Math.max(ans,last-stk.peek().getValue()-1);
            last = stk.pop().getValue();
        }
        ans= Math.max(ans,last-0);
        return ans;
    }
}