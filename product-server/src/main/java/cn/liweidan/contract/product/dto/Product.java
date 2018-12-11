package cn.liweidan.contract.product.dto;

/**
 * Description：产品数据传输类
 *
 * @author liweidan
 * @version 1.0
 * @date 2018-12-11 10:08
 * @email toweidan@126.com
 */
public class Product {

    private String uuid;

    private String prodName;

    public Product(String uuid, String prodName) {
        this.uuid = uuid;
        this.prodName = prodName;
    }

    public Product() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
}
