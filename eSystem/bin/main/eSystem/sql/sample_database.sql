DROP
    DATABASE IF EXISTS sample;
CREATE
    DATABASE sample DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_general_ci;
USE sample;


--
create table Department (
  DepartmentCode varchar(3),
  DepartmentName varchar(30),
  primary key(DepartmentCode)
);

--
create table Member (
  MemberCode varchar(6),
  Name varchar(40),
  Password varchar(15),
  Role varchar(15) default 'Employee',
  Mail varchar(100),
  ZipCode varchar(8),
  Prefecture varchar(16),
  Address varchar(100),
  Tel varchar(13),
  Years integer(2) default 0,
  DepartmentCode varchar(3) default 'A01',
  primary key(MemberCode)
);

--
insert into Department values ('A01','総務部');
insert into Department values ('B01','人事部');
insert into Department values ('C01','財務部');
insert into Department values ('D01','営業部');
insert into Department values ('E01','購買部');
insert into Department values ('F01','開発部');
insert into Department values ('G01','システム部');
insert into Department values ('H01','企画部');
insert into Department values ('I01','秘書室');
insert into Department values ('J01','社長室');

--
insert into Member values('100001','佐藤純子','pwd','Employee','j-satou@trainocate-os.co.jp',     '163-6019','東京都','新宿区西新宿','03-3347-9686',20,'A01');
insert into Member values('100002','鈴木伸和','pwd','Employee','n-suzuki@trainocate-os.co.jp',    '163-6019','東京都','新宿区西新宿','03-3347-9686',18,'B01');
insert into Member values('100003','高橋晶子','pwd','Employee','a-takahashi@trainocate-os.co.jp', '163-6019','東京都','新宿区西新宿','03-3347-9686',17,'C01');
insert into Member values('100004','田中秀幸','pwd','Employee','h-tanaka@trainocate-os.co.jp',    '163-6019','東京都','新宿区西新宿','03-3347-9686',15,'D01');
insert into Member values('100005','渡辺登　','pwd','Employee','n-watanabe@trainocate-os.co.jp',  '163-6019','東京都','新宿区西新宿','03-3347-9686',12,'E01');
insert into Member values('100006','伊藤佑　','pwd','Employee','t-itou@trainocate-os.co.jp',      '163-6019','東京都','新宿区西新宿','03-3347-9686',10,'F01');
insert into Member values('100007','山本美央','pwd','Employee','m-yamamoto@trainocate-os.co.jp',  '163-6019','東京都','新宿区西新宿','03-3347-9686',10,'G01');
insert into Member values('100008','中村光博','pwd','Employee','m-nakamura@trainocate-os.co.jp',  '163-6019','東京都','新宿区西新宿','03-3347-9686',10,'H01');
insert into Member values('100009','小林悟志','pwd','Employee','s-kobayashi@trainocate-os.co.jp', '163-6019','東京都','新宿区西新宿','03-3347-9686',10,'I01');
insert into Member values('900001','加藤孝　','pwd','Officer' ,'t-katou@trainocate-os.co.jp',     '163-6019','東京都','新宿区西新宿','03-3347-9686',25,'J01');
insert into Member values('A00001','吉田学　','pass','Part',   'm-yoshidau@aaa.com'         ,     '151-0064','東京都','渋谷区上原　','03-3347-1234'  ,3,'F01');
insert into Member values('A00002','山田郁子','pass','Part',   'i-yamada@aaa.ne.jp'       ,       '168-0082','東京都','杉並区久我山','03-9876-5432'  ,3,'I01');
insert into Member values('A00003','山口健二','pass','Part',   'k-yamaguchi@mephone.org'    ,     '158-0092','東京都','世田谷区野毛','03-3347-4455'  ,2,'G01');
insert into Member values('A00004','斉藤純也','pass','Part',   'j-saitou@aaa.com'     ,           '146-0083','東京都','大田区千鳥　','090-1111-2222' ,1,'F01');
insert into Member values('A00005','松本花子','pass','Part',   'h-matsumoto@aabbcc.co.jp'   ,     '350-1100','埼玉県','川越市　　　','090-3333-4444' ,1,'A01');
insert into Member values('A00006','井上正道','pass','Part',   'm-inoue@mephone.org'    ,         '170-0011','東京都','豊島区池袋　','03-1234-5678'  ,1,'B01');
insert into Member values('A00007','木村咲子','pass','Part',   's-kimura@aaa.ne.jp'    ,          '142-0041','東京都','品川区戸越　','070-5555-6666' ,1,'C01');
insert into Member values('A00008','清水清志','pass','Part',   'k-shimizu@aaa.com'     ,          '225-0011','神奈川','横浜市青葉区','045-123-456'   ,0,'D01');
insert into Member values('A00009','阿部亜紀','pass','Part',   'a-abe@abcde.ne.jp'      ,         '178-0062','東京都','練馬区大泉町','080-7777-8888' ,0,'E01');
insert into Member values('A00010','池田一郎','pass','Part',   'i-ikeda@mephone.org'  ,           '158-0097','東京都','世田谷区用賀','03-4321-9876'  ,0,'G01');
insert into Member values('A00011','山下和人','pass','Part',   'k-yamashita@aaabbbccc.ne.jp',     '216-0004','神奈川','川崎市宮前区','070-9876-5432' ,0,'H01');

commit;
