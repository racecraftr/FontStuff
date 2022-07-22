package com.racecraftr.font;

import java.util.HashMap;
import java.util.Map;

public class Letter {
    public static final Letter A = new Letter ('A', new int[]{14, 17, 17, 31, 17, 17,17});
    public static final Letter B = new Letter ('B', new int[]{15, 17, 17, 15, 17, 17,15});
    public static final Letter C = new Letter ('C', new int[]{31,  1,  1,  1,  1,  1, 31});
    public static final Letter D = new Letter ('D', new int[]{15, 17, 17, 17, 17, 17, 15});
    public static final Letter E = new Letter ('E', new int[]{31,  1,  1, 31,  1,  1, 31});
    public static final Letter F = new Letter ('F', new int[]{31,  1, 31,  1,  1,  1, 1});
    public static final Letter G = new Letter ('G', new int[]{31,  1,  1,  1, 29, 17, 31});
    public static final Letter H = new Letter ('H', new int[]{17, 17, 17, 31, 17, 17, 17});
    public static final Letter I = new Letter ('I', new int[]{31,  4,  4,  4,  4,  4, 31});
    public static final Letter J = new Letter ('J', new int[]{31,  4,  4,  4,  5,  5,  7 });
    public static final Letter K = new Letter ('K', new int[]{17,  9,  5,  3,  5,  9, 17 });
    public static final Letter L = new Letter ('L', new int[]{1,   1,  1,  1,  1,  1, 31});
    public static final Letter M = new Letter ('M', new int[]{17, 27, 21, 17, 17, 17, 17 });
    public static final Letter N = new Letter ('N', new int[]{17, 19, 21, 21, 25, 25, 17});
    public static final Letter O = new Letter ('O', new int[]{10, 17, 17, 17, 17, 17, 10});
    public static final Letter P = new Letter ('P', new int[]{9,  17,  9,  1,  1,  1,  1 });
    public static final Letter Q = new Letter ('Q', new int[]{15,  9,  9,  9, 13, 15, 16});
    public static final Letter R = new Letter ('R', new int[]{15, 17, 15,  3,  5,  9, 17});
    public static final Letter S = new Letter ('S', new int[]{31,  1,  1, 31, 16, 16, 31});
    public static final Letter T = new Letter ('T', new int[]{31, 31,  4,  4,  4,  4,  4,});
    public static final Letter U = new Letter ('U', new int[]{17, 17, 17, 17, 17, 17, 14});
    public static final Letter V = new Letter ('V', new int[]{17, 17, 10, 10, 10,  4,  4,});
    public static final Letter W = new Letter ('W', new int[]{17, 17, 17, 10, 14, 10, 10});
    public static final Letter X = new Letter ('X', new int[]{17, 10, 10,  4, 10, 10, 17});
    public static final Letter Y = new Letter ('Y', new int[]{17, 17, 10, 14,  4,  4,  4, });
    public static final Letter Z = new Letter ('Z', new int[]{31, 16,  8, 12,  4,  2, 31});

    public static final Letter a = new Letter ('a', new int[]{0, 0, 14, 16, 30, 17, 30});
    public static final Letter b = new Letter ('b', new int[]{1, 1,  1, 15, 17, 17, 15});
    public static final Letter c = new Letter ('c', new int[]{0, 0,  0, 30, 1, 1, 30});
    public static final Letter d = new Letter ('d', new int[]{16, 16, 16, 30 ,17, 17, 30});
    public static final Letter e = new Letter ('e', new int[]{0, 0, 14, 17, 31, 1, 30 });
    public static final Letter f = new Letter ('f', new int[]{28, 2, 31, 2, 2, 2, 2});
    public static final Letter g = new Letter ('g', new int[]{30, 17, 17, 30, 16, 16, 15});
    public static final Letter h = new Letter ('h', new int[]{1, 1, 1, 15, 17, 17, 17});
    public static final Letter i = new Letter ('i', new int[]{6, 6, 0, 6, 6, 6, 6});
    public static final Letter j = new Letter ('j', new int[]{12, 12, 0, 12, 12, 13, 15});
    public static final Letter k = new Letter ('k', new int[]{1, 1, 9, 5, 3, 5, 9});
    public static final Letter l = new Letter ('l', new int[]{4, 4, 4, 4, 4, 4, 4});
    public static final Letter m = new Letter ('m', new int[]{0, 0, 0,15, 21, 21, 21});
    public static final Letter n = new Letter ('n', new int[]{0, 0, 0, 15, 17, 17, 17});
    public static final Letter o = new Letter ('o', new int[]{0, 0, 14, 17, 17, 17, 14});
    public static final Letter p = new Letter ('p', new int[]{15, 17, 17, 15, 1, 1, 1});
    public static final Letter q = new Letter ('q', new int[]{30, 17, 17, 30, 16, 16, 16});
    public static final Letter r = new Letter ('r', new int[]{0, 0, 0, 25, 5, 1, 1});
    public static final Letter s = new Letter ('s', new int[]{0, 0, 30, 1, 30, 16, 15});
    public static final Letter t = new Letter ('t', new int[]{0, 0, 4, 31, 4, 4, 12});
    public static final Letter u = new Letter ('u', new int[]{0, 0, 17, 17, 17, 17, 30});
    public static final Letter v = new Letter ('v', new int[]{0, 0, 17, 17, 10, 10, 4});
    public static final Letter w = new Letter ('w', new int[]{0, 0, 17, 21, 10, 10, 10});
    public static final Letter x = new Letter ('x', new int[]{0, 0, 17, 10, 4, 10, 17});
    public static final Letter y = new Letter ('y', new int[]{0, 0, 17, 10, 4, 2, 1});
    public static final Letter z = new Letter ('z', new int[]{0, 0, 31, 8, 4, 2, 31});
    public static final Letter space = new Letter(' ', new int[]{0, 0, 0, 0, 0, 0, 0});

