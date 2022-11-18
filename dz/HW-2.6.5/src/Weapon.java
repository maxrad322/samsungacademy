interface Weapon {
    public boolean isLetal=true;
    public void shoot();
    public void arm();
}

abstract class Artillery implements Weapon{
    public int damage;
    public void move(){}
    public void arm(){}
}