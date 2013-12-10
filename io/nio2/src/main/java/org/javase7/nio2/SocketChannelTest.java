/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javase7.nio2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/**
 *
 * @author Masud
 */
public class SocketChannelTest {
    public static void main(String[] args) throws IOException {
        InetSocketAddress isa = new InetSocketAddress("209.90.206.100", 80);
        InetSocketAddress isa2 = new InetSocketAddress("209.90.206.109", 80);
        
        Selector selector=Selector.open();
        
        SocketChannel channel = SocketChannel.open();
        channel.register(selector, SelectionKey.OP_CONNECT);
        boolean isConnected = channel.connect(isa2);
//        channel.configureBlocking(false);
        System.out.println(isConnected);
        selector.wakeup();
//        if(!channel.isConnectionPending()){
        boolean isConnected2 = channel.connect(isa2);
        System.out.println(isConnected2);
//        }

//        System.out.println(channel.finishConnect());
//        if(channel.isOpen()){
//            channel.close();
//        }
//        System.out.println(channel.isOpen());
    }
}
