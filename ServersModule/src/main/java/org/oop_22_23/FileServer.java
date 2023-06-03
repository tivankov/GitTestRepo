package org.oop_22_23;

public class FileServer extends Server{


    protected FileServer(Integer port, String ipAddr) {
        super();
    }

    @Override
    protected void disableConnection() {
        String disableServer = this.getClass().getSimpleName() + " | id: " + this.id + " disabling connection on port: " + port + " and ip address: " + ipAddr;
        System.out.println(disableServer);
        disableConn = disableServer;
    }

}
