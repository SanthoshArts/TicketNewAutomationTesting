package TicketNew2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tfind {
	
	//@FindBy(xpath ="//span[@class='text']")
	//public static WebElement login;
	
	@FindBy(id ="txtEmail")
	public static WebElement email;
	
	@FindBy(id ="txtpwd")
	public static WebElement pass;
	
	@FindBy(id ="btnLogin")
	public static WebElement log_bt;
	
	@FindBy(id ="tn_city_search")
	public static WebElement city;
	@FindBy(id ="href_movies")
	public static WebElement movies;
	
	@FindBy(xpath ="//*[@id=\"now_showing\"]/div[1]/div[2]/a/div/div[1]/h4")
	public static WebElement moviename;
	
	@FindBy(xpath ="//*[@id=\"ulShowDate\"]/li[4]/a/span[1]")
	public static WebElement date;
	
	@FindBy(xpath ="//a[@data-hasqtip=39']")
	public static WebElement show;
	@FindBy(xpath ="//td[@data-seat='2_4_10']")
	public static WebElement seat;
	@FindBy(className ="tn-button tn-button-continue")
	public static WebElement cont;
	@FindBy(id ="divContinueButton")
	public static WebElement cont2;
	@FindBy(id = "ui-id-3")
	public static WebElement upi;
	@FindBy(xpath = "//*[@id=\"txtVPA\"]")
	public static WebElement upinum;
	@FindBy(className =  "tn-checkbox")
	public static WebElement terms;
		
}
