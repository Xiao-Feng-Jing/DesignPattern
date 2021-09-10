package singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2021/09/10/13:00
 * @Description:
 **/
public class Minister {
    public static void main(String[] args) {
        for (int i = 0; i < 3; ++i) {
            EmperorEnum.INSTANCE.whateverMethod();
        }
    }
}
