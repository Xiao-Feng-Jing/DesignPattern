package strategy;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2020/12/17/21:13
 * @Description:通过该类获取策略的上下文
 **/
public class Pay {

    /**价格,优惠策略*/
    private PricingStrategy pricingStrategy;

    /**
     * {@link Pay} 获取优惠的具体策略
     * @param pricingStrategy 具体的策略
     * */
    public Pay(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    /**
     * quote 执行策略的算法
     * @param oldPrice 开始的价格
     * @return 经过策略算法后的价格
     * */
    public BigDecimal quote(BigDecimal oldPrice){
        return pricingStrategy.RealPrice(oldPrice);
    }
}
