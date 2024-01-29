/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan11102023;

/**
 *
 * @author ASUS ID
 */
public class Dekripsi {
    public static void main(String[] args) {
        String text = "Ugncocv\"Fcvcpi";
        String temp = "";
        int kurang = 2;
        for(int i=0; i<text.length(); i++){
            int h = (int)(text.charAt(i));
            char t = (char) (h-kurang);
            temp += t;
            System.out.println(h);
        }
        System.out.println(temp);
    }
}
