package githubCmdPractice;

import org.testng.annotations.Test;

public class GithubPracticeTest {

	@Test
	public void test() {
		String url = System.getProperty("URL");
		String browser = System.getProperty("BROWSER");
		System.out.println("GitHub1");
		System.out.println(url);
		System.out.println(browser);

	}

}
