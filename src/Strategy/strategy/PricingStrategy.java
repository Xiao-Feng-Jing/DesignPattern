package strategy;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2020/12/17/21:05
 * @Description:设计模式之策略模式
 **/
public interface PricingStrategy {
    /**
     * AlgorithmInterface表示算法的方法
     * 是一个抽象方法,用于计算价格
     *
     * @param oldPrice*/
    public BigDecimal RealPrice(BigDecimal oldPrice);
}
