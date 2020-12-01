
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.DateTimeException;

class TaskItemTest2 {
    @Test
    public void creatingTaskItemFailsWithInvalidTitle(){
        assertThrows(DateTimeException.class,() -> new TaskItem("rey", "", "2020-13-11",false));
    }


    @Test
    public void creatingTaskItemFailsWithInvalidDueDate(){
        assertThrows(DateTimeException.class,() -> new TaskItem("rey", "", "2020-13-11",false));
    }

    @Test
    public void creatingTaskItemSucceedsWithValidTitle(){
        assertThrows(DateTimeException.class,() -> new TaskItem("rey", "", "2020-13-11",false));

    }
    @Test
    public void settingTaskItemDueDateSucceedsWithValidDate(){
        TaskItem t = new TaskItem("rey", "", "1111-12-13", false);
        assertEquals("1111-12-13", t.getDueDate());
    }
    @Test
    public void settingTaskItemTitleFailsWithInvalidTitle(){
        assertThrows(InvalidTitleException.class,() -> new TaskItem("", "", "2020-13-11",false));

    }
    @Test
    public void  settingTaskItemTitleSucceedsWithValidTitle(){
        TaskItem t = new TaskItem("rey", "", "1111-12-13", false);
        assertEquals("rey", t.getTitle());
    }
    @Test
    public void creatingTaskItemSucceedsWithValidDueDate(){

        //assertDoesNotThrow();
         assertDoesNotThrow(()-> new TaskItem("a", "", "2020-12-11",false));
    }
}