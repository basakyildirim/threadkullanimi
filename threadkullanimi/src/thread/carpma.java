/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.math.BigInteger;

/**
 *
 * <p>  
 *  Javada thread kullanımı 
 * </p>  */ 
public class carpma implements Runnable{ //java da işlem oluşturmak icin yazilmalidir
    private BigInteger sayi1;
    private String sayi2;
    private Sonuc sonuc;
    public carpma(BigInteger sayi1,String sayi2,Sonuc sonuc){ //metodun alacagi deger prototipleri
        this.sayi1=sayi1;
        this.sayi2=sayi2;
        this.sonuc=sonuc;  
}
    @Override //islemin degerleri verildi
    public void run() {
        sonuc.carpma(sayi1, sayi2);
    }    
}


