public class EnumCommand {
    public enum Command {
        GO ,HELP,LOOK,TAKE,DROP,DESTROY,SAVE,QUIT,LOAD,USE
    }

    private Command command;

    public EnumCommand(Command command) {
        this.command = command;
    }


}