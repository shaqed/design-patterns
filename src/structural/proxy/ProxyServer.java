package structural.proxy;

public class ProxyServer implements ServerSubject {

    private RealServer realServer;
    private String latestInfo;

    public ProxyServer() {
        this.realServer = new RealServer(); // Heavy work, do once - and save it in this class for further use

        // The first time, get information from the real server
        // This is an expensive process, you do not want to do every request!
        this.realServer.connect();
        this.latestInfo = this.realServer.getInfo();
        this.realServer.disconnect();
    }

    @Override
    public String getInfo() {
        boolean enoughTimeHasPassed = false; // If some condition is true

        if (enoughTimeHasPassed) { // Go ask the real server
            this.realServer.connect();
            this.latestInfo = this.realServer.getInfo();
            this.realServer.disconnect();
        }

        // Return the latest info, we didn't have to visit the real server every request!
        return this.latestInfo;
    }
}
