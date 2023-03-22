package di.excercise.services;

public class Helper2 implements Helper {

    @Override
    public int help(String arg) {
        return arg.length() * arg.length();
    }

}
