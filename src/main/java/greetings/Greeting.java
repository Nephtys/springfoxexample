package greetings;

import io.swagger.annotations.ApiModelProperty;

public class Greeting {

    @ApiModelProperty(value = "The request number", position = 0)
    private final long id;

    @ApiModelProperty(value = "The greeting content", position = 1)
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}