package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "123-456-78";

        String [] student2 = {"MK4421", "Mike", "Bloomberg", "B22", "703-432-1234"};
        System.out.println("student1 id = " + student2[0]);
        System.out.println("student1 firstname= " + student2[1]);
        System.out.println("student1 lastname = " + student2[2]);
        System.out.println("student1 batch = " + student2[3]);
        System.out.println("student1 mobile = "+ student2[4]);

        System.out.println("Student dats length " + student1.length);

        if (student1.length == 5) {
            System.out.println("PASS: data Correct");
        } else {
            System.out.println("FAIL ");
        }

        if (student1.length == student2.length){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println(student1[1].toUpperCase()+ " " +student1[2].toUpperCase());

        String mobileNum = student1[4];
        System.out.println(mobileNum);
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("123"));


    }
}
