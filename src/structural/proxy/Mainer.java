package structural.proxy;

public class Mainer {
    public static void main(String[] args) {
        ServerSubject serverSubject = new ProxyServer(); // This is a proxy server

        // We want to ask the server for information
        // We do not care who gives us that information since we can only ask the proxy for it

        System.out.println("Trying to retrieve information the first time");
        String info = serverSubject.getInfo();
        System.out.println("Info is: " + info);
        System.out.println("---------\n");


        System.out.println("Trying to retrieve information the second time");
        String secondInfo = serverSubject.getInfo(); // Look that now we might not ask the
                                                    // real server and the request will be handled faster!
        System.out.println("Second info is: " + secondInfo);

    }
}
