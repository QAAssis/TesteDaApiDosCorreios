import org.hamcrest.Matchers;
import org.junit.Test;
import static io.restassured.RestAssured.*;

public class TestesAutomatizadosDeApi {

    @Test
    public void testeUm() {

        given()
                .log().all()
        .when()
                .get("https://cep-v2-americanas-npf.b2w.io/cep/60765065")
        .then()
                .log().all()
                .statusCode(200)
                .body("address", Matchers.is("Rua Miguel Aragão"))
                .body("city", Matchers.is("Fortaleza"))
                .body("state", Matchers.is("CE"))
                .body("neighborhood", Matchers.is("Aracapé"))
        ;
    }
}
