package jp.ac.uryukyu.ie.e215760;

public class Enemy extends LivingThing{
    public Enemy(String _name, int _hitPoint, int _attack){
        super(_name, _hitPoint, _attack);
}

@Override
public void wounded(int damage){
    hitPoint -= damage;
    if( hitPoint <= 0 ) {
        dead = true;
        System.out.printf("モンスター　%sは倒れた。\n", name);
    }
}
}