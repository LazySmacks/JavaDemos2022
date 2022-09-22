public class Main {
    public static void main(String[] args){
        int sayi1 = 5;
        int sayi2 = 30;
        int sayi3 = 7;
        int enBüyük = sayi1;
        //en büyük ve en küçük sayıyı bulunuz ?
        if (enBüyük > sayi2 & enBüyük> sayi3) {
            System.out.println("En büyük sayi: "+ enBüyük);
        } else if (sayi2 > enBüyük & sayi2 > sayi3) {
            System.out.println("En büyük sayi: "+ sayi2);
        }else{
            System.out.println("En büyük sayi: "+ sayi3);
            //videodaki gibi yapacak olursak
            if(enBüyük<sayi2){
                enBüyük= sayi2;
            }
            if(enBüyük<sayi3){
                enBüyük = sayi3;
            }
            System.out.println("En büyük:"+ enBüyük);
        }
        }
    }