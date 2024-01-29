/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farhan13092023;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS ID
 */
public class ReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Nama File?");
        String fileName;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        fileName = br.readLine();
        System.out.println("Now Reading From "+ fileName +"....");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "File not found.");
            System.out.println("File not found.");
        }
        try {
            char data;
            int temp;
            do {                
                temp = fis.read();
                data = (char) temp;
                if (temp != -1) {
//                    System.out.print("-"+data);
                    System.out.print(data);
                }
            } while (temp != -1);
        } catch (Exception e) {
            System.out.println("Problem in reading from file.");
        }
    }
    
}
