class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        stack.push(temperatures.length-1);

        int[] result = new int[temperatures.length];
        result[temperatures.length-1]=0;

        for(int i=temperatures.length-2; i>=0; i--){
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                result[i]=0;
            }else{
                result[i]=stack.peek()-i;
            }

            stack.push(i);
        }

        return result;
    }
}
