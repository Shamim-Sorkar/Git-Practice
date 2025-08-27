package com.shamim;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanInterface implements InitializingBean, DisposableBean {
    private Laptop laptop;

    public BeanInterface() {
        System.out.println("(2) Bean Instantiated by interface way: The container creates an instance of the bean.");
    }

    // Setter Injection
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("(4) Dependencies Injected: Laptop has been set into XmlBeanLifecycle.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("(5) Custom init() method: Called via init-method in XML.");
    }

    public void customLogic() {
        System.out.println("(6) Custom utility method: Executing custom business logic.");
        laptop.compileCode();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("(7) Custom destroy() method: Called via destroy-method in XML when container shuts down.");
    }
}
