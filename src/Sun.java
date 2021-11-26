public class Sun implements InterfaceWeatherConditions {
    private String title="Солнце";
    @Override
    public String titleCondition(){
        return title;
    }
    public String sunrise(){
        return titleCondition() + " встает над крышами домов где-то за Остермальмом.";

    }

}
