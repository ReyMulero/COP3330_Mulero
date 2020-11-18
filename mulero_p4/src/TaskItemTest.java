import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;

class TaskItemTest {
    @Test
   public void creatingTaskItemFailsWithInvalidDueDate(){
     assertThrows(DateTimeException.class,() -> new TaskItem("rey", "", "2020-13-11",false));
    }
   @Test
    public void creatingTaskItemFailsWithInvalidTitle(){}

    @Test
    public void creatingTaskItemSucceedsWithValidDueDate(){}
    @Test
    public void creatingTaskItemSucceedsWithValidTitle(){}
    @Test
    public void settingTaskItemDueDateFailsWithInvalidDate(){}
    @Test
    public void settingTaskItemDueDateSucceedsWithValidDate(){}
    @Test
    public void settingTaskItemTitleFailsWithInvalidTitle(){}
    @Test
    public void  settingTaskItemTitleSucceedsWithValidTitle(){}

}
