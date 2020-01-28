//package org.example.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class DriverSecurity extends WebSecurityConfigurerAdapter {
//
//    protected void configure(AuthenticationManagerBuilder auth)throws Exception{
//
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .password("password")
//                .roles("ADMIN")
//                .and()
//                .withUser("developer")
//                .password(encoder().encode("password"))
//                .roles("USER");
//
//
//    }
//
//    private PasswordEncoder encoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public PasswordEncoder getPasswordEndCode()
//    {
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    protected void configure(HttpSecurity http)throws Exception
//    {
//        http.authorizeRequests()
//                .antMatchers("/admin").hasRole("ADMIN")
//                .antMatchers("/developer").hasAnyRole("USER","ADMIN")
//                .antMatchers("/","/testapplication").permitAll()
//                .and().formLogin();
//    }
//
//}
