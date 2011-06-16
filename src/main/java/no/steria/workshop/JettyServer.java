package no.steria.workshop;

import java.net.InetAddress;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;

public class JettyServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8086);
        server.addHandler(new WebAppContext("src/main/webapp", "/"));
        server.start();

        String ip = InetAddress.getLocalHost().getHostAddress();
        int port = server.getConnectors()[0].getLocalPort();
        
        System.out.println("Started server on http://" + ip + ":" + port + "/");
    }
}
