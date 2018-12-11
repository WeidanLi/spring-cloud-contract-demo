package cn.liweidan.contract.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description：产品启动器
 *
 * @author liweidan
 * @version 1.0
 * @date 2018-12-11 10:06
 * @email toweidan@126.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
