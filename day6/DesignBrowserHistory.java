package day6;

import java.util.Stack;

public class DesignBrowserHistory {
    Stack<String> fwd = new Stack<>();
    Stack<String> back = new Stack<>();

    public DesignBrowserHistory(String homepage) {
        back.push(homepage);
    }

    public void visit(String url) {
        back.push(url);
        fwd.clear();
    }

    public String back(int steps) {
        while(back.size() > 1 && steps-- > 0){
            fwd.push(back.pop());
        }

        return back.peek();
    }

    public String forward(int steps) {
        while(!fwd.isEmpty() && steps--> 0){
            back.push(fwd.pop());
        }

        return back.peek();
    }
}
