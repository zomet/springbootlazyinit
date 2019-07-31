package fr.zomet.tech;

import fr.zomet.tech.entities.FakeContext;
import fr.zomet.tech.entities.MyComponent;
import fr.zomet.tech.entities.MyDependantComponent;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class SpringBootLazyInitTest {

    @Test
    public void test_simple_lazy() {
        ApplicationContext applicationContext = SpringApplication.run(SpringBootLazyInit.class);
        FakeContext fakeContext = applicationContext.getBean(FakeContext.class);
        assertThat(fakeContext.getInitializedBeans()).isEmpty();
        applicationContext.getBean(MyComponent.class);
        assertThat(fakeContext.getInitializedBeans()).containsOnly("MyComponent");
    }

    @Test
    public void test_dependant_lazy() {
        ApplicationContext applicationContext = SpringApplication.run(SpringBootLazyInit.class);
        FakeContext fakeContext = applicationContext.getBean(FakeContext.class);
        assertThat(fakeContext.getInitializedBeans()).isEmpty();
        applicationContext.getBean(MyDependantComponent.class);
        assertThat(fakeContext.getInitializedBeans()).containsExactly("MyComponent", "MyDependantComponent");
    }

}
