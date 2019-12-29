package com.goldenbrothers.everylecture.Utils;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Encryptor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StandardPBEStringEncryptor enc = new StandardPBEStringEncryptor();
		enc.setAlgorithm("PBEWithMD5AndDES");
		enc.setPassword("goldenbrothers");
		
		System.out.println(enc.encrypt("org.mariadb.jdbc.Driver"));
		System.out.println(enc.encrypt("jdbc:maraidb://every-lecture.iptime.org:3306/test"));
		System.out.println(enc.encrypt("test"));
		System.out.println(enc.encrypt("1234"));
	}

}
