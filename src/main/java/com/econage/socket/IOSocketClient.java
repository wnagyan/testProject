package com.econage.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

public class IOSocketClient {

    public static void main(String[] args) throws IOException {
        new Thread(() -> {
            try {
                Socket socket = new Socket("127.0.0.1", 8080);
                while (true) {
                    try {
                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        System.out.println("Exception  ====> " + e.getMessage());
                    }
                }
            } catch (IOException e) {
                System.out.println("IOException  ====> " + e.getMessage());
            }
        }).start();
    }
}
