package it.ndangawa.transpay.eis.dao;

import org.junit.Before;
import org.junit.Test;

import it.ndangawa.transpay.eis.model.Account;
import it.ndangawa.transpay.eis.model.Customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AccountDAOTest 
{
    private AccountDAO accountDAO = new AccountDAO();
    private Account account;

    /*
    @Before
    public void setUp(){
        File picture = new File("C:\\Users\\ndang\\Downloads\\thumbnail_image001.png");
        FileInputStream fileIS = null;
        try {
            fileIS = new FileInputStream(picture);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Calendar birthdate = new GregorianCalendar(2005, Calendar.APRIL, 5);
        account = new Account("chloesamedjeu@gmail.com", "chloe");
        Customer customer = account.initializeInfos("chloé", "samedjeu", fileIS, birthdate, "F", "0745508187");
        account.setCustomer(customer);
    }
    
    @Test
    public void createAccountDAOTest() throws Exception{
        assertFalse(accountDAO.create(account));
    }
    */

    @Test
    public void readAll(){
        List<Account> accounts = accountDAO.readAll();
        int i = 0;
        Calendar[] date = {new GregorianCalendar(1989, Calendar.MARCH, 10),
                            new GregorianCalendar(2005, Calendar.APRIL, 5)};
        for (Account account : accounts) {
            assertEquals(date[i], account.getAccountInfos().getBirthdate());
            i++;
        }
    }
}
