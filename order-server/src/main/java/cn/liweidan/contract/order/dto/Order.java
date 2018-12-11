package cn.liweidan.contract.order.dto;

/**
 * Description：
 *
 * @author liweidan
 * @version 1.0
 * @date 2018-12-11 10:18
 * @email toweidan@126.com
 */
public class Order {

    private String uuid;

    private ProductDesciption productDesciption;

    public Order() {
    }

    public Order(String uuid, ProductDesciption productDesciption) {
        this.uuid = uuid;
        this.productDesciption = productDesciption;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ProductDesciption getProductDesciption() {
        return productDesciption;
    }

    public void setProductDesciption(ProductDesciption productDesciption) {
        this.productDesciption = productDesciption;
    }
}
