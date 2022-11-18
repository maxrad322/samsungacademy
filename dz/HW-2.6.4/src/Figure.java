abstract class Figure {
    public abstract String draw();
}
class Circle extends Figure{
    public String draw(){
        return "draw_circle";
    }
}
