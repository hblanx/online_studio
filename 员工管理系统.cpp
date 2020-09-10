//#pragma warning(disable:4996)
#include<stdio.h>
#include <stdlib.h>
#include <string.h>

struct workers {
	char name[15];//姓名 
	char department[18];//单位 
	char gender;//性别 
	unsigned int age;//年龄 
	unsigned long telephone;//电话 
	unsigned long wage;//工资 
	unsigned long num;//员工号 
	struct workers* next;
};

struct sort {
	unsigned long wage;
	char Pname[15];
};
struct workers* head;
bool haveCreate = false;//标记是否创建链表 
int createOne() {//增加一个员工 
	static struct workers* p, * q;
	rewind(stdin);
	printf("请输入姓名:\n");
	char strName[15];//姓名 
	scanf("%s", &strName);
	rewind(stdin);
	//while(strName[i]!='\n'){
	//	i++;
	//	scanf("%c",&strName[i]);
	//}
	char strDepartment[18];//单位 
	printf("请输入单位:\n");
	scanf("%s", &strDepartment);
	rewind(stdin);
	char strGender;//性别 
	printf("请输入性别:\n");
	scanf("%c", &strGender);
	unsigned int intAge;//年龄 
	rewind(stdin);
	printf("请输入年龄:\n");
	scanf("%d", &intAge);
	unsigned long intTelephone;//电话 
	rewind(stdin);
	printf("请输入电话号码:\n");
	scanf("%d", &intTelephone);
	unsigned long intWage;//工资 
	rewind(stdin);
	printf("请输入工资:\n");
	scanf("%d", &intWage);
	unsigned long intNum;//员工号 
	rewind(stdin);
	printf("请输入工号:\n");
	scanf("%d", &intNum);
	q = (struct workers*)malloc(sizeof(struct workers));//分配空间？ 
	if (!haveCreate) {//第一次时建立第一个节点
		p = q;
		head = p;
		haveCreate = true;
		strcpy(p->name, strName);
		strcpy(p->department, strDepartment);
		p->gender = strGender;
		p->age = intAge;
		p->wage = intWage;
		p->telephone = intTelephone;
		p->num = intNum;
		p->next = NULL;
	}
	else {//第二个及以后节点
		strcpy(q->name, strName);
		strcpy(q->department, strDepartment);
		q->gender = strGender;
		q->age = intAge;
		q->wage = intWage;
		q->telephone = intTelephone;
		q->num = intNum;
		p->next = q;
		p = q;
		p->next = NULL;
	}
	return 0;
}
int watch() {//输出信息 
	struct workers* p;
	p = head;
	while (p != NULL)//单链表的最后一个节点的指针域是空的，以此判断单链表是否到达链尾，到达链尾，则跳出循环
	{
		printf("名字：%s\n", p->name);
		printf("部门：%s\n", p->department);
		printf("性别：%c\n", p->gender);
		printf("年龄：%d\n", p->age);
		printf("电话：%d\n", p->telephone);
		printf("工资：%d\n", p->wage);
		printf("编号：%d\n", p->num);
		p = p->next;//完成一个节点信息输出后，将下一个节点交给p，p指向下一个节点。
	}//通过循环，就将单链表遍历一次后，将储存的信息全部输出

	return 0;
}
int deleteOne() {//删除一个员工 
	char wantDelete[15];
	printf("输入要删除的人的名字\n");
	rewind(stdin);
	scanf("%s", &wantDelete);
	printf("将删除%s\n", wantDelete);
	struct workers* p, * q;
	p = head;
	q = p->next;
	if (strcmp(p->name, wantDelete) == 0) {//如果第一个就是的特殊情况
		head = p->next;
		printf("删除%s\n", p->name);
		free(p);
		return 0;
	}
	while (q != NULL) {
		//printf("目前%s=%s为%d\n",q->name,wantDelete,(q->name==wantDelete)?1:0);
		if (strcmp(q->name, wantDelete) == 0) {
			p->next = q->next;
			printf("删除%s\n", q->name);
			free(q);
			break;
		}
		else {
			q = q->next;
			p = p->next;
		}
	}
	return 0;
}
int changeOne() {//修改一个员工 
	char wantChange[15];
	int i;
	printf("输入要修改的人的名字");
	rewind(stdin);
	scanf("%s", &wantChange);
	printf("将修改%s\n", wantChange);
	struct workers* p;
	p = head;
	while (p != NULL) {
		if (strcmp(p->name, wantChange) == 0) {//特殊情况
			printf("1名字：%s\n", p->name);
			printf("2部门：%s\n", p->department);
			printf("3性别：%c\n", p->gender);
			printf("4年龄：%d\n", p->age);
			printf("5电话：%d\n", p->telephone);
			printf("6工资：%d\n", p->wage);
			printf("7编号：%d\n", p->num);
			printf("0取消\n");
			printf("输入需要的编号\n");
			scanf("%d", &i);
			switch (i) {
			case 0:return 0;
			case 1:scanf("%s", &p->name);break;
			case 2:scanf("%s", &p->department);break;
			case 3:scanf("%c", &p->gender);break;
			case 4:scanf("%d", &p->age);break;
			case 5:scanf("%d", &p->telephone);break;
			case 6:scanf("%d", &p->wage);break;
			case 7:scanf("%d", &p->num);break;
			}
			return 0;
		}
	}
}
int findOne() {//查找一个员工
	char wantFind[15];
	printf("输入要查找的人的名字\n");
	rewind(stdin);
	scanf("%s", &wantFind);
	printf("将查找%s\n", wantFind);
	struct workers* p;
	p = head;
	while (p != NULL) {
		if (strcmp(p->name, wantFind) == 0) {
			printf("名字：%s\n", p->name);
			printf("部门：%s\n", p->department);
			printf("性别：%c\n", p->gender);
			printf("年龄：%d\n", p->age);
			printf("电话：%d\n", p->telephone);
			printf("工资：%d\n", p->wage);
			printf("编号：%d\n", p->num);
			return 0;
			}
		p = p->next;
	}

	return 0;
}
int averageWage() {//显示平均工资
	unsigned long allWage = 0;
	int i = 0;
	struct workers* p;
	p = head;
	while (p != NULL)
	{
		allWage += p->wage;
		p = p->next;
		i += 1;
	}
	printf("平均工资:%f\n", (float)allWage / i);
	return 0;
}
int partition(struct sort R[],int s,int t){//快速排序划分
	int i = s, j = t;
	struct sort temp=R[i];
	while (i < j) {
		while (j > i && R[j].wage >= temp.wage)j--;
		R[i] = R[j];
		while (i < j && R[i].wage <= temp.wage)i++;
		R[j] = R[i];
	}
	R[i] = temp;
	//return指针方便点 
	return i;
}
void QuickSort(struct sort R[],int s,int t){//快速排序 
	int i;
	if(s<t){
		i=partition(R,s,t);
		QuickSort(R,s,i-1);
		QuickSort(R,i+1,t);
	}
}
int wageRange() {//排序输出主函数 
	struct workers* p;//先获得所有工资 
	struct sort R[99];
	int i = 0;
	p = head;
	while (p != NULL) {
		strcpy(R[i].Pname,p->name);
		R[i].wage=p->wage;
		i += 1;
		p = p->next;
	}
	if (i == 0) {
		printf("无数据！\n");
		return 0;
	}
	else if (i == 1) {
		printf("%s:%d\n", R[0].Pname, R[0].wage);
		return 0;
	}
	QuickSort(R,0,i-1);//开始给R[99]排序
	for(int j=i-1;j>=0;j--){
		printf("%s\n",R[j].Pname);
		printf("%d\n",R[j].wage);
	} 
}
int allInfo() {//信息二级菜单
	int i = 1;
	printf("---------\n");
	printf("1将工资排序输出\n");
	printf("2输出全部员工信息\n");
	printf("3显示平均工资\n");
	printf("0返回\n");
	scanf("%d", &i);
	//printf("%d",i);
	switch (i) {
	case 1:wageRange(); break;
	case 2:watch(); break;
	case 3:averageWage(); break;
	case 0:break;
	default:printf("输入错误\n");
	}
	return 0;
}
int main() {
	int i = 1;
	while (i) {
		printf("--------------\n");
		printf("输入数字继续\n");
		printf("1增加员工\n");
		printf("2删除员工\n");
		printf("3修改员工\n");
		printf("4查找员工\n");
		printf("5显示员工信息\n");
		printf("0退出\n");
		scanf("%d", &i);
		//printf("%d",i);
		switch (i) {
		case 1:createOne(); break;
		case 2:deleteOne(); break;
		case 3:changeOne(); break;
		case 4:findOne(); break;
		case 5:allInfo(); break;
		case 0:break;
		default:printf("输入错误\n");
		}
	}
	return 0;
}
