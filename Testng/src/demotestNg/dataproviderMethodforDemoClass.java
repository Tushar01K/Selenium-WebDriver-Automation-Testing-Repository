package demotestNg;

import org.testng.annotations.DataProvider;

public class dataproviderMethodforDemoClass {
//	Data set
//	india Qutub minar
//	agra tajmahal
//	hydrabad charminar

	@DataProvider(name = "SearchDataSet")
	public Object[][] searchData() {

		Object[][] searchKeyword = new Object[3][2];

		searchKeyword[0][0] = "India";
		searchKeyword[0][1] = "Qutub minar";

		searchKeyword[1][0] = "agra";
		searchKeyword[1][1] = "tajmahal";

		searchKeyword[2][0] = "Hydrabad";
		searchKeyword[2][1] = "charminar";
		return searchKeyword;

	}

}
