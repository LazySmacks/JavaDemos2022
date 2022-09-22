public class Main {
    public static void main(String[] args) {

        //For döngüsü için
        for(int i=0; i<12;i+=3){
            System.out.println(i);
        }
        System.out.println(" For için döngü sona erdi");

        //While
        int i =0;
        while(i<12){
            System.out.println(i);
            i+=3;
        }
        System.out.println(" While için döngü sona erdi");

        //Do-While
        int a=2;
        do {
            System.out.println(a);
            a+=2;
        } while(a<=10);
        System.out.println(" Do-While için döngü sona erdi");





    }
}