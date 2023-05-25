package org.oop_22_23;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuildServersTest {

    @Test
    void getServerBasedOnOrder() {
        Server server = new WebServer(8080, "123.45.68.11");
        Server obtained = BuildServers.getServerBasedOnOrder(2, 8080, "123.45.68.11");
        String expected = server.toString();
        String actual = obtained.toString();
        assertEquals(expected, actual);
    }

    @Test
    void serversPerType() {
        int[] expected = {4, 3, 4};
        List<Server> servers = new ArrayList<>();
        BuildServers.createServers(servers, 10, 8080, "158.164.88.11");
        HashMap<String, Integer> types = BuildServers.countServerTypes(servers);
        int[] actual = new int[types.keySet().size()];
        for (int i = 0; i < types.keySet().size(); i++) {
            actual[i] = types.get(types.keySet().toArray()[i]);
        }
        assertArrayEquals(expected, actual);
    }
}