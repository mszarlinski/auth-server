package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 curl --request POST \
 --url http://localhost:9999/auth-server/oauth/token \
 --header 'authorization: Basic cmVzb3VyY2Utc2VydmVyOnNlY3JldA==' \
 --header 'cache-control: no-cache' \
 --header 'content-type: application/x-www-form-urlencoded' \
 --header 'postman-token: fc77357c-28bd-3ded-750b-5dc3bbfd0e81' \
 --data 'username=mszarl&password=secret&client_id=mszarl&client_secret=&grant_type=password'
 */
@SpringBootApplication
public class AuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
    }
}
