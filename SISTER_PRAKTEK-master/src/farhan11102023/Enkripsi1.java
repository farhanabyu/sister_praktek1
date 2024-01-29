/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan11102023;

/**
 *
 * @author ASUS ID
 */
public class Enkripsi1 {
    public static void main(String[] args) {
        char[] kr = {
            '0','1','2','3','4','5','6','7','8','9','a','b','c','d','r','f','g','h','i'
            ,'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
        };
        
        String bantu1 = "";
        String text = "Ahmad Zulveron";
        int geser = 3;
        //enkripsi
        char[] cArray1 = (text.toCharArray());
        
        for(char c1 : cArray1){
            for(int i=0; i<kr.length; i++){
                if(c1 == kr[i]){
                    i=i+(geser);
                    if(i>=kr.length){
                        i = i-kr.length;
                    }
                    c1 = kr[i];
                    bantu1 = bantu1 + c1;
                }
            }
        }
        System.out.println("Sebelum : "+text);
        System.out.println("Sesudah : "+bantu1);
    }
}
