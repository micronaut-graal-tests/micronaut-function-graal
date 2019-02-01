package function.graal;

import javax.inject.Singleton;

@Singleton
public class GreetingService {

    public String sayHi(String name) {
        return "Hello " + name;
    }
}
