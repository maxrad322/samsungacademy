interface Unknowable {
    public boolean isNotknown = true;
    public void set(Number number);
    public void delete();
}
abstract class MyKnow implements Unknowable{
    public void delete(){}
    public String name;
    public void print(){}

}