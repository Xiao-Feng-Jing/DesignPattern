package factory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : ZengKan
 * @version : 1.0
 * @Date : 2021/09/10/15:13
 * @Description : 抽象人类创建工厂
 * @modified By :
 **/
public abstract class AbstractPeopleFactory {

    public abstract <T extends People> T createPeople(Class<T> c);
}
