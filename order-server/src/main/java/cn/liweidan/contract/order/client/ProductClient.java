package cn.liweidan.contract.order.client;

import cn.liweidan.contract.order.dto.ProductDesciption;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description：产品客户端
 *
 * @author liweidan
 * @version 1.0
 * @date 2018-12-11 10:30
 * @email toweidan@126.com
 */
@FeignClient(name = "product-server")
public interface ProductClient {

    @RequestMapping(method = RequestMethod.GET)
    ProductDesciption uuidOf(@RequestParam("uuid") String uuid);

}
