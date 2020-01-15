package co.pragra.b18.drivermanager;

public enum  BroswerType {
    CHROME("chrome"),
    FIREFOX("firefox"),
    IE("ie"),
    SAFARI("safari"),
    EDGE("edge"),
    OPERA("opera");

    private String stringVal;

    BroswerType(String str) {
        this.stringVal = str;
    }

    @Override
    public String toString() {
        return this.stringVal;
    }
}
