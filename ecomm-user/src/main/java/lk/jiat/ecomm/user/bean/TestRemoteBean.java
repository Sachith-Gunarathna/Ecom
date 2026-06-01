package lk.jiat.ecomm.user.bean;

import jakarta.ejb.Stateless;
import lk.jiat.ecomm.user.remote.TestRemote;

@Stateless
public class TestRemoteBean implements TestRemote {


    int i;

    public TestRemoteBean(){
        System.out.println("TestSessionBean created" + this);
    }

    @Override
    public String test() {

        i++;

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

       return "TestSessionBean: test "+i ;
    }
}
