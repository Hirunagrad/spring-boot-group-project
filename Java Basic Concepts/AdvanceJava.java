public class AdvanceJava {
    public static void main(String[] args) {
        System.out.println("hello");

        Faculty faculty = Faculty.ENGENNERING;

        System.out.println(faculty.name());
        System.out.println(faculty.getValue());

        Factorial obj = new Factorial();

        System.out.println(obj.findFactorial(5));
    }


}
