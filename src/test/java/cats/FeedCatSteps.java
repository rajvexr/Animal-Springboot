package cats;

import com.softwareinstitute.training.raj.singh.vet.Cat;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeedCatSteps{

    private Cat cat = new Cat("Tom", 7, "Male", 100, 5, false);
    private boolean isHungry;
    private boolean isBowlEmpty;
    private double bowlWithFood;

//////////////////////////////
    //the cat is hungry\\
/////////////////////////////
    @Given("^the cat is hungry$")
    public void theCatIsHungry() {
        isHungry = true;
    }

    @And("^there is food in the bowl$")
    public void thereIsFoodInTheBowl() {
        isBowlEmpty = false;
        bowlWithFood = 100;
    }

    @And("^the cat likes the food on offer$")
    public void theCatLikesTheFoodOnOffer() {
        String catLikesFood = "the cat likes the food on offer";
    }

    @When("^i want to feed the cat$")
    public void iWantToFeedTheCat() {
        String iWantToFeedCat = "i want to feed the cat";
    }

    @Then("^the cat should eat the food$")
    public void theCatShouldEatTheFood() {
        String catEatsFood = "the cat should eat the food";
    }

    @And("^the cat should no longer be hungry$")
    public void theCatShouldNoLongerBeHungry() {
        isHungry = false;
    }

    @And("^the amount of food in the bowl decreases$")
    public void theAmountOfFoodInTheBowlDecreases() {
        bowlWithFood-=50;
    }

    @Then("^the food in the bowl is empty$")
    public void theFoodInTheBowlIsEmpty() {
        bowlWithFood = 0;
        isBowlEmpty = true;
    }

/////////////////////////////////
    //the cat is not hungry\\
/////////////////////////////////
    @Given("^the cat is not hungry$")
    public void theCatIsNotHungry() {
        isHungry= false;
    }

    @When("^i try to feed the cat$")
    public void iTryToFeedTheCat() {
        String iTryToFeedTheCat = "i try to feed the cat";
    }

    @Then("^the cat refuses to eat the food$")
    public void theCatRefusesToEatTheFood() {
        String theCatRefusesToEatTheFood = "the cat refuses to eat the food";
    }

//////////////////////////////////////////
    //the cat does not like the food\\
/////////////////////////////////////////

    @Given("^the cat does not even like the food$")
    public void theCatNotEvenLikeTheFood() {
        String theCatNotEvenLikeTheFood = "the cat does not even like the food";
    }

    @When("^i try feed to feed the cat$")
    public void iTryFeedTheCat() {
        String iTryFeedTheCat = "i try to feed the cat";
    }

    @And("^the cat try's the food$")
    public void theTrySTheFood() {
        String theTrySTheFood = "try's the food";
    }

    @Then("^the cat decides they don't want the food$")
    public void theCatDoesNotLikeTheFood() {
        String theCatDoesNotLikeTheFood = "the cat does not like the food" ;
    }

}
