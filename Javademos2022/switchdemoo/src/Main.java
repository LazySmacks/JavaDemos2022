public class Main {
    public static void main(String[] args) {
// kodlar sağa sola gittiyse yerlerini eskisine getirmek için ctrl+ alt + L ye basarak eski dizine öndürebiliriz
        //case içindeki durumlar dışında bir harf girince default olarak algılayacak ve geçersiz not uyarısı verecektir.
        char grade = 'T';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}