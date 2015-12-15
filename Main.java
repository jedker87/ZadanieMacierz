public class Main {


    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        Matrix matrix = new Matrix(n, m);

        System.out.println("Elementy macierzy po utworzeniu: ");
        System.out.println(matrix);                 
        
        matrix.set(0,0,15);
        matrix.set(1,1,15.5);
        matrix.set(2,2,20); 
        
        System.out.println(matrix); 

        System.out.print("Wypisuje element w wierszu 0 i kolumnie 0: ");
        System.out.println(matrix.get(0, 0));

        System.out.print("Suma elementow na przekatnej: ");
        System.out.println(matrix.findSumOnDiagonal()); 

        matrix.set(1, 2, 25);
        
        System.out.println(matrix); 

        System.out.print("Drugi co do wielkosci element macierzy to: ");
        System.out.println(matrix.findSecondMax());     


        System.out.print("Drugi najmniejszy element macierzy to: ");
        System.out.println(matrix.findSecondMin());     


        matrix.fillWithRandomNumbers();

        System.out.println("Elementy macierzy po wypelnieniu jej wartosciami losowymi");
        System.out.println(matrix);                
    }
}
