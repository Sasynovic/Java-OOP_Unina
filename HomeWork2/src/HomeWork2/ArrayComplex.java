package HomeWork2;
import java.util.Scanner;

public class ArrayComplex {
    public static void main(String[] args) {
    }

    // inserisci i valori da tastiera
    public void InsertComplexFromTerminal(Complex[] array, int DIM) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < DIM; i++) {
            System.out.print("Inserisci la parte reale: ");
            double reale = input.nextDouble();
            System.out.print("Inserisci la parte immaginaria: ");
            double immaginaria = input.nextDouble();

            array[i] = new Complex(reale, immaginaria);
        }
    }

    // stampa tutti gli elementi
    public void PrintAll(Complex[] array, int DIM) {
        for (int i = 0; i < DIM; i++) {
            array[i].stampa();
        }
    }

    //ordina per modulo gli elementi
    public void BubbleSort(Complex[] array, int DIM) {
        for (int i = 1; i < DIM; i++) {
            for (int j = 0; j < DIM - i; j++) {
                if (array[j].moduloComplex() > array[j + 1].moduloComplex()) {
                    Complex temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // metodo di ricerca
    public boolean search(Complex[] array, int DIM, Complex e, int[] pos) {

        boolean trovato = false;
        pos[0]= -1;
        int indice=0;
        while(!trovato && indice<DIM){
            if(array[indice].getRe()==e.getRe()&&array[indice].getImm()==e.getImm()){
                trovato=true;
                pos[0]=indice;
            } else {
                indice++;
            }
        }
        return trovato;
    }

    // stampa tutti i moduli
    public void PrintAllModules(Complex[] array, int DIM) {
        for (int i = 0; i < DIM; i++) {
            System.out.println(array[i].moduloComplex());
        }
    }

    public void PrintMenu(){
        System.out.println("1. Inserisci i valori da tastiera.");
        System.out.println("2. Stampa tutti gli elementi.");
        System.out.println("3. Ordina per modulo gli elementi.");
        System.out.println("4. Ricerca di un elemento.");
        System.out.println("5. Stampa tutti i moduli.");
        System.out.println("0. Esci.");
    }
}