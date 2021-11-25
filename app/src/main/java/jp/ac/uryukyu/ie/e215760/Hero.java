package jp.ac.uryukyu.ie.e215760;

public class Hero extends LivingThing{
    public Hero (String _name, int _hitPoint, int _attack){ 
        super(_name, _hitPoint, _attack);
    }
@Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("勇者　%sは倒れた。\n", name);
        }
    }
}