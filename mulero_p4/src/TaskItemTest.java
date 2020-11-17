import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskItemTest {
    @Test
    creatingTaskItemFailsWithInvalidDueDate();
    creatingTaskItemFailsWithInvalidTitle();
    creatingTaskItemSucceedsWithValidDueDate();
    creatingTaskItemSucceedsWithValidTitle();
    settingTaskItemDueDateFailsWithInvalidDate();
    settingTaskItemDueDateSucceedsWithValidDate();
    settingTaskItemTitleFailsWithInvalidTitle();
    settingTaskItemTitleSucceedsWithValidTitle();

}