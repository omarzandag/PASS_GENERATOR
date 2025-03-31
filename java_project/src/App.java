import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        generated generated = new generated();
        for(int i = 0 ; i<5 ; i++){
            System.out.println(generated.generatedPass() + "\n");
        }
    }
}
