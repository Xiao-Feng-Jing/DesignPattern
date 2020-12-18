package strategy;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2020/12/17/22:18
 * @Description:测试策略模式的使用类
 **/
public class Test {
    public static void main(String[] args) {
        //生成价格
        BigDecimal olBigDecimal=new BigDecimal("300");
        //创建策略
        PricingStrategy pricing=null;
        //创建上下文
        Pay pay = null;
        //选择要是用的算法
        pricing=new Normal();
        //获取策略
        pay =new Pay(pricing);
        //获取价格
        BigDecimal quote=pay.quote(olBigDecimal);
        //显示价格,去掉末尾无用的0，并避免输出科学计数法
        System.out.println("正常价格为："+quote.stripTrailingZeros().toPlainString());

        //选择要是用的算法
        pricing=new Rebate("0.6");
        //获取策略
        pay =new Pay(pricing);
        //获取价格
        BigDecimal quote1=pay.quote(olBigDecimal);
        //显示价格,去掉末尾无用的r0，并避免输出科学计数法
        System.out.println("6折价格为："+quote1.stripTrailingZeros().toPlainString());

        //选择要是用的算法
        pricing=new Return("200","50");
        //获取策略
        pay =new Pay(pricing);
        //获取价格
        BigDecimal quote2=pay.quote(olBigDecimal);
        //显示价格,去掉末尾无用的0，并避免输出科学计数法
        System.out.println("满两百减50的价格为："+quote2.stripTrailingZeros().toPlainString());

    }
}
