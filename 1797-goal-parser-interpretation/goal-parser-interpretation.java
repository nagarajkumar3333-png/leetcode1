class Solution {
    public String interpret(String command) {
        String d= command.replace("()","o");
        String f= d.replace("(al)","al");
        return f;
    }
}