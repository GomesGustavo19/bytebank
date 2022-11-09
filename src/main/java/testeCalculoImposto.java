import java.io.IOException;

public class testeCalculoImposto {

    public static void main(String[] args) throws IOException {


        SeguroVida seguroVida = new SeguroVida();

        double calculo = seguroVida.getValorImposto(1,20);



        System.out.println(calculo);
    }
}
