
package game;

public class Player {
    String name ;
    int speed, healthpoint, attack, defend;
    void run()
    {System.out.println(name  +" is running... ");
     System.out.println("speed: "+speed);
    }
    void attack(String a)
    {System.out.println(name  +"is attacking..." + a);
     System.out.println("damage: "+attack);
    }

    void defend()
    {System.out.println(name  +"is defending");
     System.out.println("armor: "+defend);
    }
     
Boolean isDead(){
 if(healthpoint<=0) return true;
 return false;
}
}