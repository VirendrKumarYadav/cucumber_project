import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlayrightApp {

	
	
	 public static void main(String[] args) {
	        try (Playwright playwright = Playwright.create()) {
	            Browser browser = playwright.chromium().launch();
	            Page page = browser.newPage();
	            page.navigate("https://playwright.dev");
	            System.out.println(page.title());
	            
	        }
	    }
}
