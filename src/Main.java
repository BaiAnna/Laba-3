public class Main {
    public static void main(String args[]) {
        Person person = new Person();
        HomeCarlson homeCarlson = new HomeCarlson();
        SmallHome smallHome = new SmallHome();
        Cake cake = new Cake();
        Sun sun = new Sun();
        Nobody nobody=new Nobody();
        System.out.println(smallHome.whatHome()+" "+smallHome.getPlace("На крышах")+" "+smallHome.cozy()+" "+homeCarlson.cozy());
        System.out.println(person.imagine(homeCarlson)+" "+ person.sit()+" " + person.see()+" "+person.drink()+" "+cake.have(true, person));
        System.out.println(person.sleep(homeCarlson)+" "+homeCarlson.hot());
        System.out.println(person.getUp()+" "+person.admire(sun));
        System.out.println(homeCarlson.cozy()+" "+homeCarlson.stand(person));
        System.out.println(person.wander(homeCarlson)+" "+person.search(homeCarlson));
        System.out.println(nobody.getName()+" "+nobody.notDo());
    }
}