-- 用户角色 多对多
create table accountRefRole
(
	roleId int ,
	accountId int ,
	constraint accountRefRole_pk
		primary key (roleId,accountId),
	constraint accountRefRole_fk_roleId
        foreign key (roleid) references role(id),
    constraint accountRefRole_fk_accountId
        foreign key (accountId) references account(id)
);

create table roleRefPermission
(
	roleId int ,
	permissionId int ,
	constraint roleRefPermission_pk
		primary key (roleId,permissionId),
	constraint roleRefPermission_fk_roleId
        foreign key (roleid) references role(id),
    constraint roleRefPermission_fk_permissionId
        foreign key (permissionId) references permission(id)
);


