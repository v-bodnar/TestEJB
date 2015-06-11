package ejbtest;

import ejbtest.TestBeanFacadeLocal;

import javax.ejb.Stateless;

/**
 * Created by volodymyr.bodnar on 11.06.2015.
 */
@Stateless(name = "TestBeanEJB")
public class TestBean implements TestBeanFacadeLocal {
    public TestBean() {
    }
    public void doSomething(){
        System.out.println("doSomething");
    }
}
