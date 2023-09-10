import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String respuesta;

        System.out.println("---------------\nCALCULADORA DE IMPUESTOS\n-------------");


        do{
            System.out.print("\nIngrese su salario anual: ");
            Double salario = sc.nextDouble();

            if(salario <= 20000){
                System.out.println("Los impuestos que te tocan pagar por tu salario anual de '"+salario+"' es: "+ (salario*0.10) + "\nSalario neto: " + (salario - (salario*0.10)));
            }else if(salario >= 20001 || salario <= 50000 ){
                System.out.println("Los impuestos que te tocan pagar por tu salario anual de '"+salario+"' es: "+ (salario*0.15) + "\nSalario neto: " + (salario - (salario*0.15)));
            }else if(salario >= 50001 || salario <= 100000){
                System.out.println("Los impuestos que te tocan pagar por tu salario anual de '"+salario+"' es: "+ (salario*0.20) + "\nSalario neto: " + (salario - (salario*0.20)));
            }else if(salario >= 100001){
                System.out.println("Los impuestos que te tocan pagar por tu salario anual de '"+salario+"' es: "+ (salario*0.25) + "\nSalario neto: " + (salario - (salario*0.25)));
            }

            System.out.println("\nDesea calcular uno nuevo?");
            sc.nextLine();
            respuesta = sc.nextLine();

        }while(respuesta != "No");

        sc.close();
    }
}