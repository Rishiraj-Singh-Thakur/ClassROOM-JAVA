import java.util.*;

import javax.print.DocFlavor.STRING;
public class PushAtBottomSTACK {
    public static void PushAtBottom(Stack<String> s , String data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        String top = s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("this");
        s.push("is");
        s.push("a");
        s.push("code");
        System.out.print(s);
        PushAtBottom(s, "rishi");
        System.out.print(s);
    }
}
