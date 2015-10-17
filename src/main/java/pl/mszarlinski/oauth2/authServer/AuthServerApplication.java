package pl.mszarlinski.oauth2.authServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 REQUEST TO OBTAIN A TOKEN:

 curl --request POST \
 --url http://localhost:9999/auth-server/oauth/token \
 --header 'authorization: Basic cmVzb3VyY2Utc2VydmVyOnNlY3JldA==' \
 --header 'cache-control: no-cache' \
 --header 'content-type: application/x-www-form-urlencoded' \
 --header 'postman-token: fc77357c-28bd-3ded-750b-5dc3bbfd0e81' \
 --data 'username=mszarl&password=secret&client_id=resource-server&client_secret=&grant_type=password'

 REQUEST TO CHECK A TOKEN:

 curl --request GET \
 --url 'http://localhost:9999/auth-server/oauth/check_token?token=536e65e1-ab87-4b0e-9cd6-1f7e43f7dd1c' \
 --header 'authorization: Basic cmVzb3VyY2Utc2VydmVyOnNlY3JldA==' \
 --header 'cache-control: no-cache' \
 --header 'postman-token: 5eb95cb0-0daf-d4b2-143f-27960c06d978'
 */
@SpringBootApplication
public class AuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
    }
}
