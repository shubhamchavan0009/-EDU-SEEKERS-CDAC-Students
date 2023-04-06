//package com.es.config;
//
//import javax.xml.transform.Source;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//import com.es.services.UserService;
//
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfiguration {
//	
//	@Autowired
//	private UserService userService;
//	
//	@Bean
//	public AuthenticationManager authenticationManager(
//	        AuthenticationConfiguration authConfig) throws Exception {
//		 //authenticationProvider();
//	    return authConfig.getAuthenticationManager();
//	}
//
//	
//	
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
//		auth.setUserDetailsService(userService);
//		auth.setPasswordEncoder(passwordEncoder());
//		return auth;
//		
//	}
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//    	http.authenticationProvider(authenticationProvider());                        // provider
//        http.authorizeHttpRequests()
//       
//        .requestMatchers( "/register**","/js/**","/css/**","/img/**").permitAll() //
//        .anyRequest()
//        .authenticated()
//        .and()
//        .formLogin()
//        .loginPage("/login")
//        .permitAll()
//        .and()
//        .logout()
//        .invalidateHttpSession(true)
//        .clearAuthentication(true)
//        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//        .logoutSuccessUrl("/login?logout")
//        .permitAll();
//        return http.build();
//    }
//    
// 
////    @Bean
////    SecurityFilterChain web(HttpSecurity http) throws Exception {
////    	http.authorizeHttpRequests(authorize -> authorize
////    			.requestMatchers("/registartion/**", "/js/**","/css/**","/img/**").permitAll()
////    			//.requestMatchers("/admin/**").hasRole("ADMIN")
////    			//.requestMatchers("/db/**").access(new WebExpressionAuthorizationManager("hasRole('ADMIN') and hasRole('DBA')"))
////    			// .requestMatchers("/db/**").access(AuthorizationManagers.allOf(AuthorityAuthorizationManager.hasRole("ADMIN"), AuthorityAuthorizationManager.hasRole("DBA")))
////    			//.anyRequest().denyAll()
////    		);
////
////    	return http.build();
////    }
// 
//    @Bean
//    public FilterRegistrationBean coresFilter() {
//    	UrlBasedCorsConfigurationSource source =new UrlBasedCorsConfigurationSource();
//    	CorsConfiguration corsConfiguration =new CorsConfiguration();
//    	corsConfiguration.setAllowCredentials(true);
//    	corsConfiguration.addAllowedOriginPattern("*"); 
//    	corsConfiguration.addAllowedHeader("Authorization");
//    	corsConfiguration.addAllowedHeader("Content-Type");
//    	corsConfiguration.addAllowedHeader("Accept");
//    	corsConfiguration.addAllowedHeader("POST");
//    	corsConfiguration.addAllowedHeader("GET");
//    	corsConfiguration.addAllowedHeader("DELETE");
//    	corsConfiguration.addAllowedHeader("PUT");
//    	corsConfiguration.addAllowedHeader("OPTIONS");
//    	corsConfiguration.setMaxAge(3600L);
//    	
//    	
//    	source.registerCorsConfiguration("/**", corsConfiguration);
//    	FilterRegistrationBean bean = new FilterRegistrationBean<>( new CorsFilter(source));
//    	return bean;
//    }
//}