package entity;

import java.time.LocalDate;
import java.util.List;

public class Sprint {

    Long sprintId;

    Long sprintOrder;

    LocalDate startDate;
    LocalDate endDate;

    List<SprintBacklog> sprintBacklogs;

    List<DailyScrum> dailyScrums;
}
