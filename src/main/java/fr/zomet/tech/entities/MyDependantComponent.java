package fr.zomet.tech.entities;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("MyDependantComponent")
public class MyDependantComponent {

    private final MyComponent myComponent;
    private final FakeContext fakeContext;

    public MyDependantComponent(MyComponent myComponent, FakeContext fakeContext) {
        this.myComponent = myComponent;
        this.fakeContext = fakeContext;
    }

    @PostConstruct
    private void init() {
        fakeContext.getInitializedBeans().add("MyDependantComponent");
    }
}
