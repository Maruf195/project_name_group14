public class model{
    private String attribute;
    private String class_field;

    public model(String attribute, String class_field) {
        this.attribute = attribute;
        this.class_field = class_field;
    }

    public String getClass_field() {
        return class_field;
    }

    public void setClass_field(String class_field) {
        this.class_field = class_field;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "model{" +
                "attribute='" + attribute + '\'' +
                ", class_field='" + class_field + '\'' +
                '}';
    }
}