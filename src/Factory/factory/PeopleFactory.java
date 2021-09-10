package factory;

/**
 * Created with IntelliJ IDEA.
 * @author zengkan
 * @Date: 2020/12/17/20:18
 * @Description: 这是一个工厂类型，主要是实现people的工厂
 **/
public class PeopleFactory extends AbstractPeopleFactory{

    /**
     * createPeople主要通过反射的方式生成相应的类
     * @return people返回生成的类
     * */
    @Override
    public <T extends People> T createPeople(Class<T> c){
        People people=null;
        try {
            people = (People) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("性别选择错误");
        }
        return (T) people;
    }
}
