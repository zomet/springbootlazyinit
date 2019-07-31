package fr.zomet.tech.configuration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        Stream.of(beanFactory.getBeanDefinitionNames())
//                .forEach(beanName -> beanFactory.getBeanDefinition(beanName).setLazyInit(true));
    }
}
