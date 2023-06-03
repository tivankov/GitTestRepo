package org.oop_22_23;

import java.util.HashMap;
import java.util.List;

public class BuildServers {

    private static String[] serverOrder = {"AuthenticationServer", "FileServer", "WebServer"};

    public static HashMap<String, Integer> countServerTypes(List<Server> servers) {
        HashMap<String, Integer> serverTypeCount = new HashMap<>();
        for (Server server : servers) {
            String serverType = server.getClass().getSimpleName();
            serverTypeCount.put(serverType, serverTypeCount.getOrDefault(serverType, 0) + 1);
        }
        return serverTypeCount;
    }

    public static void createServers(List<Server> servers, int numServers, int port, String ipAddr) {
        int startIndex = servers.size() % serverOrder.length; // Osmislite princip za odabir početnog indeksa
        for (int i = 0; i < numServers; i++) {
            int index = (startIndex + i) % serverOrder.length;
            Server server = getServerBasedOnOrder(index, port, ipAddr);
            servers.add(server);
        }
    }

    public static Server getServerBasedOnOrder(int index, int port, String ipAddr) {
        switch (serverOrder[index]) {
            case "AuthenticationServer":
                return new AuthenticationServer(port, ipAddr);
            case "FileServer":
                return new FileServer(port, ipAddr);
            case "WebServer":
                return new WebServer(port, ipAddr);
            default:
                throw new IllegalArgumentException("Invalid server index: " + index);
        }
    }
}
