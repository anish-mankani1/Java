package polymorphism;

class television{
    public void switchon(){
        System.out.println("television starts");
    }
    public void changechannel(){
        System.out.println("chnage channel");
    }
    public void changevolume(){
        System.out.println("chnage volume");
    }
}
class smarttv extends television{
    public void watchnetflix(){
        System.out.println("netflix on smarttv");
    }
    public void internetbrowsing(){
        System.out.println("smarttv internet browsing");
    }
    public void chromecast(){
        System.out.println("smarttv chrome cast");
    }
    @Override
    public void switchon(){
        System.out.println("smarttv starts");
    }
    public void changechannel(){
        System.out.println(" smarttv chnage channel");
    }
    public void changevolume(){
        System.out.println(" smartv cchnage volume");
    }
}
public class polymorphism2 {
    public static void main(String[] args) {
        television obj =new television();
        smarttv obj2=new smarttv();
       // obj2.chromecast();
      //  obj2.internetbrowsing();
      //  obj2.switchon();
      //  obj2.changechannel();
      //  obj2.watchnetflix();
      //  obj2.changevolume();
        obj=new smarttv();
        obj.changechannel();
    }
}
