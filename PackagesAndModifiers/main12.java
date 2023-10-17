package PackagesAndModifiers;
import _arithmeticoperators.*;
import _permanentValue.*;
public class main12 {
    public static void main(String[] args) {
        
        //code 1
        _arithmeticoperators m = new _arithmeticoperators();
        m.add(1, 20); // it should be accessed in static way > is still be accessed but it make the code confusing
        _arithmeticoperators.add(1, 2); // this is the static way
        _arithmeticoperators.add(3, 3);
        System.out.println();

        //code 2
        permanentValue p = new permanentValue(); // p.pi wont work becuase pi is final, the value must not change
        double pi = permanentValue.pi;
        System.out.println(pi);


        

    }
}
