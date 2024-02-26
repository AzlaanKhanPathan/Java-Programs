class EncapTest{
    private String name;
    private int age;
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void setAge(int newAge){
        age =newAge;
    }
    public void setName (String newName) {
        name = newName;
    }
}
class RunEncap{
    public static void main (String[] args){
        EncapTest E1=new EncapTest();
        E1.setName("Madhu");
        E1.setAge(11);
        System.out.println("Name:"+E1.getName()+"\nAge:"+E1.getAge());

    }
}