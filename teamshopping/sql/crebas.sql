/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/8/6/÷‹“ª 14:24:27                         */
/*==============================================================*/


drop table if exists help;

drop table if exists journalism;

drop table if exists user_address;

drop table if exists user_administrators;

drop table if exists user_area;

drop table if exists user_city;

drop table if exists user_convertibility;

drop table if exists user_integral;

drop table if exists user_luckdraw;

drop table if exists user_member;

drop table if exists user_order;

drop table if exists user_prize;

drop table if exists user_province;

drop table if exists worknumber;

/*==============================================================*/
/* Table: help                                                  */
/*==============================================================*/
create table help
(
   help_id              int not null auto_increment,
   help_step            varchar(5) not null,
   help_content         varchar(200) not null,
   help_picture         blob not null,
   primary key (help_id)
);

/*==============================================================*/
/* Table: journalism                                            */
/*==============================================================*/
create table journalism
(
   journalism_id        int not null auto_increment,
   journalism_title     varchar(20) not null,
   journalism_article   varchar(400) not null,
   journalism_picture   blob not null,
   primary key (journalism_id)
);


/*==============================================================*/
/* Table: user_address                                          */
/*==============================================================*/
create table user_address
(
   u_address_id         int not null auto_increment,
   u_address_province   varchar(8) not null,
   u_address_city       varchar(11) not null,
   u_address_area       varchar(10) not null,
   u_address_detailed   varchar(50) not null,
   u_address_mid        int not null,
   primary key (u_address_id)
);

/*==============================================================*/
/* Table: user_administrators                                   */
/*==============================================================*/
create table user_administrators
(
   u_administrators     int not null auto_increment,
   u_administrators_name varchar(20) not null,
   u_administrators_pwd varchar(16) not null,
   u_administrators_realname varchar(8) not null,
   u_administrators_phone int not null,
   u_administrators_work char(11) not null,
   primary key (u_administrators)
);

/*==============================================================*/
/* Table: user_area                                             */
/*==============================================================*/
create table user_area
(
   u_area_id            int,
   u_area_name          varchar(10),
   u_area_cid           int
);

/*==============================================================*/
/* Table: user_city                                             */
/*==============================================================*/
create table user_city
(
   u_city_id            int,
   u_city_name          varchar(11),
   u_city_pid           int
);

/*==============================================================*/
/* Table: user_convertibility                                   */
/*==============================================================*/
create table user_convertibility
(
   u_convertibility_id  int not null auto_increment,
   u_convertibility_name varchar(20) not null,
   u_convertibility_effect varchar(25) not null,
   u_convertibility_uid int not null,
   primary key (u_convertibility_id)
);

/*==============================================================*/
/* Table: user_integral                                         */
/*==============================================================*/
create table user_integral
(
   u_integral_id        int not null auto_increment,
   u_integral_name      varchar(20) not null,
   u_integral_number    int not null,
   u_integral_state     varchar(10),
   primary key (u_integral_id)
);

/*==============================================================*/
/* Table: user_luckdraw                                         */
/*==============================================================*/
create table user_luckdraw
(
   u_luckdraw_id        int not null auto_increment,
   u_luckdraw_mid       int,
   u_luckdraw_pid       int,
   primary key (u_luckdraw_id)
);

/*==============================================================*/
/* Table: user_member                                           */
/*==============================================================*/
create table user_member
(
   u_member_id          int not null,
   u_member_name        varchar(20) not null,
   u_member_pwd         char(16) not null,
   u_member_reale       varchar(8),
   u_member_sex         bit(1),
   u_member_image       BLOB,
   u_member_phone       integer,
   u_member_email       char(32),
   u_member_integral    integer,
   u_member_pid    			int,
   u_member_cid        	int,
   u_member_aid        	int,
   primary key (u_member_id)
);

/*==============================================================*/
/* Table: user_order                                            */
/*==============================================================*/
create table user_order
(
   u_order_id           int,
   u_order_number       varchar(15),
   u_order_time         date,
   u_order_mode         varchar(8),
   u_order_business     varchar(10),
   u_order_member       varchar(10),
   u_order_businessname varchar(20),
   u_order_price        double
);

/*==============================================================*/
/* Table: user_prize                                            */
/*==============================================================*/
create table user_prize
(
   s_prize_id           int not null auto_increment,
   s_prize_name         varchar(20) not null,
   s_prize_remarks      varchar(50) not null,
   primary key (s_prize_id)
);

/*==============================================================*/
/* Table: user_province                                         */
/*==============================================================*/
create table user_province
(
   u_province_id        int,
   u_province_name      varchar(8)
);

/*==============================================================*/
/* Table: worknumber                                            */
/*==============================================================*/
create table worknumber
(
   worknumber_id        int not null auto_increment,
   worknumber_number    char(11),
   primary key (worknumber_id)
);

alter table user_address add constraint FK_address foreign key (u_address_mid)
      references user_member (u_member_id) on delete restrict on update restrict;

alter table user_convertibility add constraint FK_convertibility foreign key (u_convertibility_uid)
      references user_member (u_member_id) on delete restrict on update restrict;
alter table user_member add constraint FK_user_province foreign key (u_member_pid)
      references user_province (u_province_id) on delete restrict on update restrict;

alter table user_member add constraint FK_city foreign key (u_member_cid)
      references user_city (u_city_id) on delete restrict on update restrict;

alter table user_member add constraint FK_area foreign key (u_member_aid)
      references user_area (u_area_id) on delete restrict on update restrict;




