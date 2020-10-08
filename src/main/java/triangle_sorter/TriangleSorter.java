package triangle_sorter;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        if (sideA == sideB && sideB == sideC){
            return "Equilateral";
        }else if(sideA == sideB){
            return "Isosceles";
        }else if((sideA * sideA + sideB * sideB) / sideC == sideC){
            return "Right Triangle";
        }else if(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA){
            return "Triangle";
        }
        return "Not a Triangle";
    }
}
