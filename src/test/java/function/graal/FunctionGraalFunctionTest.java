package function.graal;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionGraalFunctionTest {

    @Test
    public void testFunction() throws Exception {
        EmbeddedServer server = ApplicationContext.run(EmbeddedServer.class);

        FunctionGraalClient client = server.getApplicationContext().getBean(FunctionGraalClient.class);

        assertEquals(client.index().blockingGet(), "function-graal");
        server.stop();
    }
}
