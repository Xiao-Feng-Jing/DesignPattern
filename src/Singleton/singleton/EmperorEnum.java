package singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2021/09/10/13:25
 * @Description: 枚举单例（饿汉）
 **/
public enum EmperorEnum {
    INSTANCE;

    public void whateverMethod() {
        System.out.println("我是皇帝朱元璋。。。");
    }
}
