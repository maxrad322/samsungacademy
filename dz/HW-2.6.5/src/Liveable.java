public interface Liveable {
    String breathe();
    String reproduction();
    String feed(Liveable[] liveables);
    boolean isLive = false;
}
