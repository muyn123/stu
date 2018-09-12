package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignRunApp {
		public static void main(String[] args) {
			SpringApplication.run(FeignRunApp.class, args);
		}
}
