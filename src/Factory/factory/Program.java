package factory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zengkan
 * @Date: 2020/12/17/20:01
 * @Description: 工厂的主函数
 **/
public class Program {

    public static void main(String[] args) {
        PeopleFactory peopleFactory = new PeopleFactory();

        //男人的特征
        People man= peopleFactory.createPeople(Man.class);
        man.feature();

        //女人的特征
        People woman= peopleFactory.createPeople(Woman.class);
        woman.feature();

    }
}
