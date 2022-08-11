package cats;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

class bowlDecreases {

}


public class FeedCatSteps{
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
    }

    @And("^the cat likes the food on offer$")
    public void theCatLikesTheFoodOnOffer() {
        String catLikesFood = "the cat likes the food on offer";
    }

    @When("^i want to feed the cat$")
    public String iWantToFeedTheCat() {
        return("i want to feed the cat");
    }

    @Then("^the cat should eat the food$")
    public String theCatShouldEatTheFood() {
        return("the cat should eat the food");
    }

    @And("^the cat should no longer be hungry$")
    public void theCatShouldNoLongerBeHungry() {
        isHungry = false;
    }

    @And("^the amount of food in the bowl decreases$")
    public String theAmountOfFoodInTheBowlDecreases() {
        return("the amount of food in the bowl decreases");
    }

    @Then("^the food in the bowl is empty$")
    public void theFoodInTheBowlIsEmpty() {
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
    public String iTryToFeedTheCat() {
        return("i try to feed the cat");
    }

    @Then("^the cat refuses to eat the food$")
    public String theCatRefusesToEatTheFood() {
        return("the cat refuses to eat the food");
    }

//////////////////////////////////////////
    //the cat does not like the food\\
/////////////////////////////////////////

    @Given("^the cat does not even like the food$")
    public String theCatNotEvenLikeTheFood() {
        return("the cat does not even like the food");
    }

    @When("^i try feed to feed the cat$")
    public String iTryFeedTheCat() {
        return("i try to feed the cat");
    }

    @And("^the cat try's the food$")
    public String theTrySTheFood() {
        return("try's the food");
    }

    @Then("^the cat decides they don't want the food$")
    public String theCatDoesNotLikeTheFood() {
        return("the cat does not like the food");
    }

}
