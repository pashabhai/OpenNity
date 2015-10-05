package com.opennity.java7.nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @see http://tutorials.jenkov.com/java-nio/overview.html
 * File handling operations using NIO
 * @author prashant.purkar
 *
 */
public class NewIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readNIOFile();
	}


	public static void readNIOFile(){

		try{
		RandomAccessFile aFile = new RandomAccessFile("d:/helloworld.txt", "r");
		FileChannel inChannel = aFile.getChannel();

		ByteBuffer  buf = ByteBuffer.allocate(1024);

		int bytesRead = inChannel.read(buf);

		while(bytesRead!=-1){

			System.out.println("Read "+bytesRead);
			buf.flip();

		      while(buf.hasRemaining()){
		          System.out.print((char) buf.get());
		      }

		      buf.clear();
		      bytesRead = inChannel.read(buf);
		    }
		    aFile.close();

		}catch(Exception ex){
			System.out.println(ex);
		}

	}

}
