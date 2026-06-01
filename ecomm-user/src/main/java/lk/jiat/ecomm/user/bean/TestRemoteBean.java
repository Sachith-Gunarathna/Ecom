package lk.jiat.ecomm.user.bean;

import jakarta.ejb.Stateless;
import lk.jiat.ecomm.user.remote.TestRemote;

@Stateless
public class TestRemoteBean implements TestRemote {


    @Override
    public void test() {
        System.out.println("TestSessionBean: test");
    }
}
