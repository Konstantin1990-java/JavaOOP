public class ServiceStation {
    private final Serve serve;

    public ServiceStation(Serve serve) {
        this.serve = serve;
    }

    public void service() {
        serve.check();
    }
}