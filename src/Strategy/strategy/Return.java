package strategy;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2020/12/17/21:48
 * @Description:满减算法策略
 **/
public class Return implements PricingStrategy{

    /**满减算法执行的条件*/
    private BigDecimal conditionPrice=new BigDecimal("0.0");
    /**满减算法的优惠力度*/
    private BigDecimal returnPrice = new BigDecimal("0.0");

    /**
     * {@link Return} 构造方法，用于声明使用满减算法
     * @param conditionPrice 满减条件
     * @param returnPrice  优惠力度
     * */
    public Return(String conditionPrice,String returnPrice){
        this.conditionPrice = new BigDecimal(conditionPrice);
        this.returnPrice = new BigDecimal(returnPrice);
    }

    /**
     * RealPrice 满减算法
     * @param oldPrice 过去的价格
     * @return 新的价格
     * */
    @Override
    public BigDecimal RealPrice(BigDecimal oldPrice) {
        //判断是否满足算法的条件
        if (oldPrice.compareTo(conditionPrice) > 0) {
            //满减算法的执行，setScale是BigDecimal取整的方法，ROUND_DOWN是表示直接舍弃小数部分
            return oldPrice.subtract(
                    oldPrice.divide(conditionPrice)
                            .setScale(0,BigDecimal.ROUND_DOWN)
                            .multiply(returnPrice));
        }
        return oldPrice;
    }
}
