package githubCmdPractice;

import org.testng.annotations.Test;

public class GithubPracticeTest {

	@Test
	public void test() {
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		System.out.println("GitHub1");
		System.out.println(url);
		System.out.println(browser);

	}

}
