/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan27092023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;
import farhan27092023.MyClient;

/**
 *
 * @author ASUS ID
 */
public class EchoingServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket client;
        
        try {
            server = new ServerSocket(1234);
        } catch (Exception e) {
            System.out.println("Cannot open socket.");
            System.exit(1);
        }
        
        while (true) {
            try {
                System.out.println();
                System.out.println("Waiting...");
                client = server.accept();
                System.out.println("Client connected.");
                OutputStream clientOut = client.getOutputStream();
                PrintWriter pw = new PrintWriter(clientOut, true);
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));

                // Baca pesan dari klien
                String clientMessage = br.readLine();
                System.out.println("Received message from client: " + clientMessage);

                // Kirim pesan kembali ke klien
                pw.println(clientMessage);

                // Tutup koneksi dengan klien
                client.close();
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }
    }
}
