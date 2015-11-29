/**
 * Created by mac on 14/08/2015.
 */
abstract public class Operator {
    String code;

    public Operator(String code) {
        this.code = code;
    }

    abstract public void exec (Interpreter inte);

    @Override
    public String toString() {
        return getClass().getName() + " " + code;
    }
}
