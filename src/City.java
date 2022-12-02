public class City {
    int population;
    String continent;
    String name;
    int AvgTemp;

    public City(){
        name = "Chicago";
        population = 1000;
        continent = "North America";
        AvgTemp = 20;
        print();
    }
    public void print(){
        System.out.println("the city "+name+" is in "+continent);
        System.out.println("and has an average temp of "+AvgTemp+" and a pop of "+population+" people");


    }
}
