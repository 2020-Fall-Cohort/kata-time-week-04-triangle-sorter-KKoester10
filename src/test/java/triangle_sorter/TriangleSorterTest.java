package triangle_sorter;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleSorterTest {
    @Test
    public void threeEqualSidesIsAnEquilateralTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 3, 3);
        assertThat(triangleType, is("Equilateral"));
    }
    @Test
    public void twoEqualSidesIsAnIsoscelesTriangle(){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(5,5,3);
        assertThat(triangleType, is("Isosceles"));
    }
    @Test
    public void sideCIsGreaterThenSideAIsAnRightTriangle(){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3,4,5);
        assertThat(triangleType, is("Right Triangle"));
    }
    @Test
    public void canBeFormedIntoTriangleButNotOtherTriangles(){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(2,3,4);
        assertThat(triangleType, is("Triangle"));
    }
    @Test
    public void canNotBeFormedIntoTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(2, 3, 5);
        assertThat(triangleType, is("Not a Triangle"));
    }
    @Test
    public void threeEqualSidesIsAnEquilateralTriangleWithNumberSix() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(6, 6, 6);
        assertThat(triangleType, is("Equilateral"));
    }
    @Test
    public void twoEqualSidesIsAnIsoscelesTriangleWithNumberSix(){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(6,6,3);
        assertThat(triangleType, is("Isosceles"));
    }
    @Test
    public void sideCIsGreaterThenSideAIsAnRightTriangleWithDifferentNumbers(){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3,4,5);
        assertThat(triangleType, is("Right Triangle"));
    }
    @Test
    public void canBeFormedIntoTriangleButNotOtherTrianglesWithDifferentNumbers(){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(7,10,5);
        assertThat(triangleType, is("Triangle"));
    }
    @Test
    public void NotATriangle(){
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(1,10,12);
        assertThat(triangleType, is("Not a Triangle"));
    }
}

