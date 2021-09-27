import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int z, yes = 0;
        float suma = 0, promedio = 0;
        double total = 0, mayores = 0, menores = 0;
        boolean fin = false;

        String vector, datos;
        System.out.print("");
        vector = lectura.nextLine();
        z = Integer.parseInt(vector);

        int v[] = new int[z];
        datos = lectura.nextLine();
        String lista[] = datos.split(" ");

        for (z = 0; z < lista.length; z++){
            v[z] = Integer.parseInt(lista[z]);
            
        }

        for (int x = 0; x < v.length; x++){
            suma = suma + v[x];
            promedio = suma / v.length;
            if (v[x] >= 14.1){
                mayores++;
            }
            else if (v[x] < 14.1){
                menores++;
                total = (menores * 100) / v.length;
            }
        }

        if (promedio >= 80.1 && promedio <= 100){
            System.out.println("INVIABLE SANITARIAMENTE");
        }
        else if (promedio < 80.1 && promedio >= 35.1){
            System.out.println("ALTO");
        }
        else if (promedio < 35.1 && promedio >= 14.1){
            System.out.println("MEDIO");
        }
        else if (promedio < 14.1 && promedio >= 5.1){
            System.out.println("BAJO");
        }
        else if (promedio < 5.1 && promedio >= 0){
            System.out.println("SIN RIESGO");
        }

        System.out.println(String.format("%.2f", total));
       
        while (yes < z && fin == false){
            if (v[yes] <= 5.1){
                fin = true;
            }
            else {
                yes++;
            }
        }

        if (fin == false){
            System.out.println("NO");
        }
        else{
            System.out.println("SI");
        }
        lectura.close();
    }
}