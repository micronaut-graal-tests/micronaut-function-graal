package function.graal;

import io.micronaut.function.client.FunctionClient;
import io.reactivex.Single;

import javax.inject.Named;

@FunctionClient
public interface FunctionGraalClient {

    @Named("function-graal")
    Single<String> index();

}
