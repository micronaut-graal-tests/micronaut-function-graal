package function.graal;

import io.micronaut.function.FunctionBean;
import java.util.function.Supplier;

@FunctionBean("function-graal")
public class FunctionGraalFunction implements Supplier<String> {

    @Override
    public String get() {
        return "function-graal";
    }
}
