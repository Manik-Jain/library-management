<<<<<<< Updated upstream
<<<<<<<< Updated upstream:src/main/java/com/example/demo/config/WebSecurityConfig.java
package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.auth.UserAuthentication;
import com.example.demo.auth.UserService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource datasource;
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new UserService();
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncod() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider =new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncod());
		
		return authProvider;
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
//			.antMatchers("/list_users").authenticated()
			
			.antMatchers("/addbook").authenticated()
			.antMatchers("/showbook").authenticated()
//			.anyRequest().authenticated()
			.anyRequest().permitAll()
			.and()
			.formLogin()
				.usernameParameter("email")
				.defaultSuccessUrl("/home")
				.permitAll()
			.and()
			.logout().permitAll()
			.logoutSuccessUrl("/").permitAll();
	}

	
}
========
package com.group5.librarymanagement.config;
=======
package com.example.demo.config;
>>>>>>> Stashed changes

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

<<<<<<< Updated upstream
import com.group5.librarymanagement.auth.UserAuthentication;
import com.group5.librarymanagement.auth.UserService;
=======
import com.example.demo.auth.UserAuthentication;
import com.example.demo.auth.UserService;
>>>>>>> Stashed changes

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource datasource;
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new UserService();
	}
	
	@Bean
<<<<<<< Updated upstream
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider =new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(encodePwd());
=======
	public BCryptPasswordEncoder passwordEncod() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider =new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncod());
>>>>>>> Stashed changes
		
		return authProvider;
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
<<<<<<< Updated upstream
			
			.antMatchers("/addbook").authenticated()
			.antMatchers("/showbook").authenticated()
			.antMatchers("/book").authenticated()
			.antMatchers("/search").authenticated()
=======
//			.antMatchers("/list_users").authenticated()
			
			.antMatchers("/addbook").authenticated()
			.antMatchers("/showbook").authenticated()
>>>>>>> Stashed changes
//			.anyRequest().authenticated()
			.anyRequest().permitAll()
			.and()
			.formLogin()
<<<<<<< Updated upstream
				.loginPage("/login")
				.permitAll()
//				.usernameParameter("email")
=======
				.usernameParameter("email")
>>>>>>> Stashed changes
				.defaultSuccessUrl("/home")
				.permitAll()
			.and()
			.logout().permitAll()
			.logoutSuccessUrl("/").permitAll();
	}

<<<<<<< Updated upstream
	@Bean
	public BCryptPasswordEncoder encodePwd() {
		return new BCryptPasswordEncoder();
	}
	
}
>>>>>>>> Stashed changes:src/main/java/com/group5/librarymanagement/config/WebSecurityConfig.java
=======
	
}
>>>>>>> Stashed changes
