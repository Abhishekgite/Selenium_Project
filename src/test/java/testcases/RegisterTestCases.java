package testcases;

import java.io.IOException;
//import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Resources.baseClass3;
import com.Resources.commoMethod;
import com.Resources.constants;

import PageObjectModel.HomePageObject;
import PageObjectModel.RegisterationPageObject;

public class RegisterTestCases extends baseClass3 {

	public static String randomEmail = "";

	@Test
	public void verifyRegisterationWithBlankData() throws IOException, InterruptedException {

		HomePageObject hpo = new HomePageObject(driver);

		commoMethod.putExplicitWait(driver, 10, hpo.clickonMyAccount());

		hpo.clickonMyAccount().click();
		hpo.clickonregister().click();

		RegisterationPageObject rop = new RegisterationPageObject(driver);

		rop.enterFirstname().clear();

		rop.enterFirstname().sendKeys("");
		rop.enterLastname().clear();
		rop.enterLastname().sendKeys("");

		rop.enterEmail().clear();
		rop.enterEmail().sendKeys("");

		rop.EnterTelephone().sendKeys("");
		rop.EnterPassword().sendKeys("");
		rop.EnterPasswordConfirm().sendKeys("");
		rop.ClickOnSubscribe().click();
		rop.AcceptPrivacyPolicy().click();
		rop.ClickOnContinueButton().click();

		commoMethod.handleAssertions(rop.CaptureFirstNameErrorMsg().getText(), constants.firstNameErrorMsg);

		commoMethod.handleAssertions(rop.CaptureLastNameErrorMsg().getText(), constants.lastNameErrorMsg);

	}

	@Test
	public void verifyRegisterationWithValidData() throws IOException, InterruptedException {

		randomEmail = generateRandomEmail();

		RegisterationPageObject rop = new RegisterationPageObject(driver);

		commoMethod.putExplicitWait(driver, 10, rop.enterFirstname());

		rop.enterFirstname().sendKeys(constants.firstname);
		rop.enterLastname().sendKeys(constants.lastname);

		rop.enterEmail().sendKeys(generateRandomEmail());

		rop.EnterTelephone().sendKeys(constants.telephone);
		rop.EnterPassword().sendKeys(constants.password);
		rop.EnterPasswordConfirm().sendKeys(constants.confirmpassword);
		rop.ClickOnSubscribe().click();
		rop.ClickOnContinueButton().click();

		commoMethod.handleAssertions(driver.getCurrentUrl(), constants.successURL);

	}

}
