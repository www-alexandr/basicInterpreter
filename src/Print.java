import javax.script.ScriptException;

/**
 * Created by mac on 14/08/2015.
 */
public class Print extends Operator {
    public Print(String code) {
        super(code);
    }

    @Override
    public void exec(Interpreter inte) {
        Object res = null;
        try {
            res = Expression.eval(inte.getVars(), code);
            System.out.println(res);

        } catch (ScriptException e) {
            e.printStackTrace();
        }
        inte.next();
    }
}


























