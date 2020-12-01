import org.junit.jupiter.api.Test;

import java.lang.annotation.Retention;

import static org.junit.jupiter.api.Assertions.*;

class ContactItemTest {
    ContactItem ft = new ContactItem("Rey", "m", "rm2@gmail.com", "1234567890");

    @Test
    creationFailsWithAllBlankValues(){
    assertThrows(InvalidNameException.class,() -> new ContactItem("", "", "", ""));
    assertEquals(null, null);
    }
    @Test
    creationSucceedsWithBlankEmail(){

    }
    @Test
    creationSucceedsWithBlankFirstName(){}
    @Test
    creationSucceedsWithBlankLastName(){}
    @Test
    creationSucceedsWithBlankPhone(){}
    @Test
    creationSucceedsWithNonBlankValues(){]}
    @Test
    editingFailsWithAllBlankValues(){}
    @Test
    editingSucceedsWithBlankEmail(){}
    @Test
    editingSucceedsWithBlankFirstName(){}
    @Test
    editingSucceedsWithBlankLastName(){}
    @Test
    editingSucceedsWithBlankPhone(){}
    @Test
    editingSucceedsWithNonBlankValues(){}
    @Test
    testToString(){}

}