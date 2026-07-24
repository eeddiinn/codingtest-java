#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    if ( 0 < n % 7 && n % 7 <= 6)
        return n / 7 + 1;
    else
        return n / 7;
}