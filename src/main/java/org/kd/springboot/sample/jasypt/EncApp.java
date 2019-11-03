package org.kd.springboot.sample.jasypt;

import com.sun.crypto.provider.SunJCE;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;

import java.security.Provider;
import java.security.Security;

public class EncApp {

    public static void main(String[] args) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        String privateData = "secret-data";
        encryptor.setPassword("some-random-passwprd");
        encryptor.setAlgorithm("PBEWithHmacSHA256AndAES_256");
        encryptor.setIvGenerator(new RandomIvGenerator());
        //encryptor.setProvider(Security.getProvider("SunJCE"));
        //System.out.println(encryptor.encrypt(privateData));

        System.out.println(encryptor.decrypt("1EChn09i49rCuD7erEmEWVAbPZrBRUS4y97/TJJE6RIlFNfHX1f9++7zpeJ1nmtm"));

    }
}
