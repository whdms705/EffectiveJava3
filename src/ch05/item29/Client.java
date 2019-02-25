package ch05.item29;

public class Client {
    public static void main(String[] args) {
        String[] test = {"a","b"};
        AfterStack<String> stack = new AfterStack<>();
        for(String arg : test){
            stack.push(arg);
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop().toUpperCase());
        }
    }
}
