package gradle.cucumber;

public class Label implements Content {
    private final String value;

    public Label(String label) {
        this.value = label;
    }

    @Override
    public Object getCell() {
        return this.value;
    }
}
