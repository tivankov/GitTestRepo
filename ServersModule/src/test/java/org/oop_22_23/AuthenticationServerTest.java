package org.oop_22_23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationServerTest {

    @Test
    void testDisableConnection() {
        AuthenticationServer authenticationServer = new AuthenticationServer(8080, "127.168.2.77");
        String expected = "AuthenticationServer | id: " + authenticationServer.id + " disabling connection on port: " + authenticationServer.port + " and ip address: " + authenticationServer.ipAddr;
        authenticationServer.disableConnection();

        assertEquals(expected, authenticationServer.getDisableConn());
    }
}