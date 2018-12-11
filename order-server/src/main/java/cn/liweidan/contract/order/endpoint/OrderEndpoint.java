package cn.liweidan.contract.order.endpoint;

import cn.liweidan.contract.order.client.ProductClient;
import cn.liweidan.contract.order.dto.Order;
import cn.liweidan.contract.order.dto.ProductDesciption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Description：订单控制器
 *
 * @author liweidan
 * @version 1.0
 * @date 2018-12-11 10:30
 * @email toweidan@126.com
 */
@RestController
public class OrderEndpoint {

    private ProductClient productClient;

    @Autowired
    public OrderEndpoint(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping
    public Order get(@RequestParam("productUuid") String productUuid) {
        // 这里需要调用产品服务接口来获取产品信息
        ProductDesciption productDesciption = productClient.uuidOf(productUuid);
        return new Order(UUID.randomUUID().toString(), productDesciption);
    }

}
