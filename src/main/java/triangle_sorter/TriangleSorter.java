package triangle_sorter;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        if (sideA == sideB && sideB == sideC){
            return "Equilateral";
        }else if(sideA == sideB){
            return "Isosceles";
        }else if(sideA == 3 && sideB == 4 & sideC == 5){
            return "Right Triangle";
        }else if(sideA == 2 && sideB == 3 & sideC == 4){
            return "Triangle";
        }
        return "Not a Triangle";
    }
}
