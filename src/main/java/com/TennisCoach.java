package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("TennyCoach")
// @Component --> will generate tennisCoach as Bean Id
@Component
//@Scope("prototype")
public class TennisCoach implements  Coach{
    @Autowired // Field Injection , happens through Reflection
    @Qualifier("randomFortuneService")
    private FortuneService myFortune;
    // Constructor Injection
//    @Autowired
//    public TennisCoach(FortuneService myFortune) {
//        this.myFortune = myFortune;
//    }

    @Override
    public String getDailyWorkout() {
        return "practise Tennis";
    }

    public String getMyFortune(){
        return myFortune.getFortune();
    }
//  Setter Injection
//    @Autowired
//    public void setMyFortune(FortuneService myFortune) {
//        this.myFortune = myFortune;
//    }

    // Method/ Setter  Injection , can have any Method name for setter
//    @Autowired
//    public void SettingFortune(FortuneService fs){
//        this.myFortune = fs;
//    }

}
