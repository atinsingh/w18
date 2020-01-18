package co.pragra.b18.data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoginData {
    @DataProvider
    public Object [] []  loginProvider(){
        Object [][] data =  { {"Kaushik","pass"},{"Swati","3h43kj43"},{"Gauthami","skjhshd"} };
        return data;
    }

    @DataProvider
    public Iterator<Object []> fancyLogin(){
        List<Object []> data = new ArrayList<>();
        data.add(Arrays.asList("Tom Hanks", "sjkdhjdhhjdh").toArray());
        data.add(Arrays.asList("Johny Depp", "sjkdhjdhhjdh").toArray());
        data.add(Arrays.asList("John Doe", "w893kjsjkdjk").toArray());
        return data.iterator();

    }


    @DataProvider
    public Iterator<Object []>  dataFromExcel(){
        ExcelReader excelReader = new ExcelReader();
        List<Object[]> logins = excelReader.getDataFromSheet("Logins", false);
        return logins.iterator();
    }

}
