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
}

