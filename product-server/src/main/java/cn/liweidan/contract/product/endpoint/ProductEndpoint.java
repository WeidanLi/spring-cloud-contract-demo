package cn.liweidan.contract.product.endpoint;

import cn.liweidan.contract.product.dto.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：产品服务端
 *
 * @author liweidan
 * @version 1.0
 * @date 2018-12-11 10:08
 * @email toweidan@126.com
 */
@RestController
public class ProductEndpoint {

    @GetMapping
    public Product uuidOf(@RequestParam("uuid") String uuid) {
        switch (uuid) {
            case "1":
                return new Product("1", "电视");
            case "2":
                return new Product("2", "iPhone");
        }
        return new Product();
    }

}
