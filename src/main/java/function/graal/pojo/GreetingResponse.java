package function.graal.pojo;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class GreetingResponse {

    private String msg;

    public GreetingResponse() {
    }

    public GreetingResponse(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
