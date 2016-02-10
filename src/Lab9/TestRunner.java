package Lab9;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MyTestSuite_VendingMachine.class);
		//MyTestSuite_VendingMachineis the name of test suite class
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("All tests pass : " + result.wasSuccessful());
	}
}
// can export the output to a file.