package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import specs.LoginTest;
import specs.SearchTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	LoginTest.class,
	SearchTest.class
})
public class FirstSuite {
	//the class remains empty,
	// used only as a holder for the above annotations
}
