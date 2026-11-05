class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new  Stack<>();

        for(int i=0; i<tokens.length; i++){
            String curr = tokens[i];

            if(!curr.equals("+") 
            && !curr.equals("-") 
            && !curr.equals("*") 
            && !curr.equals("/")){
                stack.push(Integer.parseInt(curr));
            }else if(!curr.equals("+") 
            || !curr.equals("-") 
            || !curr.equals("*") 
            || !curr.equals("/")){
                int a=stack.pop();
                int b=stack.pop();

                int result=0;

                if(curr.equals("+")){
                    result=b+a;
                    stack.push(result);
                }

                if(curr.equals("*")){
                    result=b*a;
                    stack.push(result);
                }

                if(curr.equals("-")){
                    result=b-a;
                    stack.push(result);
                }

                if(curr.equals("/")){
                    result=b/a;
                    stack.push(result);
                }
            }
        }

        return stack.pop();
    }
}
