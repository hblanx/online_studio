// ConsoleApplication1.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
//#pragma warning(disable:4996)
#include<stdio.h>
#include <stdlib.h>
#include <string.h>


struct INFO {
	int nS[2];//岸上野人数,0时为岸这边，1时为岸那边
	int nB[2];//村民数 
	int nSide;//船的位置 0为这，1为那 
	INFO* pp;//上一节点 
	INFO* pn;//下一节点 
};
int num = 3;//村民/野人数
int shipMax = 2;//船运载数 
struct INFO* head;
bool end = false;//是否结束
int copy(struct INFO* p, struct INFO* q) {//初始化后一个指针q
	q->nB[0] = p->nB[0];
	q->nS[0] = p->nS[0];
	q->nB[1] = p->nB[1];
	q->nS[1] = p->nS[1];
	q->nSide = p->nSide;
	q->pn = NULL;
	q->pp = p;
	p->pn = q;
	return 0;
}
int check(struct INFO* q) {//检查是否重复，重复时返回1
	struct INFO* p = q;//p是当前需要判断是否重复的结构体
	q = q->pp;
	while (q != NULL)//向前翻
	{
		if (p->nB[0] == q->nB[0] && p->nS[0] == q->nS[0]) {
			//判断两岸变量、船位置是否完全相等
			if(p->nSide==q->nSide)return 1;
		}
		q = q->pp;
	}
	return 0;
}
int safe(struct INFO* q) {//安全性检查 无空船判断
	int isSafe = 1;//安全返回1
	//人数不为0时判断传教士安全
	if (q->nB[0]!=0 && q->nS[0] > q->nB[0])isSafe = 0;
	if (q->nB[1]!=0 && q->nS[1] > q->nB[1])isSafe = 0;
	return isSafe;
}
int aboard(struct INFO* q) {
	if (q->nB[0] + q->nS[0] == 0) {
		end = true;//胜利判断
		return 0;
	}
	int other;
	struct INFO* p = (struct INFO*)malloc(sizeof(struct INFO));//分配空间,船位置改变
	copy(q, p);//p是要传下去的新结构体，q是传来时的最终结构体
	for (int ms = 0; ms <= q->nS[q->nSide] && ms <= shipMax; ms++) {//野人
		for (int mb = 0; mb <= q->nB[q->nSide] && mb + ms <= shipMax; mb++) {//村民
			if (ms + mb == 0)continue;//检查空船
			//假设船到达对岸,船位置实际在上一函数时改变了
			p->nB[p->nSide] = q->nB[p->nSide] - mb;//p的nside岸上人数=开始时nside岸上人数-移动人数
			p->nS[p->nSide] = q->nS[p->nSide] - ms;
			other = p->nSide == 0 ? other = 1 : other = 0;//other为nside的对立岸
			p->nB[other] = q->nB[other] + mb;//p的other岸上人数=开始时other岸上人数+移动人数
			p->nS[other] = q->nS[other] + ms;
			if (safe(p)) {//检查安全
				q->nSide == 1 ? p->nSide = 0 : p->nSide = 1;//船移动,如果船没动，在for循环结束后变回来
				if (check(q))continue;
				aboard(p);
				if(end){return 0;}
			}
		}
	}
	if (!end) {//如果无结果，则阻止for循环中的p->nSide改变
		q->nSide == 1 ? q->nSide = 0 : q->nSide = 1;
		free(p);
		q->pn = NULL;
	}
	return 0;
}
int watch() {//输出信息 
	struct INFO* p;
	p = head;
	while (p != NULL)//单链表的最后一个节点的指针域是空的，以此判断单链表是否到达链尾，到达链尾，则跳出循环
	{
		printf("岸1野人数：%d\n", p->nS[0]);
		printf("岸1村民数：%d\n", p->nB[0]);
		printf("岸2村民数：%d\n", p->nB[1]);
		printf("岸2野人数：%d\n", p->nS[1]);
		printf("船将移动到：%d\n", p->nSide);
		p = p->pn;//完成一个节点信息输出后，将下一个节点交给p，p指向下一个节点。
	}
	printf("end：%d\n", end);
	return 0;
}
int main() {
	head = (struct INFO*)malloc(sizeof(struct INFO));
	head->nS[0] = num;//岸上野人数
	head->nB[0] = num;//村民数 
	head->nS[1] = 0;//岸那边初始为0人
	head->nB[1] = 0;
	head->nSide = 0;//船的位置 0为这，1为那 
	head->pp = NULL;//上一节点 
	head->pn = NULL;//下一节点 
	printf("start\n");
	aboard(head);
	watch();
	getchar();
	return 0;
}
