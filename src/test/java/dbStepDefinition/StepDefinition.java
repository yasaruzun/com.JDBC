package dbStepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static utilities.DBUtils1.*;

public class StepDefinition {

    List<Object> staffTablosundakiIDler= new ArrayList<>();

    @Given("Database baglantisi kurulur")
    public void database_baglantisi_kurulur() {

        createConnection();



    }
    @Then("Staff tabosundaki {string} leri listeler")
    public void staff_tabosundaki_leri_listeler(String id) {

        staffTablosundakiIDler=getColumnData("SELECT * FROM u480337000_tlb_training.staff","id");
        System.out.println(staffTablosundakiIDler);


    }
    @Then("verilen {string} dogrulanir")
    public void verilen_dogrulanir(String id) {

        Assert.assertTrue(staffTablosundakiIDler.toString().contains(id));

    }
    @Then("Database baglantisini kapatilir")
    public void database_baglantisini_kapatilir() {
        closeConnection();


    }

}
