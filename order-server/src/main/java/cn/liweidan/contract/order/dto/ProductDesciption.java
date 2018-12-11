package cn.liweidan.contract.order.dto;

/**
 * Description：
 *
 * @author liweidan
 * @version 1.0
 * @date 2018-12-11 10:18
 * @email toweidan@126.com
 */
public class ProductDesciption {

    private String prodName;

    public ProductDesciption(String prodName) {
        this.prodName = prodName;
    }

    public ProductDesciption() {
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
}
