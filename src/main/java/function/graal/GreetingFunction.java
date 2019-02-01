package function.graal;

import io.micronaut.function.FunctionBean;

import java.util.function.Function;

@FunctionBean("greeting")
public class GreetingFunction implements Function<String, String> {

    private final GreetingService greetingService;

    public GreetingFunction(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String apply(String name) {
        return greetingService.sayHi(name);
    }
}
