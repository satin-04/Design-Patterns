public class OS_Factory {

    private OS_Factory() {

    }

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch(type) {
            case "Linux":
                return new Linux(version,architecture);
                break;
            case "Windows":
                return new Windows(version,architecture);
                break;
            default:
                throw new IllegalArgumentException("OS Not supported");
        }
    }
}