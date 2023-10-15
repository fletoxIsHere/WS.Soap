package org.moon.webService;

import jakarta.xml.ws.Endpoint;
public class server {

    public static void main(String[] args) {
      Endpoint.publish("http://0.0.0.0:3006/",new BanqueService() );
      System.out.println("web service deployed http://0.0.0.0:3005");
    }
}
