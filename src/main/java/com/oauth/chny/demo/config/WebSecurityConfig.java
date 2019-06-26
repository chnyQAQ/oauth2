package com.oauth.chny.demo.config;

import com.oauth.chny.demo.config.oauth.CustomAuthenticationProvider;
import com.oauth.chny.demo.config.oauth.MyCustomUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /*-------------实例AuthenticationManager 1.暴露UserDetailsService------------------*/
    /*@Autowired
    DataSource dataSource;

    *//**
     * 查询数据库中的users表进行用户名密码匹配
     * users：username，password，enabled
     * @return
     *//*
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        return new JdbcUserDetailsManager(this.dataSource);
    }*/


    /*-------------实例AuthenticationManager 2.暴露AuthenticationManager------------------*/

    /*@Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(customAuthenticationProvider());
    }

    @Bean
    public CustomAuthenticationProvider customAuthenticationProvider(){
        return new CustomAuthenticationProvider();
    }
*/

    /*-------------实例AuthenticationManager 3.依赖AuthenticationConfiguration------------------*/
    /*@Bean
    @Override
    public UserDetailsService userDetailsService() {
        return new MyCustomUserDetailsService();
    }*/

    /*-------------实例AuthenticationManager 4.手动连接AuthenticationManager------------------*/
    /*@Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(customAuthenticationProvider());
    }

    @Bean
    public CustomAuthenticationProvider customAuthenticationProvider(){
        return new CustomAuthenticationProvider();
    }*/

    //使授权代码授予流程工作--添加最终用户
    /*@Bean
    @Override
    public UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(
                User.withDefaultPasswordEncoder()
                        .username("chny")
                        .password("chny623020")
                        .roles("USER")
                        .build());
    }
    */

    //
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .authorizeRequests()
                .antMatchers("/message/**").hasAuthority("SCOPE_message:read")
                .anyRequest().authenticated()
                .and()
                .oauth2ResourceServer()
                .jwt();
        // @formatter:on
    }*/
}
