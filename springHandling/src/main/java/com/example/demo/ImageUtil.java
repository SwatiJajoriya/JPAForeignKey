package com.example.demo;
import java.io.ByteArrayOutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class ImageUtil {

	//compress an image -util.zip.Deflater
	//take the data in the byte , compress it , make a write process on the stream of ByteArray
	public static byte[] compressImage(byte[] data) {
		Deflater deflater=new Deflater();
		deflater.setLevel(Deflater.BEST_COMPRESSION);
		deflater.setInput(data);
		deflater.finish();
		ByteArrayOutputStream out=new ByteArrayOutputStream(data.length);
		byte[] tmp=new byte[4*1024];
		while(!deflater.finished()) {
			int size=deflater.deflate(tmp);
			out.write(tmp,0,size);
		}
		return out.toByteArray();
		
	}
	
	//decompress an image-util.zip.Inflater
	//takes the file , decompress it , ready with the ByteArrayStream
	public static byte[] decompressImage(byte[] data) throws DataFormatException {
		Inflater inflater=new Inflater();
		inflater.setInput(data);
		ByteArrayOutputStream out=new ByteArrayOutputStream(data.length);
		byte[] tmp=new byte[4*1024];
		while(!inflater.finished()) {
			int size=inflater.inflate(tmp);
			out.write(tmp,0,size);
		}
		return out.toByteArray();
	}
}

