/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javase7.nio2.channel;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Masud
 */
public class SelectorTest {

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();

        SocketChannel channel = SocketChannel.open();
        
        channel.configureBlocking(false);

        SelectionKey selKey = channel.register(selector, SelectionKey.OP_READ);

        while (true) {

            int readyChannels = selector.select();

            if (readyChannels == 0) {
                continue;
            }

            Set<SelectionKey> selectedKeys = selector.selectedKeys();

            Iterator<SelectionKey> keyIterator = selectedKeys.iterator();

            while (keyIterator.hasNext()) {

                SelectionKey key = keyIterator.next();

                if (key.isAcceptable()) {
                    // a connection was accepted by a ServerSocketChannel.

                } else if (key.isConnectable()) {
                    // a connection was established with a remote server.

                } else if (key.isReadable()) {
                    // a channel is ready for reading

                } else if (key.isWritable()) {
                    // a channel is ready for writing
                }

                keyIterator.remove();
            }
        }
    }
}
