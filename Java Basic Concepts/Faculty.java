public enum Faculty {
    ENGENNERING("Engineering"),
    COMPUTING("Computing");

    private String value;

    Faculty(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
