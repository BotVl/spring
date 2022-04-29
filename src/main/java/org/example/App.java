package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = Application.run("org.example", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDesinfector coronaDesinfector = context.getObject(CoronaDesinfector.class);
        coronaDesinfector.start(new Room());
    }
}
