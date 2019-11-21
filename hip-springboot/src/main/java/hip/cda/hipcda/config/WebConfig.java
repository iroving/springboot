//package hip.cda.hipcda.config;
//
//import ctd.oauth.filter.SampleOAuthFilter;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
//@Configuration//用来定义 DispatcherServlet 应用上下文中的 bean、
//@EnableWebMvc
//@ComponentScan
//public class WebConfig extends WebMvcConfigurationSupport {
//
//    @Bean
//    public FilterRegistrationBean SenseSsoOauthWebFilterFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        // 创建上面的自定义的WebFilter对象
//        registration.setFilter(new SampleOAuthFilter());
//        registration.addUrlPatterns("/*");
//        registration.addInitParameter("mode", "true");
//        // 拦截以xxx结尾的请求，多个以","隔开
//        registration.addInitParameter("suffix", "main");
//        registration.addInitParameter("exclude-suffix", ".jsonRequest");
//        registration.setName("SampleFilter");
//        // 启动时候的优先级
//        registration.setOrder(1);
//        return registration;
//    }
//
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        super.addResourceHandlers(registry);
//    }
//}