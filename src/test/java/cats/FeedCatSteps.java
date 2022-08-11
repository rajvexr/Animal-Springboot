package cats;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


class IsTheCatHungry{
    static String isTheCatHungry(String hungry){
        return "the cat is hungry".equals(hungry) ? "Yes":"No";
    }
}



public class FeedCatSteps{
    private String isHungry;

//////////////////////////////
    //the cat is hungry\\
/////////////////////////////
    @Given("^the cat is hungry$")
    public void theCatIsHungry() {
        //isHungry = true;

    }

    @And("^there is food in the bowl$")
    public String thereIsFoodInTheBowl() {
        return("there is food in the bowl");
    }

    @And("^the cat likes the food on offer$")
    public String theCatLikesTheFoodOnOffer() {
        return("the cat likes the food on offer");
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
    public String theCatShouldNoLongerBeHungry() {
        return("the cat should no longer be hungry");
    }

    @And("^the amount of food in the bowl decreases$")
    public String theAmountOfFoodInTheBowlDecreases() {
        return("the amount of food in the bowl decreases");
    }

/////////////////////////////////
    //the cat is not hungry\\
/////////////////////////////////
    @Given("^the cat is not hungry$")
    public void theCatIsNotHungry() {
        ;
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
