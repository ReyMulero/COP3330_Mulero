import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BodyMassIndexTest {
    double hight;
    double weight;
    private BodyMassIndex e;

    @BeforeEach
    public void init(){
        e = new BodyMassIndex(hight,weight);
    }
    //---------------- bmi calculations----------------

    @Test
    public void BmiUnderWeightCalculations(){
       double answer = e.BmiCalculation(71,130);
       assertEquals(18.1, answer);
    }


    @Test
    public void BmiNormalCalculations(){
        double answer = e.BmiCalculation(71,160);
        assertEquals(22.3, answer);
    }


    @Test
    public void BmiOverWeightCalculations(){
        double answer = e.BmiCalculation(71,190);
        assertEquals(26.5, answer);
    }

    @Test
    public void BmiObesityCalculations(){
        double answer = e.BmiCalculation(71,215);
        assertEquals(30.0, answer);
    }

    // ------------------ bmi category-------------------------------

    @Test
    public void BmiUnderWeightCategory(){
        String answer = e.BmiCategory(18.2);
        assertEquals("underweight", answer);
    }

    @Test
    public void BmiNormalCategory(){
        String answer = e.BmiCategory(20.3);
        assertEquals("normal", answer);
    }

    @Test
    public void BmiOverWeightCategory(){
        String answer = e.BmiCategory(26.5);
        assertEquals("overweight", answer);
    }

    @Test
    public void BmiObesityCategory(){
        String answer = e.BmiCategory(30.0);
        assertEquals("Obesity", answer);
    }



}