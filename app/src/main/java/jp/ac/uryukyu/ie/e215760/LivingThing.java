package jp.ac.uryukyu.ie.e215760;

public class LivingThing {

    protected String name;
    public String getName(){
        return this.name;
    }
    public int hitPoint;

    protected int attack;
    protected boolean dead;
    public boolean isDead(){
        return this.dead;
    }

    public LivingThing(String _name, int _hitPoint, int _attack){
        this.name = _name;
        this.hitPoint = _hitPoint;
        this.attack = _attack;
        this.dead = false;
        System.out.printf("|%s > Hp %d , Att %d.| ",this.name, this.hitPoint, this.attack);
    }
    
    public void attack(LivingThing opponent){
        if (this.dead){
            System.out.println(name + "は攻撃できない...");
        }

        else{
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
        
    }

        public void wounded(int damage){
            hitPoint -= damage;
            if( hitPoint <= 0 ) {
                dead = true;
                System.out.printf("%sは倒れた。\n", name);
            }
        }
}
