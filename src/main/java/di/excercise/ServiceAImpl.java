package di.excercise;

import di.excercise.services.Helper;
import di.excercise.services.Helper1;
import di.excercise.services.Helper2;
import di.excercise.services.ServiceB;

public class ServiceAImpl implements ServiceA {
    
    @Override
    public int doSomething(String arg) {
        ServiceB svcB = new ServiceB();
        int result = svcB.doSomethingDifferent(arg + "123");

        Helper helper;
        if("2".equals(System.getenv("HELPER_VERSION"))) {
            helper = new Helper2();
        } else {
            helper = new Helper1();
            
        }
        result += helper.help(arg);

        return result;
    }
}
