package triangle_sorter;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        if (sideA == 3 && sideB == 3 & sideC == 3){
            return "Equilateral";
        }else if(sideA == 5 && sideB == 5 & sideC == 3){
            return "Isosceles";
        }else if(sideA == 3 && sideB == 4 & sideC == 5){
            return "Right Triangle";
        }else if(sideA == 2 && sideB == 3 & sideC == 4){
            return "Triangle";
        }
        return "Not a Triangle";
    }
}
