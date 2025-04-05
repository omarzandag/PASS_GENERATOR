import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        generated generated = new generated();
            System.out.println("The password Generated is : \n");
            System.out.println(generated.generatedPass() + "\n");
    }
}
