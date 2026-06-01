package lk.jiat.ecomm.user.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.Stateless;
import lk.jiat.ecomm.user.remote.TestRemote;

@Stateless
public class TestRemoteBean implements TestRemote {


    int i;

//    public TestRemoteBean(){
//        System.out.println("TestSessionBean created" + this);
//    }

    @PostConstruct
    public void init(){
        System.out.println("TestSessionBean init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("TestSessionBean destroy");
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
