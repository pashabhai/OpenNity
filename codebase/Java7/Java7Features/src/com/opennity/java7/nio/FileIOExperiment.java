package com.opennity.java7.nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

/**
 * Using BufferedRedaer and FileReader are almost same.
 * Using BufferedRedaer is equivalent to specifying a buffer size in  FileReader
 * Using BufferedReader's readLine method is the slowest way of reading a file.
 * @author prashant.purkar
 *
 */

public class FileIOExperiment {


	public static void main(String[] args) {
		readFile();
		readFileUsingBuffer();

	}


	public static void readFile(){
		FileReader fr = null;
		BufferedReader t= null;
	try{
		long  timeStart = Calendar.getInstance().getTimeInMillis();

		File f = new File("d:/helloworld.txt");
		fr = new FileReader(f);
		//t = new BufferedReader(fr);


		String fileContent = "";

		char [] cbuf = new char[1024*6];

		while(fr.read(cbuf)!=-1){
			//System.out.println("buf"+new String(cbuf));
			fileContent += new String(cbuf);
		}

//		System.out.println("printing file"+fileContent);
		long  timeEnd = Calendar.getInstance().getTimeInMillis();

		System.out.println("time to execute"+(timeEnd- timeStart));

		}catch(IOException ioe){
			System.out.println("reading file  exception"+ioe);
		}finally{
			try {

				if(fr!=null )
					fr.close();



			} catch (Exception e) {
				System.out.println("closing file  exception"+e);
			}

		}

	}


	public static void readFileUsingBuffer(){
		FileReader fr = null;
		BufferedReader t= null;
	try{
		long  timeStart = Calendar.getInstance().getTimeInMillis();

		File f = new File("d:/helloworld.txt");
		fr = new FileReader(f);
		t = new BufferedReader(fr);


		String fileContent="",tmp = "";

		char [] cbuf = new char[1024*6];

		while((tmp = t.readLine())!=null){
		//while(t.read(cbuf)!=-1){
			//System.out.println("buf"+new String(cbuf));
		//	fileContent += new String(cbuf);
			fileContent += tmp;
		}

//		System.out.println("printing file"+fileContent);
		long  timeEnd = Calendar.getInstance().getTimeInMillis();

		System.out.println("time to execute"+(timeEnd- timeStart));

		}catch(IOException ioe){
			System.out.println("reading file  exception"+ioe);
		}finally{
			try {

				if(t!=null )
					t.close();



			} catch (Exception e) {
				System.out.println("closing file  exception"+e);
			}

		}

	}
}