    public static final Letter period = new Letter('.', new int[] {0, 0, 0, 0, 0, 3, 3 });
    public static final Letter exclamation = new Letter('!', new int[] {14, 14, 14,4, 0, 14, 14 });
    public static final Letter question = new Letter('?', new int[] {14, 16, 16, 14, 2, 0, 2});
    public static final Letter hashtag = new Letter('#', new int[] {10, 10, 31, 10, 31, 10, 10});
    public static final Letter comma = new Letter(',', new int[] {0, 0, 0, 0, 0, 6, 2});
    public static final Letter apost = new Letter('\'', new int[] {6, 6, 0, 0, 0, 0, 0});
    public static final Letter fslash = new Letter('/', new int[] {16, 16, 8, 8, 4, 4, 2});
    public static final Letter bslash = new Letter('\\', new int[]{2, 4, 8, 16, 16});
    public static final Letter bar = new Letter('|', new int[]{8 ,8 ,8 ,8 ,8, 8, 8});
    public static final Letter dash = new Letter ('`',new int[]{1, 2, 0, 0, 0, 0, 0});
    public static final Letter tilda = new Letter ('~', new int[]{24, 9, 0, 0, 0, 0,0 });
    public static final Letter at = new Letter ('@', new int[]{6, 9, 25, 21, 29, 1, 18});

    public static final Map<Character, Letter> LETTER_MAP = new HashMap<>();
    static {
        LETTER_MAP.put('A', A);
        LETTER_MAP.put('B', B);
        LETTER_MAP.put('C', C);
        LETTER_MAP.put('D', D);
        LETTER_MAP.put('E', E);
        LETTER_MAP.put('F', F);
        LETTER_MAP.put('G', G);
        LETTER_MAP.put('H', H);
        LETTER_MAP.put('I', I);
        LETTER_MAP.put('J', J);
        LETTER_MAP.put('K', K);
        LETTER_MAP.put('L', L);
        LETTER_MAP.put('M', M);
        LETTER_MAP.put('N', N);
        LETTER_MAP.put('O', O);
        LETTER_MAP.put('P', P);
        LETTER_MAP.put('Q', Q);
        LETTER_MAP.put('R', R);
        LETTER_MAP.put('S', S);
        LETTER_MAP.put('T', T);
        LETTER_MAP.put('U', U);
        LETTER_MAP.put('V', V);
        LETTER_MAP.put('W', W);
        LETTER_MAP.put('X', X);
        LETTER_MAP.put('Y', Y);
        LETTER_MAP.put('Z', Z);
        LETTER_MAP.put('a', a);
        LETTER_MAP.put('b', b);
        LETTER_MAP.put('c', c);
        LETTER_MAP.put('d', d);
        LETTER_MAP.put('e', e);
        LETTER_MAP.put('f', f);
        LETTER_MAP.put('g', g);
        LETTER_MAP.put('h', h);
        LETTER_MAP.put('i', i);
        LETTER_MAP.put('j', j);
        LETTER_MAP.put('k', k);
        LETTER_MAP.put('l', l);
        LETTER_MAP.put('m', m);
        LETTER_MAP.put('n', n);
        LETTER_MAP.put('o', o);
        LETTER_MAP.put('p', p);
        LETTER_MAP.put('q', q);
        LETTER_MAP.put('r', r);
        LETTER_MAP.put('s', s);
        LETTER_MAP.put('t', t);
        LETTER_MAP.put('u', u);
        LETTER_MAP.put('v', v);
        LETTER_MAP.put('w', w);
        LETTER_MAP.put('x', x);
        LETTER_MAP.put('y', y);
        LETTER_MAP.put('z', z);
        LETTER_MAP.put(' ', space);
        LETTER_MAP.put('.',period);
        LETTER_MAP.put('!',exclamation);
        LETTER_MAP.put('?', question);
        LETTER_MAP.put('#', hashtag);
        LETTER_MAP.put(',', comma);
        LETTER_MAP.put('\'', apost);
        LETTER_MAP.put('/', fslash);
        LETTER_MAP.put('\\', bslash);
        LETTER_MAP.put('@', at);
        LETTER_MAP.put('|', bar);
        LETTER_MAP.put('~', tilda);
        LETTER_MAP.put('`', dash);
    }

    public static final int ROWS = 7;

    private final int[] spec;
    private final char letterType;

    private Letter(char letterType, int[] spec) {
        this.letterType = letterType;
        this.spec = spec;
    }

    public void printLetter() {
        for (int i = 0; i < spec.length; i++) {
            System.out.print(getRow(i));
            System.out.println();
        }
    }

    public String getRow(int row) {
        int i = spec[row];
        char[] line = new char[6];
        for (int j = 0; j < 5; j++) {
            line[j] = (((i >> j) & 1) == 0 ? ' ': letterType); //get binary digits: 0 -> ' ': 1 -> letterType
        }
        line[5] = ' ';
        return new String(line);
    }


}
