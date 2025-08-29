package com.shamim;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("\n(1) Container Started: The Spring IoC container is initialized.");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        //XmlBeanLifecycle bean = applicationContext.getBean(XmlBeanLifecycle.class);
        BeanAnnotation beanAnnotation = applicationContext.getBean(BeanAnnotation.class);

        System.out.println("(5b) Bean is Ready: The bean is now fully initialized and ready to be used.");

        beanAnnotation.customLogic(); // Step (6)

        applicationContext.close(); // Step (7)
    }
}
