package lk.jiat.ecomm.user.bean;

import jakarta.ejb.Stateless;
import lk.jiat.ecomm.user.remote.TestSession;

@Stateless
public class TestSessionBean implements TestSession {


    @Override
    public void test() {
        System.out.println("TestSessionBean: test");
    }
}
