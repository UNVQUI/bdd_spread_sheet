package gradle.cucumber;

public class ANumber implements Contenido {

    private final Integer value;

    public ANumber(Integer i) {
        this.value = i;
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
        ANumber o = (ANumber)another;
        return this.value.equals(o.value);
    }
}
