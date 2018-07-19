/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/7/19 22:25:04                           */
/*==============================================================*/


drop table if exists author;

drop index idx_author_id on book;

drop table if exists book;

drop index uk_oauth_id_oauth_type on oauth;

drop table if exists oauth;

drop index uk_book_id_ordered on section;

drop table if exists section;

drop table if exists section_content;

drop table if exists user;

/*==============================================================*/
/* Table: author                                                */
/*==============================================================*/
create table author
(
   id                   int unsigned not null auto_increment,
   name                 varchar(32) not null,
   intro                varchar(64) not null default "",
   gmt_create           timestamp not null default CURRENT_TIMESTAMP,
   gmt_modified         timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   primary key (id)
);

/*==============================================================*/
/* Table: book                                                  */
/*==============================================================*/
create table book
(
   id                   int unsigned not null auto_increment,
   name                 varchar(128) not null,
   author_id            int unsigned not null,
   author_name          varchar(32) not null,
   intro                varchar(256) not null,
   intro_detail         varchar(256) not null,
   gmt_create           timestamp not null default CURRENT_TIMESTAMP,
   gmt_modified         timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   primary key (id)
);

/*==============================================================*/
/* Index: idx_author_id                                         */
/*==============================================================*/
create index idx_author_id on book
(
   author_id
);

/*==============================================================*/
/* Table: oauth                                                 */
/*==============================================================*/
create table oauth
(
   id                   int unsigned not null auto_increment,
   user_id              int unsigned not null,
   oauth_type           tinyint unsigned not null,
   oauth_id             varchar(64) not null,
   oauth_token          varchar(64) not null,
   gmt_create           timestamp not null default CURRENT_TIMESTAMP,
   gmt_modified         timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   primary key (id)
);

/*==============================================================*/
/* Index: uk_oauth_id_oauth_type                                */
/*==============================================================*/
create unique index uk_oauth_id_oauth_type on oauth
(
   oauth_id,
   oauth_type
);

/*==============================================================*/
/* Table: section                                               */
/*==============================================================*/
create table section
(
   id                   int unsigned not null auto_increment,
   book_id              int unsigned not null,
   ordered              int unsigned not null,
   tag                  varchar(32),
   section_num          varchar(16) not null,
   section_name         varchar(64) not null,
   part_num             int unsigned not null default 0,
   part_name            varchar(64) not null default "",
   gmt_create           timestamp not null default CURRENT_TIMESTAMP,
   gmt_modified         timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   primary key (id)
);

/*==============================================================*/
/* Index: uk_book_id_ordered                                    */
/*==============================================================*/
create unique index uk_book_id_ordered on section
(
   book_id,
   ordered
);

/*==============================================================*/
/* Table: section_content                                       */
/*==============================================================*/
create table section_content
(
   section_id           int unsigned not null,
   content              text not null,
   gmt_create           timestamp not null default CURRENT_TIMESTAMP,
   gmt_modified         timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   primary key (section_id)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   int unsigned not null auto_increment,
   name                 varchar(32) not null,
   img_id               int unsigned not null,
   gmt_create           timestamp not null default CURRENT_TIMESTAMP,
   gmt_modified         timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   primary key (id)
);

