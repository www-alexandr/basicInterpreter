import javax.script.ScriptException;

/**
 * Created by mac on 14/08/2015.
 */
public class Let extends Operator {
    public Let(String code) {
        super(code);
    }

    @Override
    public void exec(Interpreter inte) {
        String[] parts = code.split("=");
        try {
            Object val = Expression.eval(inte.getVars(), parts[1]);
            inte.getVars().put(parts[0], Double.parseDouble(val.toString()));
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        inte.next();
    }
}
