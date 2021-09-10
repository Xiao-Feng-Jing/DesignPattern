package factory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2020/12/17/20:15
 * @Description:
 **/
public class Woman implements People{

    /**
     * 该方法实现自People接口
     * 用于输出女性的特征信息
     * */
    @Override
    public void feature() {
        System.out.println("女人是长头发,蹲着小便。");
    }
}
