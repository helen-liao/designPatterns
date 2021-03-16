public class TelevisionOnCommand implements Command{
    private Television television;

    public TelevisionOnCommand(Television television){
        this.television = television;
    }

    @Override
    public void execute() {
        this.television.on();
    }

    @Override
    public void undo() {
        this.television.off();
    }

    @Override
    public String toString() {
        return "ON: " + this.television.getTelevision();
    }
}
