package gradle.cucumber;

public class ALabel implements Contenido {
    private final String value;

    public ALabel(String label) {
        this.value = label;
    }

    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object another) {
        if ( !this.getClass().equals(another.getClass())) {
            return false;
        }
        ALabel o = (ALabel)another;
        return this.value.equals(o.value);
    }

}
