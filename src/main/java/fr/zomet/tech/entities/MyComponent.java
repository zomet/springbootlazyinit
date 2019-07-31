package fr.zomet.tech.entities;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("MyComponent")
public class MyComponent {

    private final FakeContext fakeContext;

    public MyComponent(FakeContext fakeContext) {
        this.fakeContext = fakeContext;
    }

    @PostConstruct
    private void init() {
        fakeContext.getInitializedBeans().add("MyComponent");
    }
}
