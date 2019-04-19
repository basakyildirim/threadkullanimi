/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.math.BigInteger; //buyuk sayilar kutuphanesi
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 *
 * <p>  
 *  Javada thread kullanımı 
 * </p>  */ 
public class Sonuc {
    private final Lock bolge = new ReentrantLock(); //kritik islemler icin
    private BigInteger toplam=new BigInteger("0"); //biginteger degisken olusturma
    private BigInteger carpma=new BigInteger("1");
    private BigInteger sonuc=new BigInteger("0");
    
public BigInteger sonuc(){
 return sonuc; //donecek degisken
}

    public void carpma(BigInteger sayi1,String sayi2){
        bolge.lock(); //Kritik bölge başlangıç
        char arr[] = sayi2.toCharArray(); //sayi2 char diziye donduruldu
        int sayi;
        for(char c:arr){ 
            sayi=c-'0'; //donguden gelen sayi inte cevirilir
            BigInteger bi = BigInteger.valueOf(sayi);//sayi int degerdir bu bigint e cevirilir
            toplam=toplam.add(bi);//toplama eklenir
        }
        carpma=sayi1.multiply(toplam); //sayi1 ile toplam carpilir
        sonuc=carpma;
        try{
 // Veri çöküşünü daha iyi görebilmek için bekleme verildi.
 Thread.sleep(1);
 }
 catch(InterruptedException ex){
 }
 bolge.unlock(); //Kritik bölgeyi kapat.
    }
}
    

