package singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2021/09/10/12:56
 * @DescriEption: 饿汉单例
 **/
public class Emperor {

    private static final Emperor  emperor = new Emperor();//初始化皇帝

    private Emperor() {
        //防止出现第二个皇帝
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public static void say() {
        System.out.println("我是皇帝朱元璋。。。。。");
    }
}
