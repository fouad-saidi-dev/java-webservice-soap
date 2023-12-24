package ws;

import jakarta.xml.ws.Endpoint;

public class serverJWS {
    public static void main(String[] args) {

        String url = "http://0.0.0.0:1010/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service deploye sur "+url);
    }
}
