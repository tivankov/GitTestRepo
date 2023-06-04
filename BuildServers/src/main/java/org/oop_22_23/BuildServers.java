package org.oop_22_23;

import java.util.HashMap;
import java.util.List;

public class BuildServers {

    private static String[] serverOrder = {"AuthenticationServer", "FileServer", "WebServer"};


    public static HashMap<String, Integer> countServerTypes(List<Server> servers) {
        HashMap<String, Integer> serverList = new HashMap<>();
        int cnt = 0;
        for (Server server : servers){
            String serverType = server.getClass().getSimpleName();
            if (serverList.containsKey(serverType)){
                serverList.put(serverType, cnt++);
            }else {
                serverList.put(serverType, 1);
            }
        }
        return serverList;
    }

    public static void createServers(List<Server> servers, int numServers, int port, String ipAddr) {
        int startIndex = servers.size() % serverOrder.length;
        for (int i = 0; i < numServers; i++) {
            int index = (startIndex + i) % serverOrder.length;
            Server server = getServerBasedOnOrder(index, port, ipAddr);
            servers.add(server);
        }
    }


    public static Server getServerBasedOnOrder(int index, int port, String ipAddr) {
        Server server = null;
        if (index == 0){
            server = new AuthenticationServer(port, ipAddr);
        }else if(index == 1){
            server = new FileServer(port, ipAddr);
        }else if(index == 2){
            server = new WebServer(port, ipAddr);
        }else {
            System.out.println("Krivi unos za odabir servera");
        }
        return server;
    }
}
