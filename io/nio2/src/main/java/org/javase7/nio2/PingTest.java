/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javase7.nio2;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;

/**
 *
 * @author Masud
 */
public class PingTest {
    
    public static void main(String[] args) throws IOException {
//        InetSocketAddress isa = new InetSocketAddress("", 80);
//        InetSocketAddress isa2 = new InetSocketAddress("209.90.206.109", 80);
        
//        InetAddress inet = InetAddress.ge("http://google.com");
             
        InetAddress inet2 = InetAddress.getByName("209.90.206.109");
        
//        System.out.println(inet.isReachable(500));
        System.out.println(inet2.isReachable(500));
    }
}
