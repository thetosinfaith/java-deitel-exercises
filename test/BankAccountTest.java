    import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class GTBAccountTest {
        @Test
        public void depositTest(){

            //Given that I have a GTBAccount
            GTBAccount account = new GTBAccount();
            //When i deposited 7000
           account.deposit(7000);
            //Assert that balance is 7000
            assertEquals(7000, account.getBalance());

        }


    }
