package singleton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2021/09/10/13:06
 * @Description: 懒汉单例
 **/
public class EmperorTwo {
    private static EmperorTwo emperorTwo;

    private EmperorTwo() {

    }

    /**
     * 线程不安全的懒汉单例
     * */
    /*public static EmperorTwo getInstance() {
        if (emperorTwo == null) {
            emperorTwo = new EmperorTwo();
        }
        return emperorTwo;
    }*/

    /**
     * 线程安全的懒汉单例
     * */
    /*public static synchronized EmperorTwo getInstance() {
        if (emperorTwo == null) {
            emperorTwo = new EmperorTwo();
        }
        return emperorTwo;
    }*/


    /**
     * 双重校验锁/双检锁
     * */
    /*public static EmperorTwo getInstance() {
        if (emperorTwo == null) {
            synchronized (EmperorTwo.class) {
                if (emperorTwo == null) {
                    emperorTwo = new EmperorTwo();
                }
            }
        }
        return emperorTwo;
    }*/
    /**
     * 登记式/静态内部类
     * */
    private static class EmperorTwoHolder {
        private static final EmperorTwo EMPEROR_TWO = new EmperorTwo();
    }

    public static EmperorTwo emperorTwo() {
        return EmperorTwoHolder.EMPEROR_TWO ;
    }

    public static void say() {
        System.out.println("我是皇帝朱元璋。。。。");
    }
}
