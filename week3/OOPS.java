public class OOPS {
    public static void display(Student s){
        System.out.println(s.name);
        System.out.println(s.semester);
        System.out.println(s.year);

        System.out.print(s.branch_code);


    }
    public static void main(String[] args){
        Student s2 = new Student(1,"xyz",4,1,2);
        display(s2);
    }


}
