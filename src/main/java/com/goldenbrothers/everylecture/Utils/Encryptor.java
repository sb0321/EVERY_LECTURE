package com.goldenbrothers.everylecture.Utils;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class Encryptor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StandardPBEStringEncryptor enc = new StandardPBEStringEncryptor();
		enc.setAlgorithm("PBEWithMD5AndDES");
	}

}
