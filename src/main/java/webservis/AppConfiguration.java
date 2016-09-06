package webservis;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import webservis.config.DispatcherConfig;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "webservis")
@Import({ WebInitializer.class, DispatcherConfig.class})
public class AppConfiguration {

}
