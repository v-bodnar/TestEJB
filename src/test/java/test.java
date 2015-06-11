import ejbtest.TestBeanFacadeLocal;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by volodymyr.bodnar on 11.06.2015.
 */
public class test {
    private static TestBeanFacadeLocal testBean;
    private static EJBContainer container;
    public static InitialContext context;

    @BeforeClass
    public static void setUp() throws Exception {
        //Creating EJB container and searching for facade instances
        System.out.println("Create EJB container");
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer();

        try {
            testBean = (TestBeanFacadeLocal) container.getContext().lookup("java:global/TestEJB/TestBeanEJB");
        } catch (NamingException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        container.close();
        System.out.println("Closing the container");
    }

    @Test
    public void testOne() throws Exception {
        testBean.doSomething();
    }
}
