package structural.proxy;

public class RealServer implements ServerSubject {

    public RealServer() {
        // Heavy construction and stuff

        // You probably do not want to call this constructor so many times
    }

    public void connect() {
        // A very heavy function that is required if you want to get info from this server
        System.out.println("Connecting to the real server");
    }

    public void disconnect() {
        System.out.println("Disconnecting from the real server");
    }

    @Override
    public String getInfo() {
        System.out.println("Retrieving information from the real server");
        return "123";
    }


}
