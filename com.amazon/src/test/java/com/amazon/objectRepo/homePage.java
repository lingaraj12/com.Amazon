package com.amazon.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {


@FindBy(xpath="//*[@id=\"efb9f7e7-233a-44ea-b30a-7252839c768a\"]/div[2]/div/ul/li[1]/span/a/img")
private WebElement home;

@FindBy(id="quantity")
private WebElement quantity;

@FindBy(xpath="//option[text()='2 ']")
private WebElement quantity1;

@FindBy(id="add-to-cart-button")
private WebElement addtocart;

@FindBy(linkText="Go to Cart")
private WebElement viewcart;

@FindBy(id="proceed-to-checkout-action")
private WebElement checkout;

public WebElement getHome() {
	return home;
}

public void setHome(WebElement home) {
	this.home = home;
}

public WebElement getQuantity() {
	return quantity;
}

public void setQuantity(WebElement quantity) {
	this.quantity = quantity;
}

public WebElement getQuantity1() {
	return quantity1;
}

public void setQuantity1(WebElement quantity1) {
	this.quantity1 = quantity1;
}

public WebElement getAddtocart() {
	return addtocart;
}

public void setAddtocart(WebElement addtocart) {
	this.addtocart = addtocart;
}

public WebElement getViewcart() {
	return viewcart;
}

public void setViewcart(WebElement viewcart) {
	this.viewcart = viewcart;
}

public WebElement getCheckout() {
	return checkout;
}

public void setCheckout(WebElement checkout) {
	this.checkout = checkout;
}



}
