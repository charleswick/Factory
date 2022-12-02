public class Student {
    int age;
    int grade;
    String name;
    boolean isBoarder;

    String favoriteColor;

    public void print(){
        System.out.println("the student "+name+" is "+age+" years old");
        System.out.println("they are in "+grade+" grade");
        System.out.println("it is "+isBoarder+" that they are a boarder");
        System.out.println("they love the color "+favoriteColor);
    }
}
