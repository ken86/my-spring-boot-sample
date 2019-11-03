package org.kd.springboot.sample.jasypt;

import java.security.Provider;
import java.security.Security;

public class CipherList {

    public static void main(String[] args) {
        for (Provider provider: Security.getProviders()) {
            System.out.println(provider.getName());
            for (String key: provider.stringPropertyNames())
                System.out.println("\t" + key + "\t" + provider.getProperty(key));
        }
    }
}
