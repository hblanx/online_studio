#include <stdio.h>
#include <stdlib.h>
#pragma warning(disable:4996)

//状态
struct INFO
{
	int nB[2];//村民,0在这边、1在那边
	int nS[2];//野人
	int nSide;
	struct INFO* pp;//上一节点
	struct INFO* pn;//下一节点
};

int index = 0;
int numpass = 0;
int num = 3;//初始村民、野人数
int maxShip = 2;//船运载数
struct INFO* head;

int safe(INFO *q) {//安全检查，不安全返回0，安全返回1
	//人数错误检查
	if (q->nB[0] < 0 || q->nS[0] < 0 || q->nB[1] < 0 || q->nS[1] < 0)
	{
		return 0;
	}
	//两岸传教士人数不少于野人
	if ((q->nB[0] < q->nS[0] && q->nB[0] != 0) || (q->nB[1] < q->nS[1] && q->nB[1] != 0))
	{
		return 0;
	}
	return 1;
}
int check(struct INFO* q) {//检查是否重复
	struct INFO* p = q;//p是当前需要判断是否重复的结构体
	q = q->pp;
	while (q != NULL)//向前翻，如果重复返回1
	{
		if (p->nB[0] == q->nB[0] &&  p->nS[0] == q->nS[0] && p->nB[1] == q->nB[1] && p->nS[1] == q->nS[1]) {
			//判断两岸数组内的值是否相等
			if (p->nSide==q->nSide) { return 1; }
		}
		q = q->pp;
	}
	return 0;
}
int watch(struct INFO *q) {
	INFO* p = (struct INFO*)malloc(sizeof(struct INFO));
	p = head;
	while (p != NULL) {
		printf("岸1传教士:%d\n", p->nB[0]);
		printf("岸1野人:%d\n", p->nS[0]);
		printf("岸2传教士:%d\n", p->nB[1]);
		printf("岸2野人:%d\n", p->nS[1]);
		printf("船位置:%d\n\n", p->nSide);
		p = p->pn;
	}
	return 0;
}
int aboard(INFO *q)
{
	//结束判断，如果结束打印结果
	if (q->nB[0] == 0 && q->nS[0] == 0)
	{
		static int ideas = 0;
		printf("----第%d种方法----\n",++ideas);
		watch(q);
		return 0;
	}
	if (check(q))return 0;//是否重复
	if (!safe(q))return 0;//空船、安全检查

	//p是新结构体，将要传下去
	INFO *p = (struct INFO*)malloc(sizeof(struct INFO));
	q->pn = p;
	for (int i = 0; i <= num && i <= maxShip; i++) {//传教士
		for (int j = 0; j <= num && i + j <= maxShip; j++) {//野人
			//空船检查
			if (i + j == 0)continue;
			p->nB[0] = q->nB[0] - i * q->nSide;
			p->nS[0] = q->nS[0] - j * q->nSide;
			p->nB[1] = q->nB[1] + i * q->nSide;
			p->nS[1] = q->nS[1] + j * q->nSide;
			p->nSide = (-q->nSide);
			p->pp = q;
			p->pn = NULL;
			aboard(p);
		}
	}
	return 0;
}

int main()
{
	head = (struct INFO*)malloc(sizeof(struct INFO));
	head->nB[0] = num;//初始化头节点
	head->nS[0] = num;
	head->nB[1] = 0;
	head->nS[1] = 0;
	head->nSide = 1;
	head->pp = NULL;
	head->pn = NULL;
	printf("start\n");
	aboard(head);
	return 0;
}
