package org.oop_22_23;

import java.util.List;
import java.util.ArrayList;

public class Main {

    // Ovdje možete istestirati BuildServers klasu
    public static void main(String[] args) {
        List<Server> servers = new ArrayList<>();
//        BuildServers.getServerBasedOnOrder(1,8000,"192.168.1.1");
        BuildServers.createServers(servers,2,8000,"192.168.1.2");
        BuildServers.createServers(servers,0,8000,"192.168.1.3");
        BuildServers.createServers(servers,1,8000,"192.168.1.4");
        BuildServers.countServerTypes(servers);
    }
}
