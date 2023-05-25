package org.oop_22_23;

/**
 * Class Server is an abstract class that represents a server.
 * @version 1.0.0
 */
public abstract class Server {
    
    
     // dodati pripade modifikatore pristupa
    int id;
    int port;
    String ipAddr;
    static int cntrID = 10;

    String disableConn;
    
    // kreirati konstruktor, ali paziti na modifikator pristupa!!!
   
    


    protected void startServer(){
        System.out.println(this.getClass().getSimpleName() + " starting server on port: " + port + " and ip address: " + ipAddr);
    }

    protected void stopServer(){
        System.out.println(this.getClass().getSimpleName() + " stopping server on port: " + port + " and ip address: " + ipAddr);
    }

    protected void enablingConnection(){
        System.out.println(this.getClass().getSimpleName() + " enabling connection on port: " + port + " and ip address: " + ipAddr);
    }

    protected abstract void disableConnection();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "port=" + port +
                ", ipAddr='" + ipAddr + '\'' +
                '}';
    }

    protected String getDisableConn() {
        return disableConn;
    }
}
