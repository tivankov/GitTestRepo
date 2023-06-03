package org.oop_22_23;

import java.util.HashMap;
import java.util.List;

public class BuildServers {

    private static String[] serverOrder = {"AuthenticationServer", "FileServer", "WebServer"};


    public static HashMap<String, Integer> countServerTypes(List<Server> servers){
        HashMap<String, Integer> serverList = new HashMap<>();
        for (Server server : servers){
            String serverType = serverList.getClass().getSimpleName();
            if (serverList.containsKey(serverType)){
                int cnt = serverList.get(serverType);
                serverList.put(serverType, cnt++);
            }else {
                serverList.put(serverType, 1);
            }
        }

        return serverList;
    }

    public static void createServers(List<Server> servers, int numServers, int port, String ipAddr){

        if (numServers == 0 || numServers <= 2){
            servers.add(getServerBasedOnOrder(numServers, port, ipAddr));
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