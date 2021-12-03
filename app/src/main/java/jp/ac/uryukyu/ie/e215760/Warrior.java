package jp.ac.uryukyu.ie.e215760;

public class Warrior extends Hero{
    public Warrior(String _name, int _hitPoint, int _attack){
        super(_name, _hitPoint, _attack);
    }



    public void attackWithWeponSkill(LivingThing opponent){
        if (this.dead){
            System.out.println(name + "は攻撃できない...");
        }

        else{
            int damage = (int)(1.5 * attack);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
        
    }
    

}    
    

