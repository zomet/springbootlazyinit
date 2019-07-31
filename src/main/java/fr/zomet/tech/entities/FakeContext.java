package fr.zomet.tech.entities;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FakeContext {

    private final List<String> initializedBeans = new ArrayList<>();

    public List<String> getInitializedBeans() {
        return initializedBeans;
    }
}
