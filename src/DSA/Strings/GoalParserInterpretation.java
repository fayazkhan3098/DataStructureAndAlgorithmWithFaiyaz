package DSA.Strings;
// https://leetcode.com/problems/goal-parser-interpretation/
class GoalParserInterpretation {
    public static void main(String[] args) {

        System.out.println(interpret("G()()()()(al)"));
    }
    // this function has more complexity
    public static String interpret(String command) {
    command = command.replaceAll("\\(\\)","o");
    command = command.replaceAll("\\(al\\)","al");
        
    return command;}

    public static String interpret1(String command){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i)=='G'){
                str.append('G');
            }else if (command.charAt(i)=='(' && command.charAt(i+1)==')'){
                str.append('o');
                i++;
            }else {
                str.append("al");
                i+=3;
            }
        }
        return str.toString();
    }
}