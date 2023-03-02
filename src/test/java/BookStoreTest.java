import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.List;

public class BookStoreTest extends BaseTest {

    @Test
    public void findMatchedBooks() {
        HomePage home = new HomePage(driver);

        RestAssured.baseURI = "https://demoqa.com/BookStore/V1/Books";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();

        JsonPath jsonPathEvaluator = response.jsonPath();
        Assert.assertEquals(response.getStatusCode(), 200);

        List<String> allBooks = jsonPathEvaluator.getList("books.title");

        home.areBooksMatch(allBooks);
    }
}
