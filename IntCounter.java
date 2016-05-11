class IntCounter {

public static void intCounter(int number, int largo) {
int numberFull=(number*2)+1;
int spaceFull=largo-numberFull;
int space=spaceFull/2;
for (int a=1;a<=space;++a)
	{System.out.print(" ");}
for (int x=0;x<=number;x++)
	{System.out.print(x);}
for (int y=number-1;y>=0;y--)
	{System.out.print(y);}
for (int b=1;b<=space;++b)
	{System.out.print(" ");}
}
}