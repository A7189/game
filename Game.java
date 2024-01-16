
package game;

public class Game {

    public static void main(String[] args) {
    Player hero = new Player();
    Player enemy = new Player();
    
    hero.name = "choki ";
    hero.speed = 60;
    hero.healthpoint = 100;
    hero.attack = 90;
    hero.defend = 100;
    hero.run();
    hero.attack(enemy.name);
    if(hero.isDead()){
        System.out.println("Game Over");
    }
    enemy.name = "epep ";
    enemy.speed = 60;
    enemy.healthpoint = 100;
    enemy.attack = 90;
    enemy.defend = 100;
    enemy.attack(enemy.name);
    if(enemy.isDead()){
        System.out.println("Game Over");
        
    }    
    }
}