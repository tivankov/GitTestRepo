package org.oop_22_23;

public class AuthenticationServer extends Server{
    protected AuthenticationServer(int port, String ipAddr){
        super(port, ipAddr);
        this.port = port;
        this.ipAddr = ipAddr;
    }
    @Override
    protected void disableConnection() {
        String disableServer = this.getClass().getSimpleName() + " | id: " + this.id + " disabling connection on port: " + port + " and ip address: " + ipAddr;
        System.out.println(disableServer);
        disableConn = disableServer;
    }

}
