package com.example.oauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;

/**
 * @author mszarlinski on 2015-10-12.
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    private static final String RESOURCE_ID = "person";

    private static final String CLIENT_ID = "mszarl";

    private static final String SECRET = "secret";

    private static final String ROLE_USER = "ROLE_USER";


    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(final ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient(CLIENT_ID)
                .secret(SECRET)
                .authorizedGrantTypes("password")
                .resourceIds(RESOURCE_ID)
                .authorities(ROLE_USER)
                .scopes("read", "write");
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints)
            throws Exception {
        endpoints.authenticationManager(authenticationManager).accessTokenConverter(
                defaultAccessTokenConverter());
    }

    @Bean
    public DefaultAccessTokenConverter defaultAccessTokenConverter() {
        return new DefaultAccessTokenConverter();
    }
}
