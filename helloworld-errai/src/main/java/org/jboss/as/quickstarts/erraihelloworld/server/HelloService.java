package org.jboss.as.quickstarts.erraihelloworld.server;

/**
 * A simple CDI service that says hello to someone.
 * 
 * @author Pete Muir
 */
public class HelloService {

   String createHelloMessage(String name) {
      return "Hello " + name + "!";
   }

}
