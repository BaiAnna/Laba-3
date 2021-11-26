import java.util.Objects;

public class Cake implements InterfaceFood {
    private String food = "Пряники";
    private String c;

    @Override
    public String whatFood() {
        return food;
    }


    public String have(boolean b, Person person) {
        if (b == true) {
            c = " они есть ";
        }
        return person.eat()+ " "+ whatFood() + " "+ c;
    }
    @Override
    public String toString(){
        return food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cake cake = (Cake) o;
        return Objects.equals(food, cake.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food);
    }
}


