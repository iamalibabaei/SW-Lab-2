package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MySqrtStepDefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private float result;


    @Before
    public void before() {
        this.calculator = new Calculator();
    }

    @Given("^Two input values are, (-?\\d+) and (-?\\d+)$")
    public void inputValues(int arg0, int arg1) throws Exception {
        if (arg0 * arg1 < 0) {
            throw new Exception("input values should have same signs");
        }
        this.value1 = arg0;
        this.value2 = arg1;
    }

    @When("^We divide a to b and sqrt$")
    public void doFunc() {
        float divide_result = this.calculator.divide(this.value1, this.value2);
        this.result = this.calculator.sqrt(divide_result);

    }

    @Then("^We expect the result (([0-9]*[.])?[0-9]+)$")
    public void assertion(float arg0, String ignore) {
        Assert.assertEquals(arg0, this.result, 0.001);
    }
}
