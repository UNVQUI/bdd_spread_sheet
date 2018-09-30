package gradle.cucumber;

public class Anumber implements Content {
    private final Integer value;

    public Anumber(Integer i) {
        this.value = i;
    }

    @Override
    public Object getCell() {
        return this.value;
    }
}
