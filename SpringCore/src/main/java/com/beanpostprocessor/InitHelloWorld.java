package com.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor{

    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("AfterInitialization : " + beanName);
        return bean;
    }
 

    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return bean;
    }
}
