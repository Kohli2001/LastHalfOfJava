package com.company;

class  Mypersonaldata{

    int age,dob,salary;
    String name,parents,friends , bhaiya;

    public Mypersonaldata(){
        age=22;
        dob=16-12-2001;
        name="kamlesh";
        parents = "Sulena Devi and Dev narayan sharma";
    }
    public Mypersonaldata(int Mysalary, String friendsName){
        salary = Mysalary;
        friends = friendsName;
       // System.out.println(Mysalary);
        //System.out.println(friendsName);
    }
    public Mypersonaldata(String bhaiyaNmae){
       bhaiya = bhaiyaNmae ;
      //  System.out.println(bhaiyaNmae);


    }


}

public class Constructors {
    public static void main(String[] args) {
        Mypersonaldata mine = new Mypersonaldata();
        System.out.println(mine.age);
        System.out.println(mine.name);
        System.out.println(mine.dob);
        System.out.println(mine.parents);

        //construction_overloading

        Mypersonaldata outerinfo = new Mypersonaldata( 450000, "vinay,rajesh, ajay , himsndhu ,sukhit ");
        Mypersonaldata familyinfo = new Mypersonaldata("raman sharma and ranjan sharma");
        System.out.println(outerinfo.salary);
        System.out.println(outerinfo.friends);
        System.out.println(familyinfo.bhaiya);
       // System.out.println(outerinfo.);

    }
}
