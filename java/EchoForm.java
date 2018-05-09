package sample.java;

import java.io.Serializable;

import org.hibernate.validator.NotNull;
import org.hibernate.validator.Size;

public class EchoForm implements Serializable {

    @NotNull // (1)
    @Size(min = 1, max = 5) // (2)
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
