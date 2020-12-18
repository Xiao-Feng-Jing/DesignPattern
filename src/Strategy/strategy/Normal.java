package strategy;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2020/12/17/21:32
 * @Description:正常的算法策略
 **/
public class Normal implements PricingStrategy{

    /**
     * RealPrice 无优惠算法函数
     * @param oldPrice 开始的价格
     * @return 经过算法后的价格
     * */
    @Override
    public BigDecimal RealPrice(BigDecimal oldPrice) {
        return oldPrice;
    }
}
