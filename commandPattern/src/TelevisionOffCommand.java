public class TelevisionOffCommand implements Command{
    private Television television;

    public TelevisionOffCommand(Television television){
        this.television = television;
    }

    @Override
    public void execute() {
        this.television.off();
    }

    @Override
    public void undo() {
        this.television.on();
    }

    @Override
    public String toString() {
        return "OFF: "+ this.television.getTelevision();
    }
}
