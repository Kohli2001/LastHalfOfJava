package com.company;

interface camera{
    void takeSnap();
    void recordVedio();

   }
interface playMusic{
    String[] musicList();

}
class newcellPhone{
    public void call(){
        System.out.println("calling.....");
    }
    public void pickCall(){
        System.out.println("Connecting....");
    }

}
class NewsmartPhone extends newcellPhone implements camera,playMusic{
    public void takeSnap(){
        System.out.println("taking snap from oppoF15");
    }

    @Override
    public void recordVedio() {
        System.out.println("recording video in 1080pm");
    }

    @Override
    public String[] musicList() {
        System.out.println("getting list of music from smratphone");
        String[] musicList = {"jane meri janeman" , "hum tumhare hai sanam", "hum mar jayenge"};
        return musicList;
    }
}


// try by myself
interface bariDidi{
    void location();
    void familyMember();
}
interface ramanBhaiya{
    void location();
    void familyMember();
}
interface chotiDidi{
    void location();
  void familyMember();

}
interface ranjanBhaiya{
    void location();
    void familyMember();
}
interface me{
  void location();
  void family();
}
class parents{
    public void mereBachche(){
        System.out.println("the lists are following");
    }
}
class family extends parents implements bariDidi,ramanBhaiya,chotiDidi,ranjanBhaiya,me{


    @Override
    public void location() {
        System.out.println("hardia begusarai");
    }

    @Override
    public void family() {
        System.out.println("List r following");

    }

    @Override
    public void familyMember() {
        System.out.println("bariDidi,ramanBhaiya,chotiDidi,ranjanBhaiya,me");


    }
}

public class interfaces_examples {
    public static void main(String[] args) {
//        NewsmartPhone ms = new NewsmartPhone();
//        ms.call();
//       String[] arr =  ms.musicList();
//       for (String item:arr){
//           System.out.println(item);
//       }

        family fmly = new family();
        fmly.family();
        fmly.familyMember();

    }
}
