package com.org.inventorymanagement.Configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.csrf.CsrfFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtAuthenticationEntryPoint authenticationEntryPoint;

    @Autowired
    public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception{

        System.out.println("configure authentication called");
        authenticationManagerBuilder.userDetailsService(this.userDetailsService).passwordEncoder(PasswordEncoder());
    }

    @Bean
    public PasswordEncoder PasswordEncoder(){

        System.out.println("password encoder called");

        return new BCryptPasswordEncoder();
    }


    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {

        System.out.println("authentication manager bean called");
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        System.out.println("http security called");

        http.csrf().disable().exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).and().
                sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().
                authorizeRequests().
                antMatchers("/checkEmail").permitAll().
                antMatchers("/registration").permitAll().
                antMatchers("/login").permitAll().
                antMatchers(HttpMethod.OPTIONS).permitAll().
                anyRequest().authenticated();


        http.addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class).
                addFilterAfter(new CsrfHeaderFilter(), CsrfFilter.class);

        http.headers().cacheControl();
        http.headers().httpStrictTransportSecurity().includeSubDomains(true).maxAgeInSeconds(3600);
    }

    @Bean
    public AuthenticationTokenFilter authenticationTokenFilterBean(){

        return new AuthenticationTokenFilter();
    }


}
