class Info {
    String designation = "Teacher";
    String collegeName = "Polytechnic";
    void does(){
        System.out.println("Teaching");
    }
}
class ComputerTeacher extends Info {
    String mainSubject = "Computer";
    public static void main (String args[]){
        ComputerTeacher obj = new ComputerTeacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
    }
}