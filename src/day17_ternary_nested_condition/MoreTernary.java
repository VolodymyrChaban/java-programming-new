package day17_ternary_nested_condition;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate>45) ? "acept" : "reject";
        System.out.println("reply = " + reply );

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java"))? "Murodil" : "nadir";
        System.out.println("Teacher: " + teacher);


        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive)? "Yes" : "NO";
        System.out.println("Can drive " + driving);
    }
}
