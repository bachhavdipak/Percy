package starter.wikipedia;

import io.percy.selenium.Percy;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

/**
 * UIInteractionSteps let us define action classes which regroup related actions.
 * The @Step annotation is used to indicate that this action will appear as a step in the reports.
 */
public class NavigateActions extends UIInteractions {
    private static Percy percy;
    @Step("Navigate to the home page")
    public void toTheHomePage() {
        openUrl("http://wikipedia.com/");
        percy = new Percy(getDriver());
        percy.snapshot("Java example");
    }
}
