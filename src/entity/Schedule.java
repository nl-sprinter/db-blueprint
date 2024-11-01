package entity;

import java.time.LocalDateTime;

public class Schedule {

    long id;

    // fk
    long projectId;

    // datetime은 10분단위
    LocalDateTime startTime;

    LocalDateTime endTime;

    String title;

    LocalDateTime notify;



}

/**
 * front
 * 데일리냐/아니냐
 */

/**
 * 일정테이블
 * id       projId      startDT       endDT           title        notifyWhen
 * 1        4           24.1.1:0:0    24.1.2:0:0      준혁생일       24.1.1:9:0:0
 * 2        4           24.1.2:0:0   24.1.3:0:0       시험          24.1.2.11:0:0
 * 3        4           24.1.2:0:0   24.1.3:0:0       시험          null
 *
 *
 */