package com.shamim;


import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("Hello World!");
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8081);

        Context context = tomcat.addContext("", null);
        tomcat.addServlet(context, "h1", new HelloServlet());
        context.addServletMappingDecoded("/hello", "h1");

        Connector connector = tomcat.getConnector();
        tomcat.start();
        tomcat.getServer().await();
    }
}
