import java.util.Stack;

public class StrukStack {
    private Stack<StrukBelanja26> stack;

    public StrukStack() {
        stack = new Stack<>();
    }

    public void push(StrukBelanja26 struk) {
        stack.push(struk);
    }

    public StrukBelanja26 pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
    
    public void print() {
        for (StrukBelanja26 struk : stack) {
            System.out.println(struk);
        }
        System.out.println("");
    }
}