class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // Character[] brackets = new Character["{","}", "[", "]", "(", ")"];
        
        for(Character c : s.toCharArray()){
            if((c == '{')|| (c == '[')|| (c == '(')){
                stack.push(c);
            } else{
                if(stack.empty()){
                return false;}
                Character openBr = stack.pop();
                if((c == '}' && openBr !='{') 
                ||(c == ']' && openBr !='[')
                ||(c == ')' && openBr !='(')){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
