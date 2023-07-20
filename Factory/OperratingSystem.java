public abstract class OperatingSystem {
    private String version;
    private String architecture;

    public OperatingSystem(String version, String architecture); {
        this.version = version;
        this.architecture = architecture;
    }

    public abstract void changeDir(String dir);
    public abstract void removeDir(String dir);
}