package strategy;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2020/12/17/21:34
 * @Description:折扣算法策略
 **/
public class Rebate implements PricingStrategy{

    /**
     * 折扣大小
     * */
    private BigDecimal pricingRebate =new BigDecimal("1.0");

    /**
     * {@link Rebate} 构造方法，声明使用折扣算法
     * @param rebate 表示折扣大小
     * */
    public Rebate(String rebate){
        this.pricingRebate =new BigDecimal(rebate) ;
    }

    /**
     * RealPrice 折扣算法
     * @param oldPrice 过去的价格
     * @return 返回经过折扣后的价格
     * */
    @Override
    public BigDecimal RealPrice(BigDecimal oldPrice) {
        return oldPrice.multiply(pricingRebate);
    }
}
