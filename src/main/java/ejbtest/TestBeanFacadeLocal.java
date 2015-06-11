package ejbtest;

import javax.ejb.Local;

/**
 * Created by volodymyr.bodnar on 11.06.2015.
 */
@Local
public interface TestBeanFacadeLocal {
    void doSomething();
}
