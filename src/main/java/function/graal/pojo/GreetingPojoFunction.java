package function.graal.pojo;

import function.graal.GreetingService;
import io.micronaut.function.FunctionBean;

import java.util.function.Function;

@FunctionBean("greeting-pojo")
public class GreetingPojoFunction implements Function<GreetingRequest, GreetingResponse> {

    private final GreetingService greetingService;

    public GreetingPojoFunction(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public GreetingResponse apply(GreetingRequest greetingRequest) {
        return new GreetingResponse(greetingService.sayHi(greetingRequest.getName()));
    }
}
