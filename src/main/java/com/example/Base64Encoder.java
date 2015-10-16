package com.example;

import com.google.common.io.BaseEncoding;

/**
 * Created by Maciej on 2015-10-16.
 */
public class Base64Encoder {

    public static void main(String[] args) {
        final String clientId = "mszarl",
                clientSecret = "secret";

        final String base64Auth = BaseEncoding.base64().encode((clientId + ":" + clientSecret).getBytes());
        System.out.println(base64Auth);
    }
}
