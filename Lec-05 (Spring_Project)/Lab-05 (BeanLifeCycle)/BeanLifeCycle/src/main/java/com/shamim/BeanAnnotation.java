package com.shamim;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class BeanAnnotation {
    private Laptop laptop;

    public BeanAnnotation() {
        System.out.println("(2) Bean Instantiated by Annotation way: The container creates an instance of the bean.");
    }

    // Setter Injection
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("(4) Dependencies Injected: Laptop has been set into Annotation BeanLifecycle.");
    }

    @PostConstruct
    public void init(){
        System.out.println("(5) Custom init() method: Called via init-method in XML.");
    }

    public void customLogic() {
        System.out.println("(6) Custom utility method: Executing custom business logic.");
        laptop.compileCode();
    }

    @PreDestroy
    public void destroy(){
        System.out.println("(7) Custom destroy() method: Called via destroy-method in XML when container shuts down.");
    }
}
