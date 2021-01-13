#include <stdio.h>

void print(int a) {
	printf("==> %d\n", a);
}

void print(float f) {
	printf("==> %f\n", f);
}

int main(int argc, char* argv[]) {
    printf("Hello2!\n");
    print(100);
    print(3.14f);
}
