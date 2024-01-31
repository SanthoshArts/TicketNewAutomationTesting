package TicketNew2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class access {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","E:\\Programing\\Drivers 2\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.get(" https://www.ticketnew.com/ ");
			
			d.manage().window().maximize();
			d.get(" https://www.ticketnew.com/OnlineTheatre/Theatre/UserLogin.aspx ");
		
			WebElement email=d.findElement(By.id("txtEmail"));
			 email.sendkeys("santhoshsaravanankmu@gmail.com ");
			
			WebElement pass =d.findElement(By.id("txtpwd"));
			pass.sendKeys("sanarts@1234");
			Thread.sleep(20000);
			
			WebElement log=d.findElement(By.id("btnLogin"));
			log.click();
			
			WebElement city=d.findElement(By.id("tn_city_search"));
			city.sendKeys("chennai");
			city.sendKeys(Keys.ARROW_DOWN);
			city.sendKeys(Keys.ENTER);
			
			WebElement movie=d.findElement(By.id("href_movies"));
			movie.click();
			
			WebElement moviename=d.findElement(By.xpath("//*[@id=\"now_showing\"]/div[1]/div[2]/a/img"));
			moviename.click();
			
			WebElement date=d.findElement(By.xpath("//*[@id=\"ulShowDate\"]/li[3]/a/span[1]"));
			date.click();
			WebElement show=d.findElement(By.xpath("//*[@id=\"date_1662575400\"]/div[5]/div[2]/ul/li[4]/a"));
			show.click();
			d.get(" https://www.ticketnew.com/onlinetheatre/Theatre/SelectSeats.aspx?EventID=MTI5MDQ4MjE%3d-r8qFZ0C9DgY%3d&ReqSeats=MTA%3d-zISu%2bSIzx8g%3d&LevelID=MA%3d%3d-110A7HeCwRM%3d&ReqDate=MjAyMi0wOS0wOA%3d%3d-0TlGdiB97LY%3d&VenueID=MTMwNDY%3d-U%2fanGHh0WZM%3d&SiteInfo=MA%3d%3d-110A7HeCwRM%3d&MovieURL=aHR0cHM6Ly93d3cudGlja2V0bmV3LmNvbS9Db2JyYS1Nb3ZpZS1UaWNrZXRzLU9ubGluZS1TaG93LVRpbWluZ3MvT25saW5lLUFkdmFuY2UtQm9va2luZy8yNTI1My9DL0NoZW5uYWkvMjAyMjA5MDg%3d-p4lW22qWj3I%3d ");
			WebElement seat=d.findElement(By.xpath("//td[@data-seat='1_6_9']"));
			seat.click();
			WebElement cont =d.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div/div[3]"));
			cont.click();
			d.get(" https://www.ticketnew.com/onlinetheatre/Theatre/OrderSummary.aspx?retURL=U2VsZWN0U2VhdHMuYXNweD9SZXFEYXRlPU1qQXlNaTB3T1Mwd09BPT0tMFRsR2RpQjk3TFk9JlZlbnVlSUQ9TVRJMk5Uaz0tWHZuL21Eenp1bkk9JkV2ZW50SUQ9TVRJNU9UUXpOakk9LXNuTTM1THlhRzlNPSZMZXZlbElEPU1BPT0tMTEwQTdIZUN3Uk09JlJlcVNlYXRzPU1UQT0teklTdStTSXp4OGc9JlNpdGVJbmZvPU1BJTNkJTNkLTExMEE3SGVDd1JNJTNkJk1vdmllVVJMPWFIUjBjSE02THk5M2QzY3VkR2xqYTJWMGJtVjNMbU52YlM5RGIySnlZUzFOYjNacFpTMVVhV05yWlhSekxVOXViR2x1WlMxVGFHOTNMVlJwYldsdVozTXZUMjVzYVc1bExVRmtkbUZ1WTJVdFFtOXZhMmx1Wnk4eU5USTFNeTlETDBOb1pXNXVZV2t2TWpBeU1qQTVNRGc9LXA0bFcyMnFXajNJPQ%3d%3d-CI7giLk8cDQ%3d&transid=NzI3MzEyMzg%3d-mTo7ShQr4u8%3d&ttransid=MTYzMjQ5MDE%3d-OkCVRX2i71Q%3d ");
			WebElement cont2=d.findElement(By.id("divContinueButton"));
			cont2.click();
			d.get(" https://www.ticketnew.com/onlinetheatre/PG/PGSelection.aspx?retURL=Li4vdGhlYXRyZS9TZWxlY3RTZWF0cy5hc3B4P1JlcURhdGU9TWpBeU1pMHdPUzB3T0E9PS0wVGxHZGlCOTdMWT0mVmVudWVJRD1NVE13TkRZPS1VL2FuR0hoMFdaTT0mRXZlbnRJRD1NVEk1TURRNE5EST0tc2NDUzBnSkpDcDg9JkxldmVsSUQ9TUE9PS0xMTBBN0hlQ3dSTT0mUmVxU2VhdHM9TVRBPS16SVN1K1NJeng4Zz0mU2l0ZUluZm89TUElM2QlM2QtMTEwQTdIZUN3Uk0lM2QmTW92aWVVUkw9YUhSMGNITTZMeTkzZDNjdWRHbGphMlYwYm1WM0xtTnZiUzlEYjJKeVlTMU5iM1pwWlMxVWFXTnJaWFJ6TFU5dWJHbHVaUzFUYUc5M0xWUnBiV2x1WjNNdlQyNXNhVzVsTFVGa2RtRnVZMlV0UW05dmEybHVaeTh5TlRJMU15OURMME5vWlc1dVlXa3ZNakF5TWpBNU1EZz0tcDRsVzIycVdqM0k9-MPBPY6BFrbc%3d&transid=NzI3MjkyOTI%3d-W2gvGjzZbWs%3d&ttransid=MTYzMjM0MDU%3d-yM%2f5%2b5Ogh0g%3d&seatblockdatetime=MTY2MjQ1MDA5MA%3d%3d-hzdiHe6VgaY%3d ");
			WebElement upi=d.findElement(By.id("ui-id-3"));
			upi.click();
			WebElement upinum=d.findElement(By.xpath("//*[@id=\"txtVPA\"]"));
			upinum.sendKeys("7416278415@ybl");
			WebElement check =d.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[3]/p/label/span[1]"));
			check.click();			
    }
}
