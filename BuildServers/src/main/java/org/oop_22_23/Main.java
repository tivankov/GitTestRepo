package org.oop_22_23;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {

    // Ovdje možete istestirati BuildServers klasu
    public static void main(String[] args) {
        serversPerType();
    }
    protected static void serversPerType() {
        int[] expected = {4, 3, 4};
        List<Server> servers = new ArrayList<>();
        BuildServers.createServers(servers, 10, 8080, "158.164.88.11");
        HashMap<String, Integer> types = BuildServers.countServerTypes(servers);
        System.out.println("Types of server: " + types);
        int[] actual = new int[types.keySet().size()];
        for (int i = 0; i < types.keySet().size(); i++) {
            actual[i] = types.get(types.keySet().toArray()[i]);
            System.out.println("expected: " + expected);
            System.out.println("actual: " + actual[i]);
        }
    }
}