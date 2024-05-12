package calculator.splitter;

import java.util.Objects;

public class Delimiter {

    private String delimiter;

    public Delimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public Delimiter addDelimiter(String delimiter) {
        return new Delimiter(this.delimiter + "|" + delimiter);
    }

    public String delimiter() {
        return delimiter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Delimiter delimiter1 = (Delimiter) o;
        return Objects.equals(delimiter, delimiter1.delimiter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delimiter);
    }
}
