public class Nobody implements InterfaceNamePeople{
    private String name="Никто";
    @Override
    public String getName(){
        return name;
    }
    public String notDo(){
        return "этим не занимается";
    }
}
