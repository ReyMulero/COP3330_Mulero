import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TaskListTest {
    @Test
    addingTaskItemsIncreasesSize();

    completingTaskItemChangesStatus();
    completingTaskItemFailsWithInvalidIndex();
    editingTaskItemChangesValues();
    editingTaskItemDescriptionChangesValue();
    editingTaskItemDescriptionFailsWithInvalidIndex();
    editingTaskItemDueDateChangesValue();
    editingTaskItemDueDateFailsWithInvalidIndex();
    editingTaskItemTitleChangesValue();
    editingTaskItemTitleFailsWithInvalidIndex();
    gettingTaskItemDescriptionFailsWithInvalidIndex();
    gettingTaskItemDescriptionSucceedsWithValidIndex();
    gettingTaskItemDueDateFailsWithInvalidIndex();
    gettingTaskItemDueDateSucceedsWithValidIndex();
    gettingTaskItemTitleFailsWithInvalidIndex();
    gettingTaskItemTitleSucceedsWithValidIndex();
    newTaskListIsEmpty();
    removingTaskItemsDecreasesSize();
    removingTaskItemsFailsWithInvalidIndex();
    savedTaskListCanBeLoaded();
    uncompletingTaskItemChangesStatus();
    uncompletingTaskItemFailsWithInvalidIndex();

}