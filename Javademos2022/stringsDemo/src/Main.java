public class Main {
    public static void main(String[] args) {

        String mesaj = "   Bugün hava çok güzel.   ";
        System.out.println(mesaj);

        /*System.out.println("Eleman Sayısı :" + mesaj.length());
        System.out.println("Eleman sayısı:" + mesaj.charAt(6));
        System.out.println(mesaj.concat(" Yaşasın"));
        // tanımladığımız mesaj ile birleştirmeye yarar .concat eklediğimizde
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("l"));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
// char [] yaptığımız zaman bir dizi oluştururuz ve atadığımız stringle birlikte
        // get chars dersek karakterleri getir abnlamında atadığımız kodun başlangıcını ve
        //bitişini belirleriz 0 da başlasın ve 5. karakterde bitsin anlamında
        System.out.println(mesaj.indexOf('a'));
        //index of da belirttiğimiz charın hangi sıralamada olduğunu anlatır.
        //metin de aratabiliriz çift tırnakla
        //last indexof olan sondan başa aratır.
        System.out.println(mesaj.lastIndexOf("a"));*/
String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));
        //nereden itibaren yazdırayım anlamında substing 2. karakterden itibaren yazdırır.
        //istediğimiz yere kadar yaparsak yanına virgülle beliritiri burda 2 ile 5. karakter
        //arasını alıyor.
        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        // regexin içindeki karateri atla anlamını veriyor. boşluk gördüğü yeri atladı ve
        //alt alta yazdı cümleyi
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        //lower küçük harf yapar upper büyük harf yapar
        System.out.println(mesaj.trim());
        //cümlenin başındaki ve sonundaki boşlukları atmamıza yarıyor

    }
}