import com.dsa.patterns.Pattern;
import com.dsa.patterns.impl.Pattern2impl;
import com.dsa.patterns.impl.Pattern3impl;
import com.dsa.patterns.impl.Pattern4impl;
import com.dsa.patterns.impl.Pattern5impl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /**
         * Printing Patterns
         * **/
        Pattern pattern = new Pattern5impl();
        pattern.printPattern(0);
    }
}