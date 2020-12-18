package SimpleFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2020/12/17/20:12
 * @Description:
 **/
public class Man implements People{

    /**
     * 该方法实现自People接口
     * 用于输出男性的特征信息
     * */
    @Override
    public void feature() {
        System.out.println("男人是短头发,站着小便。");
    }
}
