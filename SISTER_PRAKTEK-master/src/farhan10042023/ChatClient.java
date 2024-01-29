/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farhan10042023;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author ASUS ID
 */
public class ChatClient {
    private static final int server_port = 12345;
    private static final String server_address = "192.168.7.1";
    
    public static void main(String[] args) {
        try {
            Socket socket = new Socket(server_address, server_port);
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scaner = new Scanner(System.in);
            System.out.println("Connect to server, please type 'kalua' to exit");

            new PesanServer(socket, in).start();
            String message;
            while(true){
                message = scaner.nextLine();
                out.println(message);
                if(message.equalsIgnoreCase("kalua")){
                    break;
                }
            }
            socket.close();
        } catch (Exception e) {
        }
    }
    
    public static class PesanServer extends Thread {
        Socket socket;
        BufferedReader in;
        String message;
        public  PesanServer(Socket socket, BufferedReader in){
            this.socket = socket;
            this.in = in;
        }
        
        @Override
        public void run(){
            try {
                while((message=in.readLine())!=null){
                    System.out.println(message);
                }
            } catch (Exception e) {
            }
        }
    }
}
