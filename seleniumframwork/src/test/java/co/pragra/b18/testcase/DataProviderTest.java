package co.pragra.b18.testcase;

import co.pragra.b18.data.LoginData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {


    @Test(dataProvider = "dataFromExcel", dataProviderClass = LoginData.class)
    public void login(String user, String pass){
        System.out.println(user);
        System.out.println(pass);
    }



}
