package frontend.ordancesurvey.steps;

import frontend.ordancesurvey.pages.DataProducts;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class OurDataProducts {
    @And("Select our data product")
    public void selectOurDataProduct() {
        new DataProducts().selectOurDataProducts();
    }

    @Then("Verify user navigate on our data products successfully")
    public void verifyUserNavigateOnOurDataProductsSuccessfully() {
        new DataProducts().verifyDataProduct();

    }
}
