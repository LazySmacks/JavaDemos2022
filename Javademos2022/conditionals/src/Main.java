public class Main {
    public static void main(String[] args) {

int sayi = 20;
        if(sayi<20){
            System.out.println("Sayı 20'den küçüktür");
            // else i yukarıdaki şartı karşılamadığı zaman ne yazmasını gerektirdiğinde kullanırız sayıyı 21 yapsak
            //else bloğu aktif olacaktır çünkü ıfde bir karşılığı kalmamıştır.
        }else if(sayi==20)
        {
            System.out.println("Sayı 20'ye eşittir");

        }else{System.out.println("Sayı 20'den büyüktür");
        }

    }
}