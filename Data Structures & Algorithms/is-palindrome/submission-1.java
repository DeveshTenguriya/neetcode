class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str= new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(s.toLowerCase().charAt(i));
            }
        }

        int a=0;
        int b= str.length()-1;

        while(a<b){
            if(str.charAt(a)!=str.charAt(b)){
                return false;
            }else{
                a++;
                b--;
            }
        }

        return true;
        
    }
}
