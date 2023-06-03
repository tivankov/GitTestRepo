package org.oop_22_23;

public class WebServer extends Server{


    protected WebServer(int port, String ipAddr) {
        super(port, ipAddr);
    }

    @Override
    protected void disableConnection() {
        String disableServer = this.getClass().getSimpleName() + " | id: " + this.id + " disabling connection on port: " + port + " and ip address: " + ipAddr;
        System.out.println(disableServer);
        disableConn = disableServer;
    }

}
