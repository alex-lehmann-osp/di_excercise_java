package di.excercise;

public class Main {

    public static void main(String[] args) {
        ServiceA service = new ServiceAImpl();
        int result = service.doSomething(args[0]);
        System.out.println("Result: " + result);
    }
}
