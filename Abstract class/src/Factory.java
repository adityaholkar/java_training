public abstract class Factory {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public abstract void start();
    public abstract void run();
    public abstract void stop();
    public void engine(){
        start();
        run();
        stop();
    }
}
