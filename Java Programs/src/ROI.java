abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class run {
    public static void main(String[] args){
        Bank b;
        b=new SBI();
        System.out.println("ROI: "+b.getRateOfInterest()+"%");
        b=new PNB();
        System.out.println("ROI: "+b.getRateOfInterest()+"%");
    }
}