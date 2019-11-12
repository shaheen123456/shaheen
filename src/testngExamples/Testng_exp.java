package testngExamples;
import org.testng.annotations.Test;

public class Testng_exp {
@Test
public void login() {
	System.out.println("login completed");
}
@Test(dependsOnMethods="login")
public void logout() {
	System.out.println("Logout completed");
}
}
