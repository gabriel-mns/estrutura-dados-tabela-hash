public class Util {
    
    public static int getLength(Object[] array){

        int qtde = 0;

        for (Object object : array) {
            qtde++;
        }

        return qtde;

    }

}
