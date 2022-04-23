public class PeopleTest {
    public static void main(String[] args) {
        People peo = new AmericanPeople("川普","哥伦比亚特区");
        String say = peo.say();
        System.out.println(say);
        peo = new ChinaPeople("刘强东","江苏省");
        System.out.println(peo.say());
    }
}
class People {
    private String name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String say(){
        return "《父类say》";
    }

}

class ChinaPeople extends People{
    private String province;

    public ChinaPeople(String name, String province) {
        super(name);
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String say() {
        return super.say()+getName()+"在中国"+province;
    }
}

class AmericanPeople extends People{
    private String state;

    public AmericanPeople(String name,String state) {
        super(name);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String say() {
        return super.say()+super.getName()+"在美国"+state;
    }
}



