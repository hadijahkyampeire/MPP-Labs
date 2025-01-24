package inheritanceTest;

public abstract class CloudService implements Tasks {
    String serviceName;
    String serviceDescription;

    public abstract void activate();
    public abstract void deactivate();
}
