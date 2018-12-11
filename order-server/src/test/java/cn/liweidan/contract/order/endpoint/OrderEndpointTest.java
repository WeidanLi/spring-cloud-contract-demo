package cn.liweidan.contract.order.endpoint;

import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Description：测试订单端口
 *
 * @author liweidan
 * @version 1.0
 * @date 2018-12-11 12:02
 * @email toweidan@126.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
// ids 指定需要打桩的服务，记住写 workOffline
@AutoConfigureStubRunner(ids = {"cn.liweidan.contract:product-server:1.0.0-SNAPSHOT:stubs:9080"}, workOffline = true)
public class OrderEndpointTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetOrder() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/").param("productUuid", "1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("productDesciption.prodName", Is.is("电视")));
    }

}
