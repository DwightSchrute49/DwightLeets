class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ans = new Stack <>();
        for(String i : tokens){
            if(i.equals("+")){
                int b = ans.pop();
                int a = ans.pop();
                ans.push(a+b);
            }
            else if(i.equals("-")){
                int b = ans.pop();
                int a = ans.pop();
                ans.push(a-b);
            }
            else if(i.equals("*")){
                int b = ans.pop();
                int a = ans.pop();
                ans.push(a*b);
            }
            else if(i.equals("/")){
                int b = ans.pop();
                int a = ans.pop();
                ans.push(a/b);
            }
            else {
                ans.push(Integer.parseInt(i));
            }
        }
        return ans.pop();
    }
}