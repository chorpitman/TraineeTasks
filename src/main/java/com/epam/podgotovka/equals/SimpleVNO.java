package podgotovka.equals;

public class SimpleVNO {
    private int release;
    private int revision;
    private int patch;


    public SimpleVNO(int release, int revision, int patch) {
        this.release = release;
        this.revision = revision;
        this.patch = patch;
    }

    @Override
    public String toString() {
        return "SimpleVNO{" +
                "release=" + release +
                ", revision=" + revision +
                ", patch=" + patch +
                '}';
    }

}
