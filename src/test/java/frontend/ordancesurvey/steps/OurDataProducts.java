package frontend.ordancesurvey.steps;

import frontend.ordancesurvey.pages.DataProducts;
import io.cucumber.java.en.And;

public class OurDataProducts {
    @And("Select our data product")
    public void selectOurDataProduct() {
        new DataProducts().selectOurDataProducts();
    }
}
